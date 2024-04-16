(ns core
  (:require [reacl-c.core :as c :include-macros true]
            [reacl-c-basics.forms.core :as forms]
            [active.clojure.functions :as f]
            [active.clojure.lens :as lens]
            [reacl-c.dom :as dom :include-macros true]))

(c/defn-item app []
  (dom/div "TODO"))
