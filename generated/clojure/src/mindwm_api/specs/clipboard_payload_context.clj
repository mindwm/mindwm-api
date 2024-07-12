(ns mindwm-api.specs.clipboard-payload-context
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def clipboard-payload-context-data
  {
   (ds/opt :window) string?
   })

(def clipboard-payload-context-spec
  (ds/spec
    {:name ::clipboard-payload-context
     :spec clipboard-payload-context-data}))
