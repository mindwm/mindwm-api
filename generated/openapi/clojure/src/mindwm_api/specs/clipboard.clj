(ns mindwm-api.specs.clipboard
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.clipboard-payload :refer :all]
            )
  (:import (java.io File)))


(def clipboard-data
  {
   (ds/req :id) string?
   (ds/req :source) string?
   (ds/req :specversion) string?
   (ds/req :type) string?
   (ds/opt :datacontenttype) string?
   (ds/opt :dataschema) string?
   (ds/opt :subject) string?
   (ds/opt :time) inst?
   (ds/opt :data) clipboard-payload-spec
   (ds/opt :data_base64) string?
   })

(def clipboard-spec
  (ds/spec
    {:name ::clipboard
     :spec clipboard-data}))
