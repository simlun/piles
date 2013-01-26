(ns piles.acceptance.gets_mail
  (:use midje.sweet
        piles.testutil.credential_reader)
  (:require [piles.mail.inbox :as inbox]))

(fact "given username and password -> gets mail" :acceptance
  (let [acc (get-real-email-account)
        mails (inbox/get-inbox (:email acc) (:password acc))]
    (first mails) =not=> nil))
