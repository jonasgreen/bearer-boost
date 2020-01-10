(defproject bearer "0.1.0-SNAPSHOT"
  :description "bearer"
  :dependencies [[org.clojure/clojure "1.10.0"]]

  :profiles {:dev {:dependencies [[org.clojure/clojurescript "1.10.516"]
                                  [org.clojure/core.async "0.4.500"]
                                  [com.bhauman/figwheel-main "0.2.3"]
                                  [com.bhauman/rebel-readline-cljs "0.1.4"]
                                  [reagent "0.8.1"]
                                  [reagent-utils "0.3.3"]]

                   :resource-paths ["target"]
                   :clean-targets ^{:protect false} ["target"]}}

  :aliases {"fig" ["trampoline" "run" "-m" "figwheel.main"]})
