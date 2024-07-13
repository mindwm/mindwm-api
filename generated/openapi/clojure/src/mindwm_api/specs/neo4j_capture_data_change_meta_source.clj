(ns mindwm-api.specs.neo4j-capture-data-change-meta-source
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def neo4j-capture-data-change-meta-source-data
  {
   (ds/req :hostname) string?
   })

(def neo4j-capture-data-change-meta-source-spec
  (ds/spec
    {:name ::neo4j-capture-data-change-meta-source
     :spec neo4j-capture-data-change-meta-source-data}))
