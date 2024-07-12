(ns mindwm-api.specs.cloud-event-data
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            )
  (:import (java.io File)))


(def cloud-event-data-data
  {
   })

(def cloud-event-data-spec
  (ds/spec
    {:name ::cloud-event-data
     :spec cloud-event-data-data}))
