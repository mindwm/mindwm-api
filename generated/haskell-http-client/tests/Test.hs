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
      propMimeEq MimeJSON (Proxy :: Proxy IoDocument)
      propMimeEq MimeJSON (Proxy :: Proxy TmuxPaneIoDocument)
      
