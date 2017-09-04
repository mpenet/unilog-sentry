(defproject cc.qbits/unilog-sentry "0.2.4"
  :description ""
  :url "https://github.com/mpenet/unilog-sentry"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha19"]
                 [spootnik/unilog "0.7.21"]
                 [io.sentry/sentry-clj "0.5.0"
                  :exclusions [org.slf4j/slf4j-api com.fasterxml.jackson.core/jackson-core]]
                 [io.sentry/sentry-logback "1.5.2"
                  :exclusions [io.sentry/sentry org.slf4j/slf4j-api]]
                 [ring/ring-codec "1.0.1"]]
  :source-paths ["src/clj"]
  :test-paths ["test/clj"]
  :pedantic? :abort
  :global-vars {*warn-on-reflection* true})
