(ns mindwm-api.specs.graph-relationship-all-of-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs. :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-meta :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-schema :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-relationship-payload :refer :all]
            )
  (:import (java.io File)))


(def graph-relationship-all-of-data-data
  {
   (ds/req :headers) any?
   (ds/req :message_key) string?
   (ds/req :meta) neo4j-capture-data-change-meta-spec
   (ds/req :offset) int?
   (ds/req :partition) int?
   (ds/req :source_type) string?
   (ds/req :timestamp) inst?
   (ds/req :topic) string?
   (ds/req :schema) neo4j-capture-data-change-schema-spec
   (ds/req :payload) neo4j-capture-data-change-relationship-payload-spec
   })

(def graph-relationship-all-of-data-spec
  (ds/spec
    {:name ::graph-relationship-all-of-data
     :spec graph-relationship-all-of-data-data}))
