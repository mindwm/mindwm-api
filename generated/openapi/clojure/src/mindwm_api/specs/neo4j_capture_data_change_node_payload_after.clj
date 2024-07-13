(ns mindwm-api.specs.neo4j-capture-data-change-node-payload-after
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.any-type :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-node-payload-after-data
  {
   (ds/req :labels) (s/coll-of string?)
   (ds/req :properties) (s/map-of string? any-type-spec)
   })

(def neo4j-capture-data-change-node-payload-after-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-node-payload-after
     :spec neo4j-capture-data-change-node-payload-after-data}))
