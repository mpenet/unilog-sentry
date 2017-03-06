(defproject cc.qbits/unilog-sentry "0.1.0-SNAPSHOT"
  :description ""
  :url "https://github.com/mpenet/unilog-sentry"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [spootnik/unilog "0.7.19"]
                 [com.getsentry.raven/raven-log4j "7.8.1"]]
  :source-paths ["src/clj"]
  :global-vars {*warn-on-reflection* true})
