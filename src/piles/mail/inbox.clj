(ns piles.mail.inbox
  (:require [clojure-mail.core :as mail]))

(def store (atom nil))

(defn get-store [email pass]
  (when (nil? @store)
    (do 
      (mail/auth! email pass)
      (let [s (mail/gen-store)]
        (swap! store (fn [_] s)))))
  @store)


(defn get-inbox [email pass]
  (let [s (get-store email pass)]
    (mail/get-inbox)))
