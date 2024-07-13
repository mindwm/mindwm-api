(ns mindwm-api.specs.graph-node
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.graph-node-all-of-data :refer :all]
            )
  (:import (java.io File)))


(def graph-node-data
  {
   (ds/req :id) string?
   (ds/req :source) string?
   (ds/req :specversion) string?
   (ds/req :type) string?
   (ds/opt :datacontenttype) string?
   (ds/opt :dataschema) string?
   (ds/opt :subject) string?
   (ds/opt :time) inst?
   (ds/opt :data) graph-node-all-of-data-spec
   (ds/opt :data_base64) string?
   })

(def graph-node-spec
  (ds/spec
    {:name ::graph-node
     :spec graph-node-data}))
