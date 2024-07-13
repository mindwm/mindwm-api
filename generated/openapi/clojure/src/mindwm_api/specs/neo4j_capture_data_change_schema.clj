(ns mindwm-api.specs.neo4j-capture-data-change-schema
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.any-type :refer :all]
            [mindwm-api.specs.any-type :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-schema-data
  {
   (ds/opt :constraints) (s/map-of string? any-type-spec)
   (ds/opt :properties) (s/map-of string? any-type-spec)
   })

(def neo4j-capture-data-change-schema-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-schema
     :spec neo4j-capture-data-change-schema-data}))
