(ns main.async-example
  (:require-macros [cljs.core.async.macros :refer [go alt! go-loop]])
  (:require [cljs.core.async :as a]
            [cljs.core.async.interop :refer-macros [<p!]]))

(defn produce []
  (let [out (a/chan)]
    (go (doseq [x (range 0 10)]
          (>! out x)))
    out))

(defn consume [in]
  (go-loop [value (<! in)]
    (when value
      (do
        (js/console.log "Got value:" value)
        (recur (<! in))))))

(comment
  ;; eval this expression
  (-> (produce)
      (consume)))
