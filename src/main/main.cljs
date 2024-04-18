(ns ^:dev/always main
  (:require [reacl-c.main :as main]
            [core :as core]))

(main/run
  (js/document.getElementById "funktionale-user-interfaces")
  (core/app))
