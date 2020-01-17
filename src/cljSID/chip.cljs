(ns cljSID.chip
  (:require [reagent.core :as r]))

(defonce chip (r/atom {:sid-model "MOS6581"
                       :clk-rate 985248
                       :sample-rate 44100
                       :bus-value 0
                       :bus-value-ttl 0
                       :ext-in 0
                       :sample nil
                       :fir nil
                       :voice []}))