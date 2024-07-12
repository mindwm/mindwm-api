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
  
instance Arbitrary TmuxPaneIoDocument where
  arbitrary = sized genTmuxPaneIoDocument

genTmuxPaneIoDocument :: Int -> Gen TmuxPaneIoDocument
genTmuxPaneIoDocument n =
  TmuxPaneIoDocument
    <$> arbitrary -- tmuxPaneIoDocumentInput :: Text
    <*> arbitrary -- tmuxPaneIoDocumentOutput :: Text
    <*> arbitrary -- tmuxPaneIoDocumentPs1 :: Text
  



instance Arbitrary E'Type where
  arbitrary = arbitraryBoundedEnum

