(ns mindwm-api.specs.neo4j-capture-data-change-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs. :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-relationship-payload-end :refer :all]
            [mindwm-api.specs.neo4j-capture-data-change-relationship-payload-end :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-payload-data
  {
   (ds/req :after) any?
   (ds/req :before) string?
   (ds/req :id) string?
   (ds/req :type) string?
   (ds/req :end) neo4j-capture-data-change-relationship-payload-end-spec
   (ds/req :label) string?
   (ds/req :start) neo4j-capture-data-change-relationship-payload-end-spec
   })

(def neo4j-capture-data-change-payload-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-payload
     :spec neo4j-capture-data-change-payload-data}))
