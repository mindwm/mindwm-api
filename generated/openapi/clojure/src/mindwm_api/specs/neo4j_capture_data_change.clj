(ns mindwm-api.specs.neo4j-capture-data-change
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.any-type :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-meta :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-schema :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-payload :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-data
  {
   (ds/req :headers) (s/map-of string? any-type-spec)
   (ds/req :message_key) string?
   (ds/req :meta) neo4j-capture-data-change-meta-spec
   (ds/req :offset) int?
   (ds/req :partition) int?
   (ds/req :source_type) string?
   (ds/req :timestamp) inst?
   (ds/req :topic) string?
   (ds/req :schema) neo4j-capture-data-change-schema-spec
   (ds/req :payload) neo4j-capture-data-change-payload-spec
   })

(def neo4j-capture-data-change-spec
  (ds/spec
    {:name ::neo4j-capture-data-change
     :spec neo4j-capture-data-change-data}))
