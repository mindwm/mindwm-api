{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module MindwmAPI.Types (
  Clipboard (..),
  ClipboardPayload (..),
  ClipboardPayloadContext (..),
  CloudEvent (..),
  GraphNode (..),
  GraphNodeAllOfData (..),
  GraphRelationship (..),
  GraphRelationshipAllOfData (..),
  IoDocument (..),
  Neo4jCaptureDataChange (..),
  Neo4jCaptureDataChangeMeta (..),
  Neo4jCaptureDataChangeMetaSource (..),
  Neo4jCaptureDataChangeNodePayload (..),
  Neo4jCaptureDataChangeNodePayloadAfter (..),
  Neo4jCaptureDataChangePayload (..),
  Neo4jCaptureDataChangeRelationshipPayload (..),
  Neo4jCaptureDataChangeRelationshipPayloadEnd (..),
  Neo4jCaptureDataChangeSchema (..),
  TmuxPaneIoDocument (..),
  ) where

import ClassyPrelude.Yesod
import Data.Foldable (foldl)
import qualified Data.List as List
import Data.Maybe (fromMaybe)
import Data.Aeson (Value, FromJSON(..), ToJSON(..), genericToJSON, genericParseJSON)
import Data.Aeson.Types (Options(..), defaultOptions)
import qualified Data.Char as Char
import qualified Data.Text as T
import qualified Data.Map as Map
import GHC.Generics (Generic)


-- | 
newtype Clipboard = Clipboard { unClipboard :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data ClipboardPayload = ClipboardPayload
  { clipboardPayloadStart :: Maybe [Int] -- ^ Starting position of clipboard selection [x,y]
  , clipboardPayloadStop :: Maybe [Int] -- ^ Ending position of clipboard selection [x,y]
  , clipboardPayloadData :: Maybe Text -- ^ Clipboard data
  , clipboardPayloadType :: Maybe Text -- ^ Clipboard type
  , clipboardPayloadContext :: Maybe ClipboardPayloadContext -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON ClipboardPayload where
  parseJSON = genericParseJSON optionsClipboardPayload
instance ToJSON ClipboardPayload where
  toJSON = genericToJSON optionsClipboardPayload

optionsClipboardPayload :: Options
optionsClipboardPayload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("clipboardPayloadStart", "start")
      , ("clipboardPayloadStop", "stop")
      , ("clipboardPayloadData", "data")
      , ("clipboardPayloadType", "type")
      , ("clipboardPayloadContext", "context")
      ]


-- | Selection context
data ClipboardPayloadContext = ClipboardPayloadContext
  { clipboardPayloadContextWindow :: Maybe Text -- ^ window id
  } deriving (Show, Eq, Generic)

instance FromJSON ClipboardPayloadContext where
  parseJSON = genericParseJSON optionsClipboardPayloadContext
instance ToJSON ClipboardPayloadContext where
  toJSON = genericToJSON optionsClipboardPayloadContext

optionsClipboardPayloadContext :: Options
optionsClipboardPayloadContext =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("clipboardPayloadContextWindow", "window")
      ]


-- | CloudEvents Specification JSON Schema
data CloudEvent = CloudEvent
  { cloudEventId :: Text -- ^ Identifies the event.
  , cloudEventSource :: Text -- ^ Identifies the context in which an event happened.
  , cloudEventSpecversion :: Text -- ^ The version of the CloudEvents specification which the event uses.
  , cloudEventType :: Text -- ^ Describes the type of event related to the originating occurrence.
  , cloudEventDatacontenttype :: Maybe Text -- ^ Content type of the data value. Must adhere to RFC 2046 format.
  , cloudEventDataschema :: Maybe Text -- ^ Identifies the schema that data adheres to.
  , cloudEventSubject :: Maybe Text -- ^ Describes the subject of the event in the context of the event producer (identified by source).
  , cloudEventTime :: Maybe UTCTime -- ^ Timestamp of when the occurrence happened. Must adhere to RFC 3339.
  , cloudEventData :: Maybe Object -- ^ The event payload.
  , cloudEventDataUnderscorebase64 :: Maybe Text -- ^ Base64 encoded event payload. Must adhere to RFC4648.
  } deriving (Show, Eq, Generic)

instance FromJSON CloudEvent where
  parseJSON = genericParseJSON optionsCloudEvent
instance ToJSON CloudEvent where
  toJSON = genericToJSON optionsCloudEvent

optionsCloudEvent :: Options
optionsCloudEvent =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("cloudEventId", "id")
      , ("cloudEventSource", "source")
      , ("cloudEventSpecversion", "specversion")
      , ("cloudEventType", "type")
      , ("cloudEventDatacontenttype", "datacontenttype")
      , ("cloudEventDataschema", "dataschema")
      , ("cloudEventSubject", "subject")
      , ("cloudEventTime", "time")
      , ("cloudEventData", "data")
      , ("cloudEventDataUnderscorebase64", "data_base64")
      ]


-- | 
newtype GraphNode = GraphNode { unGraphNode :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data GraphNodeAllOfData = GraphNodeAllOfData
  { graphNodeAllOfDataHeaders :: Object -- ^ 
  , graphNodeAllOfDataMessageUnderscorekey :: Text -- ^ 
  , graphNodeAllOfDataMeta :: Neo4jCaptureDataChangeMeta -- ^ 
  , graphNodeAllOfDataOffset :: Int -- ^ 
  , graphNodeAllOfDataPartition :: Int -- ^ 
  , graphNodeAllOfDataSourceUnderscoretype :: Text -- ^ 
  , graphNodeAllOfDataTimestamp :: UTCTime -- ^ 
  , graphNodeAllOfDataTopic :: Text -- ^ 
  , graphNodeAllOfDataSchema :: Neo4jCaptureDataChangeSchema -- ^ 
  , graphNodeAllOfDataPayload :: Neo4jCaptureDataChangeNodePayload -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GraphNodeAllOfData where
  parseJSON = genericParseJSON optionsGraphNodeAllOfData
instance ToJSON GraphNodeAllOfData where
  toJSON = genericToJSON optionsGraphNodeAllOfData

optionsGraphNodeAllOfData :: Options
optionsGraphNodeAllOfData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("graphNodeAllOfDataHeaders", "headers")
      , ("graphNodeAllOfDataMessageUnderscorekey", "message_key")
      , ("graphNodeAllOfDataMeta", "meta")
      , ("graphNodeAllOfDataOffset", "offset")
      , ("graphNodeAllOfDataPartition", "partition")
      , ("graphNodeAllOfDataSourceUnderscoretype", "source_type")
      , ("graphNodeAllOfDataTimestamp", "timestamp")
      , ("graphNodeAllOfDataTopic", "topic")
      , ("graphNodeAllOfDataSchema", "schema")
      , ("graphNodeAllOfDataPayload", "payload")
      ]


-- | 
newtype GraphRelationship = GraphRelationship { unGraphRelationship :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data GraphRelationshipAllOfData = GraphRelationshipAllOfData
  { graphRelationshipAllOfDataHeaders :: Object -- ^ 
  , graphRelationshipAllOfDataMessageUnderscorekey :: Text -- ^ 
  , graphRelationshipAllOfDataMeta :: Neo4jCaptureDataChangeMeta -- ^ 
  , graphRelationshipAllOfDataOffset :: Int -- ^ 
  , graphRelationshipAllOfDataPartition :: Int -- ^ 
  , graphRelationshipAllOfDataSourceUnderscoretype :: Text -- ^ 
  , graphRelationshipAllOfDataTimestamp :: UTCTime -- ^ 
  , graphRelationshipAllOfDataTopic :: Text -- ^ 
  , graphRelationshipAllOfDataSchema :: Neo4jCaptureDataChangeSchema -- ^ 
  , graphRelationshipAllOfDataPayload :: Neo4jCaptureDataChangeRelationshipPayload -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON GraphRelationshipAllOfData where
  parseJSON = genericParseJSON optionsGraphRelationshipAllOfData
instance ToJSON GraphRelationshipAllOfData where
  toJSON = genericToJSON optionsGraphRelationshipAllOfData

optionsGraphRelationshipAllOfData :: Options
optionsGraphRelationshipAllOfData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("graphRelationshipAllOfDataHeaders", "headers")
      , ("graphRelationshipAllOfDataMessageUnderscorekey", "message_key")
      , ("graphRelationshipAllOfDataMeta", "meta")
      , ("graphRelationshipAllOfDataOffset", "offset")
      , ("graphRelationshipAllOfDataPartition", "partition")
      , ("graphRelationshipAllOfDataSourceUnderscoretype", "source_type")
      , ("graphRelationshipAllOfDataTimestamp", "timestamp")
      , ("graphRelationshipAllOfDataTopic", "topic")
      , ("graphRelationshipAllOfDataSchema", "schema")
      , ("graphRelationshipAllOfDataPayload", "payload")
      ]


-- | 
newtype IoDocument = IoDocument { unIoDocument :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
data Neo4jCaptureDataChange = Neo4jCaptureDataChange
  { neo4jCaptureDataChangeHeaders :: (Map.Map String Value) -- ^ 
  , neo4jCaptureDataChangeMessageUnderscorekey :: Text -- ^ 
  , neo4jCaptureDataChangeMeta :: Neo4jCaptureDataChangeMeta -- ^ 
  , neo4jCaptureDataChangeOffset :: Int -- ^ 
  , neo4jCaptureDataChangePartition :: Int -- ^ 
  , neo4jCaptureDataChangeSourceUnderscoretype :: Text -- ^ 
  , neo4jCaptureDataChangeTimestamp :: UTCTime -- ^ 
  , neo4jCaptureDataChangeTopic :: Text -- ^ 
  , neo4jCaptureDataChangeSchema :: Neo4jCaptureDataChangeSchema -- ^ 
  , neo4jCaptureDataChangePayload :: Neo4jCaptureDataChangePayload -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChange where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChange
instance ToJSON Neo4jCaptureDataChange where
  toJSON = genericToJSON optionsNeo4jCaptureDataChange

optionsNeo4jCaptureDataChange :: Options
optionsNeo4jCaptureDataChange =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeHeaders", "headers")
      , ("neo4jCaptureDataChangeMessageUnderscorekey", "message_key")
      , ("neo4jCaptureDataChangeMeta", "meta")
      , ("neo4jCaptureDataChangeOffset", "offset")
      , ("neo4jCaptureDataChangePartition", "partition")
      , ("neo4jCaptureDataChangeSourceUnderscoretype", "source_type")
      , ("neo4jCaptureDataChangeTimestamp", "timestamp")
      , ("neo4jCaptureDataChangeTopic", "topic")
      , ("neo4jCaptureDataChangeSchema", "schema")
      , ("neo4jCaptureDataChangePayload", "payload")
      ]


-- | 
data Neo4jCaptureDataChangeMeta = Neo4jCaptureDataChangeMeta
  { neo4jCaptureDataChangeMetaOperation :: Text -- ^ 
  , neo4jCaptureDataChangeMetaSource :: Neo4jCaptureDataChangeMetaSource -- ^ 
  , neo4jCaptureDataChangeMetaTimestamp :: Int -- ^ 
  , neo4jCaptureDataChangeMetaTxEventId :: Int -- ^ 
  , neo4jCaptureDataChangeMetaTxEventsCount :: Int -- ^ 
  , neo4jCaptureDataChangeMetaTxId :: Int -- ^ 
  , neo4jCaptureDataChangeMetaUsername :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeMeta where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeMeta
instance ToJSON Neo4jCaptureDataChangeMeta where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeMeta

optionsNeo4jCaptureDataChangeMeta :: Options
optionsNeo4jCaptureDataChangeMeta =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeMetaOperation", "operation")
      , ("neo4jCaptureDataChangeMetaSource", "source")
      , ("neo4jCaptureDataChangeMetaTimestamp", "timestamp")
      , ("neo4jCaptureDataChangeMetaTxEventId", "txEventId")
      , ("neo4jCaptureDataChangeMetaTxEventsCount", "txEventsCount")
      , ("neo4jCaptureDataChangeMetaTxId", "txId")
      , ("neo4jCaptureDataChangeMetaUsername", "username")
      ]


-- | 
data Neo4jCaptureDataChangeMetaSource = Neo4jCaptureDataChangeMetaSource
  { neo4jCaptureDataChangeMetaSourceHostname :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeMetaSource where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeMetaSource
instance ToJSON Neo4jCaptureDataChangeMetaSource where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeMetaSource

optionsNeo4jCaptureDataChangeMetaSource :: Options
optionsNeo4jCaptureDataChangeMetaSource =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeMetaSourceHostname", "hostname")
      ]


-- | 
data Neo4jCaptureDataChangeNodePayload = Neo4jCaptureDataChangeNodePayload
  { neo4jCaptureDataChangeNodePayloadAfter :: Neo4jCaptureDataChangeNodePayloadAfter -- ^ 
  , neo4jCaptureDataChangeNodePayloadBefore :: Text -- ^ 
  , neo4jCaptureDataChangeNodePayloadId :: Text -- ^ 
  , neo4jCaptureDataChangeNodePayloadType :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeNodePayload where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeNodePayload
instance ToJSON Neo4jCaptureDataChangeNodePayload where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeNodePayload

optionsNeo4jCaptureDataChangeNodePayload :: Options
optionsNeo4jCaptureDataChangeNodePayload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeNodePayloadAfter", "after")
      , ("neo4jCaptureDataChangeNodePayloadBefore", "before")
      , ("neo4jCaptureDataChangeNodePayloadId", "id")
      , ("neo4jCaptureDataChangeNodePayloadType", "type")
      ]


-- | 
data Neo4jCaptureDataChangeNodePayloadAfter = Neo4jCaptureDataChangeNodePayloadAfter
  { neo4jCaptureDataChangeNodePayloadAfterLabels :: [Text] -- ^ 
  , neo4jCaptureDataChangeNodePayloadAfterProperties :: (Map.Map String Value) -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeNodePayloadAfter where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeNodePayloadAfter
instance ToJSON Neo4jCaptureDataChangeNodePayloadAfter where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeNodePayloadAfter

optionsNeo4jCaptureDataChangeNodePayloadAfter :: Options
optionsNeo4jCaptureDataChangeNodePayloadAfter =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeNodePayloadAfterLabels", "labels")
      , ("neo4jCaptureDataChangeNodePayloadAfterProperties", "properties")
      ]


-- | 
data Neo4jCaptureDataChangePayload = Neo4jCaptureDataChangePayload
  { neo4jCaptureDataChangePayloadAfter :: Object -- ^ 
  , neo4jCaptureDataChangePayloadBefore :: Text -- ^ 
  , neo4jCaptureDataChangePayloadId :: Text -- ^ 
  , neo4jCaptureDataChangePayloadType :: Text -- ^ 
  , neo4jCaptureDataChangePayloadEnd :: Neo4jCaptureDataChangeRelationshipPayloadEnd -- ^ 
  , neo4jCaptureDataChangePayloadLabel :: Text -- ^ 
  , neo4jCaptureDataChangePayloadStart :: Neo4jCaptureDataChangeRelationshipPayloadEnd -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangePayload where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangePayload
instance ToJSON Neo4jCaptureDataChangePayload where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangePayload

optionsNeo4jCaptureDataChangePayload :: Options
optionsNeo4jCaptureDataChangePayload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangePayloadAfter", "after")
      , ("neo4jCaptureDataChangePayloadBefore", "before")
      , ("neo4jCaptureDataChangePayloadId", "id")
      , ("neo4jCaptureDataChangePayloadType", "type")
      , ("neo4jCaptureDataChangePayloadEnd", "end")
      , ("neo4jCaptureDataChangePayloadLabel", "label")
      , ("neo4jCaptureDataChangePayloadStart", "start")
      ]


-- | 
data Neo4jCaptureDataChangeRelationshipPayload = Neo4jCaptureDataChangeRelationshipPayload
  { neo4jCaptureDataChangeRelationshipPayloadAfter :: Object -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadBefore :: Text -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadEnd :: Neo4jCaptureDataChangeRelationshipPayloadEnd -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadId :: Text -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadLabel :: Text -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadStart :: Neo4jCaptureDataChangeRelationshipPayloadEnd -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadType :: Text -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeRelationshipPayload where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeRelationshipPayload
instance ToJSON Neo4jCaptureDataChangeRelationshipPayload where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeRelationshipPayload

optionsNeo4jCaptureDataChangeRelationshipPayload :: Options
optionsNeo4jCaptureDataChangeRelationshipPayload =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeRelationshipPayloadAfter", "after")
      , ("neo4jCaptureDataChangeRelationshipPayloadBefore", "before")
      , ("neo4jCaptureDataChangeRelationshipPayloadEnd", "end")
      , ("neo4jCaptureDataChangeRelationshipPayloadId", "id")
      , ("neo4jCaptureDataChangeRelationshipPayloadLabel", "label")
      , ("neo4jCaptureDataChangeRelationshipPayloadStart", "start")
      , ("neo4jCaptureDataChangeRelationshipPayloadType", "type")
      ]


-- | 
data Neo4jCaptureDataChangeRelationshipPayloadEnd = Neo4jCaptureDataChangeRelationshipPayloadEnd
  { neo4jCaptureDataChangeRelationshipPayloadEndId :: Text -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadEndIds :: (Map.Map String Value) -- ^ 
  , neo4jCaptureDataChangeRelationshipPayloadEndLabels :: [Text] -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeRelationshipPayloadEnd where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeRelationshipPayloadEnd
instance ToJSON Neo4jCaptureDataChangeRelationshipPayloadEnd where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeRelationshipPayloadEnd

optionsNeo4jCaptureDataChangeRelationshipPayloadEnd :: Options
optionsNeo4jCaptureDataChangeRelationshipPayloadEnd =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeRelationshipPayloadEndId", "id")
      , ("neo4jCaptureDataChangeRelationshipPayloadEndIds", "ids")
      , ("neo4jCaptureDataChangeRelationshipPayloadEndLabels", "labels")
      ]


-- | 
data Neo4jCaptureDataChangeSchema = Neo4jCaptureDataChangeSchema
  { neo4jCaptureDataChangeSchemaConstraints :: Maybe (Map.Map String Value) -- ^ 
  , neo4jCaptureDataChangeSchemaProperties :: Maybe (Map.Map String Value) -- ^ 
  } deriving (Show, Eq, Generic)

instance FromJSON Neo4jCaptureDataChangeSchema where
  parseJSON = genericParseJSON optionsNeo4jCaptureDataChangeSchema
instance ToJSON Neo4jCaptureDataChangeSchema where
  toJSON = genericToJSON optionsNeo4jCaptureDataChangeSchema

optionsNeo4jCaptureDataChangeSchema :: Options
optionsNeo4jCaptureDataChangeSchema =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ ("neo4jCaptureDataChangeSchemaConstraints", "constraints")
      , ("neo4jCaptureDataChangeSchemaProperties", "properties")
      ]


-- | 
newtype TmuxPaneIoDocument = TmuxPaneIoDocument { unTmuxPaneIoDocument :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)
