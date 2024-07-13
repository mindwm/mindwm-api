{-# LANGUAGE CPP #-}
{-# OPTIONS_GHC -fno-warn-unused-imports -fno-warn-unused-matches #-}

module Instances where

import Mindwm.Model
import Mindwm.Core

import qualified Data.Aeson as A
import qualified Data.ByteString.Lazy as BL
import qualified Data.HashMap.Strict as HM
import qualified Data.Set as Set
import qualified Data.Text as T
import qualified Data.Time as TI
import qualified Data.Vector as V
import Data.String (fromString)

import Control.Monad
import Data.Char (isSpace)
import Data.List (sort)
import Test.QuickCheck

import ApproxEq

instance Arbitrary T.Text where
  arbitrary = T.pack <$> arbitrary

instance Arbitrary TI.Day where
  arbitrary = TI.ModifiedJulianDay . (2000 +) <$> arbitrary
  shrink = (TI.ModifiedJulianDay <$>) . shrink . TI.toModifiedJulianDay

instance Arbitrary TI.UTCTime where
  arbitrary =
    TI.UTCTime <$> arbitrary <*> (TI.secondsToDiffTime <$> choose (0, 86401))

instance Arbitrary BL.ByteString where
    arbitrary = BL.pack <$> arbitrary
    shrink xs = BL.pack <$> shrink (BL.unpack xs)

instance Arbitrary ByteArray where
    arbitrary = ByteArray <$> arbitrary
    shrink (ByteArray xs) = ByteArray <$> shrink xs

instance Arbitrary Binary where
    arbitrary = Binary <$> arbitrary
    shrink (Binary xs) = Binary <$> shrink xs

instance Arbitrary DateTime where
    arbitrary = DateTime <$> arbitrary
    shrink (DateTime xs) = DateTime <$> shrink xs

instance Arbitrary Date where
    arbitrary = Date <$> arbitrary
    shrink (Date xs) = Date <$> shrink xs

#if MIN_VERSION_aeson(2,0,0)
#else
-- | A naive Arbitrary instance for A.Value:
instance Arbitrary A.Value where
  arbitrary = arbitraryValue
#endif

arbitraryValue :: Gen A.Value
arbitraryValue =
  frequency [(3, simpleTypes), (1, arrayTypes), (1, objectTypes)]
    where
      simpleTypes :: Gen A.Value
      simpleTypes =
        frequency
          [ (1, return A.Null)
          , (2, liftM A.Bool (arbitrary :: Gen Bool))
          , (2, liftM (A.Number . fromIntegral) (arbitrary :: Gen Int))
          , (2, liftM (A.String . T.pack) (arbitrary :: Gen String))
          ]
      mapF (k, v) = (fromString k, v)
      simpleAndArrays = frequency [(1, sized sizedArray), (4, simpleTypes)]
      arrayTypes = sized sizedArray
      objectTypes = sized sizedObject
      sizedArray n = liftM (A.Array . V.fromList) $ replicateM n simpleTypes
      sizedObject n =
        liftM (A.object . map mapF) $
        replicateM n $ (,) <$> (arbitrary :: Gen String) <*> simpleAndArrays

-- | Checks if a given list has no duplicates in _O(n log n)_.
hasNoDups
  :: (Ord a)
  => [a] -> Bool
hasNoDups = go Set.empty
  where
    go _ [] = True
    go s (x:xs)
      | s' <- Set.insert x s
      , Set.size s' > Set.size s = go s' xs
      | otherwise = False

instance ApproxEq TI.Day where
  (=~) = (==)

arbitraryReduced :: Arbitrary a => Int -> Gen a
arbitraryReduced n = resize (n `div` 2) arbitrary

arbitraryReducedMaybe :: Arbitrary a => Int -> Gen (Maybe a)
arbitraryReducedMaybe 0 = elements [Nothing]
arbitraryReducedMaybe n = arbitraryReduced n

arbitraryReducedMaybeValue :: Int -> Gen (Maybe A.Value)
arbitraryReducedMaybeValue 0 = elements [Nothing]
arbitraryReducedMaybeValue n = do
  generated <- arbitraryReduced n
  if generated == Just A.Null
    then return Nothing
    else return generated

-- * Models

instance Arbitrary Clipboard where
  arbitrary = sized genClipboard

genClipboard :: Int -> Gen Clipboard
genClipboard n =
  Clipboard
    <$> arbitraryReducedMaybe n -- clipboardType :: Maybe Text
    <*> arbitraryReducedMaybe n -- clipboardSource :: Maybe Text
    <*> arbitraryReducedMaybe n -- clipboardData :: Maybe ClipboardPayload
    <*> arbitrary -- clipboardId :: Text
    <*> arbitrary -- clipboardSpecversion :: Text
    <*> arbitraryReducedMaybe n -- clipboardDatacontenttype :: Maybe Text
    <*> arbitraryReducedMaybe n -- clipboardDataschema :: Maybe Text
    <*> arbitraryReducedMaybe n -- clipboardSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- clipboardTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- clipboardDataBase64 :: Maybe Text
  
instance Arbitrary ClipboardPayload where
  arbitrary = sized genClipboardPayload

genClipboardPayload :: Int -> Gen ClipboardPayload
genClipboardPayload n =
  ClipboardPayload
    <$> arbitraryReducedMaybe n -- clipboardPayloadStart :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- clipboardPayloadStop :: Maybe [Int]
    <*> arbitraryReducedMaybe n -- clipboardPayloadData :: Maybe Text
    <*> arbitraryReducedMaybe n -- clipboardPayloadType :: Maybe E'Type
    <*> arbitraryReducedMaybe n -- clipboardPayloadContext :: Maybe ClipboardPayloadContext
  
instance Arbitrary ClipboardPayloadContext where
  arbitrary = sized genClipboardPayloadContext

genClipboardPayloadContext :: Int -> Gen ClipboardPayloadContext
genClipboardPayloadContext n =
  ClipboardPayloadContext
    <$> arbitraryReducedMaybe n -- clipboardPayloadContextWindow :: Maybe Text
  
instance Arbitrary CloudEvent where
  arbitrary = sized genCloudEvent

genCloudEvent :: Int -> Gen CloudEvent
genCloudEvent n =
  CloudEvent
    <$> arbitrary -- cloudEventId :: Text
    <*> arbitrary -- cloudEventSource :: Text
    <*> arbitrary -- cloudEventSpecversion :: Text
    <*> arbitrary -- cloudEventType :: Text
    <*> arbitraryReducedMaybe n -- cloudEventDatacontenttype :: Maybe Text
    <*> arbitraryReducedMaybe n -- cloudEventDataschema :: Maybe Text
    <*> arbitraryReducedMaybe n -- cloudEventSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- cloudEventTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- cloudEventData :: Maybe CloudEventData
    <*> arbitraryReducedMaybe n -- cloudEventDataBase64 :: Maybe Text
  
instance Arbitrary CloudEventData where
  arbitrary = sized genCloudEventData

genCloudEventData :: Int -> Gen CloudEventData
genCloudEventData n =
  
  pure CloudEventData
   
instance Arbitrary GraphNode where
  arbitrary = sized genGraphNode

genGraphNode :: Int -> Gen GraphNode
genGraphNode n =
  GraphNode
    <$> arbitrary -- graphNodeId :: Text
    <*> arbitrary -- graphNodeSource :: E'Source
    <*> arbitrary -- graphNodeSpecversion :: Text
    <*> arbitrary -- graphNodeType :: E'Type2
    <*> arbitraryReducedMaybe n -- graphNodeDatacontenttype :: Maybe Text
    <*> arbitraryReducedMaybe n -- graphNodeDataschema :: Maybe Text
    <*> arbitraryReducedMaybe n -- graphNodeSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- graphNodeTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- graphNodeData :: Maybe GraphNodeAllOfData
    <*> arbitraryReducedMaybe n -- graphNodeDataBase64 :: Maybe Text
  
instance Arbitrary GraphNodeAllOfData where
  arbitrary = sized genGraphNodeAllOfData

genGraphNodeAllOfData :: Int -> Gen GraphNodeAllOfData
genGraphNodeAllOfData n =
  GraphNodeAllOfData
    <$> arbitraryReduced n -- graphNodeAllOfDataHeaders :: A.Value
    <*> arbitrary -- graphNodeAllOfDataMessageKey :: Text
    <*> arbitraryReduced n -- graphNodeAllOfDataMeta :: Neo4jCaptureDataChangeMeta
    <*> arbitrary -- graphNodeAllOfDataOffset :: Int
    <*> arbitrary -- graphNodeAllOfDataPartition :: Int
    <*> arbitrary -- graphNodeAllOfDataSourceType :: Text
    <*> arbitraryReduced n -- graphNodeAllOfDataTimestamp :: DateTime
    <*> arbitrary -- graphNodeAllOfDataTopic :: Text
    <*> arbitraryReduced n -- graphNodeAllOfDataSchema :: Neo4jCaptureDataChangeSchema
    <*> arbitraryReduced n -- graphNodeAllOfDataPayload :: Neo4jCaptureDataChangeNodePayload
  
instance Arbitrary GraphRelationship where
  arbitrary = sized genGraphRelationship

genGraphRelationship :: Int -> Gen GraphRelationship
genGraphRelationship n =
  GraphRelationship
    <$> arbitrary -- graphRelationshipId :: Text
    <*> arbitrary -- graphRelationshipSource :: E'Source2
    <*> arbitrary -- graphRelationshipSpecversion :: Text
    <*> arbitrary -- graphRelationshipType :: E'Type2
    <*> arbitraryReducedMaybe n -- graphRelationshipDatacontenttype :: Maybe Text
    <*> arbitraryReducedMaybe n -- graphRelationshipDataschema :: Maybe Text
    <*> arbitraryReducedMaybe n -- graphRelationshipSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- graphRelationshipTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- graphRelationshipData :: Maybe GraphRelationshipAllOfData
    <*> arbitraryReducedMaybe n -- graphRelationshipDataBase64 :: Maybe Text
  
instance Arbitrary GraphRelationshipAllOfData where
  arbitrary = sized genGraphRelationshipAllOfData

genGraphRelationshipAllOfData :: Int -> Gen GraphRelationshipAllOfData
genGraphRelationshipAllOfData n =
  GraphRelationshipAllOfData
    <$> arbitraryReduced n -- graphRelationshipAllOfDataHeaders :: A.Value
    <*> arbitrary -- graphRelationshipAllOfDataMessageKey :: Text
    <*> arbitraryReduced n -- graphRelationshipAllOfDataMeta :: Neo4jCaptureDataChangeMeta
    <*> arbitrary -- graphRelationshipAllOfDataOffset :: Int
    <*> arbitrary -- graphRelationshipAllOfDataPartition :: Int
    <*> arbitrary -- graphRelationshipAllOfDataSourceType :: Text
    <*> arbitraryReduced n -- graphRelationshipAllOfDataTimestamp :: DateTime
    <*> arbitrary -- graphRelationshipAllOfDataTopic :: Text
    <*> arbitraryReduced n -- graphRelationshipAllOfDataSchema :: Neo4jCaptureDataChangeSchema
    <*> arbitraryReduced n -- graphRelationshipAllOfDataPayload :: Neo4jCaptureDataChangeRelationshipPayload
  
instance Arbitrary IoDocument where
  arbitrary = sized genIoDocument

genIoDocument :: Int -> Gen IoDocument
genIoDocument n =
  IoDocument
    <$> arbitraryReducedMaybe n -- ioDocumentType :: Maybe Text
    <*> arbitraryReducedMaybe n -- ioDocumentSource :: Maybe Text
    <*> arbitraryReducedMaybe n -- ioDocumentData :: Maybe TmuxPaneIoDocument
    <*> arbitrary -- ioDocumentId :: Text
    <*> arbitrary -- ioDocumentSpecversion :: Text
    <*> arbitraryReducedMaybe n -- ioDocumentDatacontenttype :: Maybe Text
    <*> arbitraryReducedMaybe n -- ioDocumentDataschema :: Maybe Text
    <*> arbitraryReducedMaybe n -- ioDocumentSubject :: Maybe Text
    <*> arbitraryReducedMaybe n -- ioDocumentTime :: Maybe DateTime
    <*> arbitraryReducedMaybe n -- ioDocumentDataBase64 :: Maybe Text
  
instance Arbitrary Neo4jCaptureDataChange where
  arbitrary = sized genNeo4jCaptureDataChange

genNeo4jCaptureDataChange :: Int -> Gen Neo4jCaptureDataChange
genNeo4jCaptureDataChange n =
  Neo4jCaptureDataChange
    <$> arbitraryReduced n -- neo4jCaptureDataChangeHeaders :: (Map.Map String AnyType)
    <*> arbitrary -- neo4jCaptureDataChangeMessageKey :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeMeta :: Neo4jCaptureDataChangeMeta
    <*> arbitrary -- neo4jCaptureDataChangeOffset :: Int
    <*> arbitrary -- neo4jCaptureDataChangePartition :: Int
    <*> arbitrary -- neo4jCaptureDataChangeSourceType :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeTimestamp :: DateTime
    <*> arbitrary -- neo4jCaptureDataChangeTopic :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeSchema :: Neo4jCaptureDataChangeSchema
    <*> arbitraryReduced n -- neo4jCaptureDataChangePayload :: Neo4jCaptureDataChangePayload
  
instance Arbitrary Neo4jCaptureDataChangeMeta where
  arbitrary = sized genNeo4jCaptureDataChangeMeta

genNeo4jCaptureDataChangeMeta :: Int -> Gen Neo4jCaptureDataChangeMeta
genNeo4jCaptureDataChangeMeta n =
  Neo4jCaptureDataChangeMeta
    <$> arbitrary -- neo4jCaptureDataChangeMetaOperation :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeMetaSource :: Neo4jCaptureDataChangeMetaSource
    <*> arbitrary -- neo4jCaptureDataChangeMetaTimestamp :: Int
    <*> arbitrary -- neo4jCaptureDataChangeMetaTxEventId :: Int
    <*> arbitrary -- neo4jCaptureDataChangeMetaTxEventsCount :: Int
    <*> arbitrary -- neo4jCaptureDataChangeMetaTxId :: Int
    <*> arbitrary -- neo4jCaptureDataChangeMetaUsername :: Text
  
instance Arbitrary Neo4jCaptureDataChangeMetaSource where
  arbitrary = sized genNeo4jCaptureDataChangeMetaSource

genNeo4jCaptureDataChangeMetaSource :: Int -> Gen Neo4jCaptureDataChangeMetaSource
genNeo4jCaptureDataChangeMetaSource n =
  Neo4jCaptureDataChangeMetaSource
    <$> arbitrary -- neo4jCaptureDataChangeMetaSourceHostname :: Text
  
instance Arbitrary Neo4jCaptureDataChangeNodePayload where
  arbitrary = sized genNeo4jCaptureDataChangeNodePayload

genNeo4jCaptureDataChangeNodePayload :: Int -> Gen Neo4jCaptureDataChangeNodePayload
genNeo4jCaptureDataChangeNodePayload n =
  Neo4jCaptureDataChangeNodePayload
    <$> arbitraryReduced n -- neo4jCaptureDataChangeNodePayloadAfter :: Neo4jCaptureDataChangeNodePayloadAfter
    <*> arbitrary -- neo4jCaptureDataChangeNodePayloadBefore :: Text
    <*> arbitrary -- neo4jCaptureDataChangeNodePayloadId :: Text
    <*> arbitrary -- neo4jCaptureDataChangeNodePayloadType :: Text
  
instance Arbitrary Neo4jCaptureDataChangeNodePayloadAfter where
  arbitrary = sized genNeo4jCaptureDataChangeNodePayloadAfter

genNeo4jCaptureDataChangeNodePayloadAfter :: Int -> Gen Neo4jCaptureDataChangeNodePayloadAfter
genNeo4jCaptureDataChangeNodePayloadAfter n =
  Neo4jCaptureDataChangeNodePayloadAfter
    <$> arbitrary -- neo4jCaptureDataChangeNodePayloadAfterLabels :: [Text]
    <*> arbitraryReduced n -- neo4jCaptureDataChangeNodePayloadAfterProperties :: (Map.Map String AnyType)
  
instance Arbitrary Neo4jCaptureDataChangePayload where
  arbitrary = sized genNeo4jCaptureDataChangePayload

genNeo4jCaptureDataChangePayload :: Int -> Gen Neo4jCaptureDataChangePayload
genNeo4jCaptureDataChangePayload n =
  Neo4jCaptureDataChangePayload
    <$> arbitraryReduced n -- neo4jCaptureDataChangePayloadAfter :: A.Value
    <*> arbitrary -- neo4jCaptureDataChangePayloadBefore :: Text
    <*> arbitrary -- neo4jCaptureDataChangePayloadId :: Text
    <*> arbitrary -- neo4jCaptureDataChangePayloadType :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangePayloadEnd :: Neo4jCaptureDataChangeRelationshipPayloadEnd
    <*> arbitrary -- neo4jCaptureDataChangePayloadLabel :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangePayloadStart :: Neo4jCaptureDataChangeRelationshipPayloadEnd
  
instance Arbitrary Neo4jCaptureDataChangeRelationshipPayload where
  arbitrary = sized genNeo4jCaptureDataChangeRelationshipPayload

genNeo4jCaptureDataChangeRelationshipPayload :: Int -> Gen Neo4jCaptureDataChangeRelationshipPayload
genNeo4jCaptureDataChangeRelationshipPayload n =
  Neo4jCaptureDataChangeRelationshipPayload
    <$> arbitraryReduced n -- neo4jCaptureDataChangeRelationshipPayloadAfter :: A.Value
    <*> arbitrary -- neo4jCaptureDataChangeRelationshipPayloadBefore :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeRelationshipPayloadEnd :: Neo4jCaptureDataChangeRelationshipPayloadEnd
    <*> arbitrary -- neo4jCaptureDataChangeRelationshipPayloadId :: Text
    <*> arbitrary -- neo4jCaptureDataChangeRelationshipPayloadLabel :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeRelationshipPayloadStart :: Neo4jCaptureDataChangeRelationshipPayloadEnd
    <*> arbitrary -- neo4jCaptureDataChangeRelationshipPayloadType :: Text
  
instance Arbitrary Neo4jCaptureDataChangeRelationshipPayloadEnd where
  arbitrary = sized genNeo4jCaptureDataChangeRelationshipPayloadEnd

genNeo4jCaptureDataChangeRelationshipPayloadEnd :: Int -> Gen Neo4jCaptureDataChangeRelationshipPayloadEnd
genNeo4jCaptureDataChangeRelationshipPayloadEnd n =
  Neo4jCaptureDataChangeRelationshipPayloadEnd
    <$> arbitrary -- neo4jCaptureDataChangeRelationshipPayloadEndId :: Text
    <*> arbitraryReduced n -- neo4jCaptureDataChangeRelationshipPayloadEndIds :: (Map.Map String AnyType)
    <*> arbitrary -- neo4jCaptureDataChangeRelationshipPayloadEndLabels :: [Text]
  
instance Arbitrary Neo4jCaptureDataChangeSchema where
  arbitrary = sized genNeo4jCaptureDataChangeSchema

genNeo4jCaptureDataChangeSchema :: Int -> Gen Neo4jCaptureDataChangeSchema
genNeo4jCaptureDataChangeSchema n =
  Neo4jCaptureDataChangeSchema
    <$> arbitraryReducedMaybe n -- neo4jCaptureDataChangeSchemaConstraints :: Maybe (Map.Map String AnyType)
    <*> arbitraryReducedMaybe n -- neo4jCaptureDataChangeSchemaProperties :: Maybe (Map.Map String AnyType)
  
instance Arbitrary TmuxPaneIoDocument where
  arbitrary = sized genTmuxPaneIoDocument

genTmuxPaneIoDocument :: Int -> Gen TmuxPaneIoDocument
genTmuxPaneIoDocument n =
  TmuxPaneIoDocument
    <$> arbitrary -- tmuxPaneIoDocumentInput :: Text
    <*> arbitrary -- tmuxPaneIoDocumentOutput :: Text
    <*> arbitrary -- tmuxPaneIoDocumentPs1 :: Text
  



instance Arbitrary E'Source where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Source2 where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

instance Arbitrary E'Type2 where
  arbitrary = arbitraryBoundedEnum

