(ns mindwm-api.specs.tmux-pane-io-document
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def tmux-pane-io-document-data
  {
   (ds/req :input) string?
   (ds/req :output) string?
   (ds/req :ps1) string?
   })

(def tmux-pane-io-document-spec
  (ds/spec
    {:name ::tmux-pane-io-document
     :spec tmux-pane-io-document-data}))
