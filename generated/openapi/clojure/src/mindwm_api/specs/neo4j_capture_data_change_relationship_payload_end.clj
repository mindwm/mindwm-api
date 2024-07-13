(ns mindwm-api.specs.neo4j-capture-data-change-relationship-payload-end
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.any-type :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-relationship-payload-end-data
  {
   (ds/req :id) string?
   (ds/req :ids) (s/map-of string? any-type-spec)
   (ds/req :labels) (s/coll-of string?)
   })

(def neo4j-capture-data-change-relationship-payload-end-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-relationship-payload-end
     :spec neo4j-capture-data-change-relationship-payload-end-data}))
