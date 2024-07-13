(ns mindwm-api.specs.neo4j-capture-data-change-node-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.neo4j-capture-data-change-node-payload-after :refer :all]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-node-payload-data
  {
   (ds/req :after) neo4j-capture-data-change-node-payload-after-spec
   (ds/req :before) string?
   (ds/req :id) string?
   (ds/req :type) string?
   })

(def neo4j-capture-data-change-node-payload-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-node-payload
     :spec neo4j-capture-data-change-node-payload-data}))
