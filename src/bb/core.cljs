(ns ^:figwheel-hooks bb.core
  (:require-macros [reagent.ratom :refer [reaction]])
  (:require [reagent.core :as r]
            [goog.events :as events]))






(def state* (r/atom {:endpoints []}))




(defn build-ui [state]
  (println "wiiiii")
  [:div (str state)])


(defn ui[]
  (let [state (reaction state*)]
    (build-ui [@state])))


(defn mount-reagent []
  (r/render [ui] (js/document.getElementById "system")))


(defn- reload-ui []
  (println "reload"))


(defn main []
  (enable-console-print!)
  (mount-reagent))


(defn ^:after-load on-js-reload []
  (reload-ui))
