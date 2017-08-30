(ns qbits.util.codec
  (:require [ring.util.codec :refer [url-encode]])
  (:import (java.net URLEncoder)))

; Credits: https://stackoverflow.com/a/3644219
(defn make-query-string
  [m & [^String encoding]]
  (let [s #(if (instance? clojure.lang.Named %) (name %) %)
        enc (or encoding "UTF-8")]
    (->> (for [[k v] m]
           (str (url-encode (s k) enc)
                "="
                (url-encode (str v) enc)))
         (interpose "&")
         (apply str))))

(defn build-url
  [^String url-base query-map & [^String encoding]]
  (str url-base "?" (make-query-string query-map encoding)))
