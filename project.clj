(defproject fluokitten-test "0.1.0-SNAPSHOT"
  :description "Checking out Uncomplicate Fluokitten"
  :author "nuryokusan"
  :url "http://github.com/nuryokusan/fluokitten-test"
  :scm {:name "git"
        :url "https://github.com/nuryokusan/fluokitten-test"}
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.9.0"]
                 [uncomplicate/fluokitten "0.9.0"]
                 [criterium "0.4.4"]
                 [eftest "0.5.3"]]

  ;:plugins [[lein-gorilla "0.5.0"]]
  :plugins [[org.clojars.benfb/lein-gorilla "0.5.3"]]

  :profiles {:dev {:dependencies []
                   :plugins []
                   :global-vars {*warn-on-reflection* true
                                 *unchecked-math* :warn-on-boxed
                                 *print-length* 16}}}

  :javac-options ["-target" "1.8" "-source" "1.8" "-Xlint:-options"]
  ;:resource-paths ["public"]
  ;:target-path "target/%s"
  ;:test-paths ["test"]
  :source-paths ["src"])
