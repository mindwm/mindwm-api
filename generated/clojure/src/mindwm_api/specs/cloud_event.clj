(ns mindwm-api.specs.cloud-event
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.cloud-event-data :refer :all]
            )
  (:import (java.io File)))


(def cloud-event-data
  {
   (ds/req :id) string?
   (ds/req :source) string?
   (ds/req :specversion) string?
   (ds/req :type) string?
   (ds/opt :datacontenttype) string?
   (ds/opt :dataschema) string?
   (ds/opt :subject) string?
   (ds/opt :time) inst?
   (ds/opt :data) cloud-event-data-spec
   (ds/opt :data_base64) string?
   })

(def cloud-event-spec
  (ds/spec
    {:name ::cloud-event
     :spec cloud-event-data}))
