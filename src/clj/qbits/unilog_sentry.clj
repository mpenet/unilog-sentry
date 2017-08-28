(ns qbits.unilog-sentry
  (:require
   [clojure.string :as str]
   [unilog.config  :as unilog])
  (:import (io.sentry.logback SentryAppender)))

(defmethod unilog/build-appender :sentry
  [{:keys [threshold dsn tags extra-tags environment server-name release]
    :or {threshold :warn}
    :as config}]
  (let [appender (SentryAppender.)]
    (.setMinLevel appender (name threshold))
    (when dsn
      (.setDsn appender dsn))
    (when environment
      (.setEnvironment appender environment))
    (when server-name
      (.setServerName appender server-name))
    (when tags
      (.setTags appender (str/join "," tags)))
    (when extra-tags
      (.setExtraTags appender (str/join "," extra-tags)))
    (when release
      (.setRelease appender release))
    (assoc config :appender appender)))
