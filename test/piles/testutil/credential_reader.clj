(ns piles.testutil.credential_reader)

(def credential-file "test_user.clj")

(defn get-real-email-account []
  (load-string (slurp credential-file)))

