(ns mindwm-api.specs.clipboard-payload
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.clipboard-payload-context :refer :all]
            )
  (:import (java.io File)))


(def clipboard-payload-data
  {
   (ds/opt :start) (s/coll-of int?)
   (ds/opt :stop) (s/coll-of int?)
   (ds/opt :data) string?
   (ds/opt :type) string?
   (ds/opt :context) clipboard-payload-context-spec
   })

(def clipboard-payload-spec
  (ds/spec
    {:name ::clipboard-payload
     :spec clipboard-payload-data}))
