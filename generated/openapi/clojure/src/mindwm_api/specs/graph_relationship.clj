(ns mindwm-api.specs.graph-relationship
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.graph-relationship-all-of-data :refer :all]
            )
  (:import (java.io File)))


(def graph-relationship-data
  {
   (ds/req :id) string?
   (ds/req :source) string?
   (ds/req :specversion) string?
   (ds/req :type) string?
   (ds/opt :datacontenttype) string?
   (ds/opt :dataschema) string?
   (ds/opt :subject) string?
   (ds/opt :time) inst?
   (ds/opt :data) graph-relationship-all-of-data-spec
   (ds/opt :data_base64) string?
   })

(def graph-relationship-spec
  (ds/spec
    {:name ::graph-relationship
     :spec graph-relationship-data}))
