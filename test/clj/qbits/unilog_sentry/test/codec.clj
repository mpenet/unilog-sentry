(ns qbits.unilog-sentry.test.codec
  (:use clojure.test
        qbits.unilog-sentry.codec))

(deftest test-build-url
  (is (= (build-url "https://public:private@host:port/1" {:sample.rate 0.75})
         "https://public:private@host:port/1?sample.rate=0.75"))
  (is (= (build-url "https://public:private@host:port/1" {:release "1.0.0"
                                                          :servername "host1"})
         "https://public:private@host:port/1?release=1.0.0&servername=host1"))
  (is (= (build-url "https://public:private@host:port/1"
                    {"tags" "tag1:value1,tag2:value2"})
         "https://public:private@host:port/1?tags=tag1%3Avalue1%2Ctag2%3Avalue2")))
