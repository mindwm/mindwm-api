{-# LANGUAGE GeneralizedNewtypeDeriving #-}
{-# LANGUAGE DeriveGeneric              #-}
{-# LANGUAGE NoImplicitPrelude          #-}
{-# OPTIONS_GHC -fno-warn-unused-binds -fno-warn-unused-imports #-}

module MindwmAPI.Types (
  Clipboard (..),
  ClipboardPayload (..),
  ClipboardPayloadContext (..),
  CloudEvent (..),
  CloudEventData (..),
  IoDocument (..),
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
  , cloudEventData :: Maybe CloudEventData -- ^ 
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


-- | The event payload.
data CloudEventData = CloudEventData
  { 
  } deriving (Show, Eq, Generic)

instance FromJSON CloudEventData where
  parseJSON = genericParseJSON optionsCloudEventData
instance ToJSON CloudEventData where
  toJSON = genericToJSON optionsCloudEventData

optionsCloudEventData :: Options
optionsCloudEventData =
  defaultOptions
    { omitNothingFields  = True
    , fieldLabelModifier = \s -> fromMaybe ("did not find JSON field name for " ++ show s) $ List.lookup s table
    }
  where
    table =
      [ 
      ]


-- | 
newtype IoDocument = IoDocument { unIoDocument :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)

-- | 
newtype TmuxPaneIoDocument = TmuxPaneIoDocument { unTmuxPaneIoDocument :: (Map.Map Text Value) }
  deriving (Show, Eq, FromJSON, ToJSON, Generic)
