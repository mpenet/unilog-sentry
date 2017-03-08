(ns qbits.unilog-sentry
  (:require
   [clojure.string :as str]
   [unilog.config  :as unilog])
  (:import (com.getsentry.raven.logback
            SentryAppender)))

(defmethod unilog/build-appender :sentry
  [{:keys [min-level dsn tags extra-tags environment server-name release]
    :as config}]
  (let [appender (SentryAppender.)]
    (when min-level
      (.setMinLevel appender min-level))
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
