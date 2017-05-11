(defproject cc.qbits/unilog-sentry "0.1.3"
  :description ""
  :url "https://github.com/mpenet/unilog-sentry"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha14"]
                 [spootnik/unilog "0.7.20"]
                 [com.getsentry.raven/raven-logback "7.8.3"]]
  :source-paths ["src/clj"]
  :global-vars {*warn-on-reflection* true})
