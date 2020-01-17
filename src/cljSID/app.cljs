(ns cljSID.app
  (:require [reagent.core :as r]
            [cljSID.chip :refer [chip]]
   ))

(defn app []
  [:div#app
   [:h1 "cljSID"]
   [:p "Basic chip model:"]
   [:textarea
    {:rows      10
     :cols      60
     :value     (str @chip)
     :read-only true}]])

(defn render []
  (r/render [app]
            (.getElementById js/document "root")))

(defn ^:dev/after-load start []
  (render)
  (js/console.log "start"))

(defn ^:export init []
  (js/console.log "init")
  (start))

(defn ^:dev/before-load stop []
  (js/console.log "stop"))
