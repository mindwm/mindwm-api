(ns mindwm-api.specs.neo4j-capture-data-change-meta
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.neo4j-capture-data-change-meta-source :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-meta-data
  {
   (ds/req :operation) string?
   (ds/req :source) neo4j-capture-data-change-meta-source-spec
   (ds/req :timestamp) int?
   (ds/req :txEventId) int?
   (ds/req :txEventsCount) int?
   (ds/req :txId) int?
   (ds/req :username) string?
   })

(def neo4j-capture-data-change-meta-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-meta
     :spec neo4j-capture-data-change-meta-data}))
