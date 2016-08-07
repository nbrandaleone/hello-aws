(ns hello-aws.routes.home
  (:require [compojure.core :refer :all]
            [hello-aws.views.layout :as layout]
            [org.httpkit.client :as http]))

(def aws-url "http://169.254.169.254/latest/meta-data/public-ipv4")
;(def aws-url "https://google.com")

;; get meta-data information from AWS
(defn get-aws-metadata [url]
  (let [response (http/get url)]
    (str (:body @response))))

(defn home []
  (layout/common [:h1 "Hello World!"]
    [:h2 "Public IP Address: " (get-aws-metadata aws-url)]))

(defroutes home-routes
  (GET "/" [] (home)))

