(ns piles.util.credential_reader_test
  (:use midje.sweet
        piles.util.credential_reader))

(fact "gets map with :email and :password"
  (let [acc (get-real-email-account)]
    (contains? acc :email) => true
    (contains? acc :password) => true))
