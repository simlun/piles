(ns piles.testutil.credential_reader_test
  (:use midje.sweet
        piles.testutil.credential_reader))

(fact "gets map with :email and :password"
  (let [acc (get-real-email-account)]
    (contains? acc :email) => true
    (contains? acc :password) => true))
