(ns mindwm-api.specs.io-document
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.tmux-pane-io-document :refer :all]
            )
  (:import (java.io File)))


(def io-document-data
  {
   (ds/opt :type) string?
   (ds/opt :source) string?
   (ds/opt :data) tmux-pane-io-document-spec
   (ds/req :id) string?
   (ds/req :specversion) string?
   (ds/opt :datacontenttype) string?
   (ds/opt :dataschema) string?
   (ds/opt :subject) string?
   (ds/opt :time) inst?
   (ds/opt :data_base64) string?
   })

(def io-document-spec
  (ds/spec
    {:name ::io-document
     :spec io-document-data}))
