(ns mindwm-api.specs.clipboard
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [mindwm-api.specs.clipboard-payload :refer :all]
            )
  (:import (java.io File)))


(def clipboard-data
  {
   (ds/opt :type) string?
   (ds/opt :source) string?
   (ds/opt :data) clipboard-payload-spec
   (ds/req :id) string?
   (ds/req :specversion) string?
   (ds/opt :datacontenttype) string?
   (ds/opt :dataschema) string?
   (ds/opt :subject) string?
   (ds/opt :time) inst?
   (ds/opt :data_base64) string?
   })

(def clipboard-spec
  (ds/spec
    {:name ::clipboard
     :spec clipboard-data}))
