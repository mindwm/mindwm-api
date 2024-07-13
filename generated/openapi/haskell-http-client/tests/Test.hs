{-# LANGUAGE ScopedTypeVariables #-}
{-# LANGUAGE OverloadedStrings #-}
{-# LANGUAGE RecordWildCards #-}
{-# LANGUAGE PartialTypeSignatures #-}

module Main where

import Data.Typeable (Proxy(..))
import Test.Hspec
import Test.Hspec.QuickCheck

import PropMime
import Instances ()

import Mindwm.Model
import Mindwm.MimeTypes

main :: IO ()
main =
  hspec $ modifyMaxSize (const 10) $ do
    describe "JSON instances" $ do
      pure ()
      propMimeEq MimeJSON (Proxy :: Proxy Clipboard)
      propMimeEq MimeJSON (Proxy :: Proxy ClipboardPayload)
      propMimeEq MimeJSON (Proxy :: Proxy ClipboardPayloadContext)
      propMimeEq MimeJSON (Proxy :: Proxy CloudEvent)
      propMimeEq MimeJSON (Proxy :: Proxy CloudEventData)
      propMimeEq MimeJSON (Proxy :: Proxy GraphNode)
      propMimeEq MimeJSON (Proxy :: Proxy GraphNodeAllOfData)
      propMimeEq MimeJSON (Proxy :: Proxy GraphRelationship)
      propMimeEq MimeJSON (Proxy :: Proxy GraphRelationshipAllOfData)
      propMimeEq MimeJSON (Proxy :: Proxy IoDocument)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChange)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeMeta)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeMetaSource)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeNodePayload)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeNodePayloadAfter)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangePayload)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeRelationshipPayload)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeRelationshipPayloadEnd)
      propMimeEq MimeJSON (Proxy :: Proxy Neo4jCaptureDataChangeSchema)
      propMimeEq MimeJSON (Proxy :: Proxy TmuxPaneIoDocument)
      
