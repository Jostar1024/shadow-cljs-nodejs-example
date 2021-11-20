(ns main
  (:require ["path" :as path]
            ["os" :as os]))

(defn main []
  (js/console.log (os/homedir))
  (js/console.log "App starts...."))
