(ns qbits.unilog-sentry
  (:require
   [clojure.string :as str]
   [unilog.config  :as unilog]
   [qbits.util.codec :as codec]
   [sentry-clj.core :as sentry])
  (:import (io.sentry.logback SentryAppender)))

(defmethod unilog/build-appender :sentry
  [{:keys [threshold dsn]
    :or {threshold :warn}
    :as config}]
  (let [appender (SentryAppender.)
        params (dissoc config :threshold :dsn)]
    (sentry/init! (codec/build-url dsn params))
    (.setMinLevel appender (name threshold))
    (assoc config :appender appender)))
