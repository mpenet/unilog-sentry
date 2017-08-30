(defproject cc.qbits/unilog-sentry "0.2.1-SNAPSHOT"
  :description ""
  :url "https://github.com/mpenet/unilog-sentry"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [spootnik/unilog "0.7.20"]
                 [io.sentry/sentry-logback "1.5.2"]]
  :global-vars {*warn-on-reflection* true})
