(ns exfn.test-maps)

(def bad-map
  [[:o :o :o :w :o :o :o :o :o :o :o :o :o :o :o :o]
   [:o :o :o :w :g :w :o :o :o :w :o :o :w :o :o :o]
   [:o :o :w :w :w :w :w :w :w :w :w :w :w :w :o :o]
   [:o :o :w :o :o :o :o :o :o :o :o :o :o :w :w :o]
   [:o :o :w :w :w :w :w :w :o :o :o :o :o :w :w :o]
   [:o :o :o :o :o :o :o :o :o :o :s :w :o :w :o :o]
   [:o :o :o :o :o :o :o :o :o :o :o :o :o :w :o :o]])

(def test-map
  [[:o :o :o :w :o :o :o :o :o :o :o :o :o :o :o :o]
   [:o :o :o :w :g :w :o :o :o :w :o :o :w :o :o :o]
   [:o :o :w :w :w :w :w :w :w :w :w :w :w :w :o :o]
   [:o :o :w :o :o :o :o :o :o :o :o :o :o :w :w :o]
   [:o :o :w :w :w :w :w :w :o :o :o :o :o :w :w :o]
   [:o :o :o :o :o :o :o :o :o :o :s :w :o :w :o :o]
   [:o :o :o :o :o :o :o :o :o :o :o :o :o :o :o :o]])

(def test-map2
  [[:s :w :o :o :o :o :o :o :o :o :o :o :o :o :o :o]
   [:o :w :o :w :w :w :w :w :w :w :w :w :w :w :w :o]
   [:o :w :o :w :g :o :o :o :o :o :o :o :o :o :w :o]
   [:o :w :o :w :w :w :w :w :w :w :w :w :w :o :w :o]
   [:o :w :o :o :o :o :o :o :o :o :o :o :o :o :w :o]
   [:o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o]
   [:o :o :o :o :o :o :o :o :o :o :o :o :o :o :o :o]])

(def test-map2b
  [[:g :w :o :o :o :o :o :o :o :o :o :o :o :o :o :o]
   [:o :w :o :w :w :w :w :w :w :w :w :w :w :w :w :o]
   [:o :w :o :w :s :o :o :o :o :o :o :o :o :o :w :o]
   [:o :w :o :w :w :w :w :w :w :w :w :w :w :o :w :o]
   [:o :w :o :o :o :o :o :o :o :o :o :o :o :o :w :o]
   [:o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o]
   [:o :o :o :o :o :o :o :o :o :o :o :o :o :o :o :o]])

(def test-map3
  [[:s :w :o :o :o :w :o :o :o :w :o :o :o :w :o :g]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :o :o :w :o :o :o :w :o :o :o :w :o :o :o :w]])

(def test-map4
  [[:s :w :o :o :o :w :o :o :o :w :o :o :o :w :o :g]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :o :o :o :o :o :o :o :o :o :o :o :o :o :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :w :o :w :o :w :o :w :o :w :o :w :o :w :o :w]
   [:o :o :o :w :o :o :o :w :o :o :o :w :o :o :o :w]])

(def test-map5
  [[:w :w :w :w :w :w :w :w :o :o :o :o :o :o :o :w]
   [:w :w :w :w :w :w :w :w :g :w :o :o :w :o :o :w]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :s :w]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]])

(def test-map6
  [[:o :o :o :o :o :o :o :o :o :o :o :o :o :o :o :o]
   [:o :o :o :w :g :w :o :o :o :w :o :o :w :o :o :o]
   [:o :o :w :w :w :w :w :w :w :w :w :w :w :w :o :o]
   [:o :o :w :o :o :o :o :o :o :o :o :o :o :w :w :o]
   [:o :o :w :w :w :w :w :w :o :o :o :o :o :w :w :o]
   [:o :o :o :o :o :o :o :o :o :o :s :w :o :w :o :o]
   [:o :o :o :o :o :o :o :o :o :o :o :o :o :w :o :o]])

(def test-map7
  [[:o :o :o :o :w :w :w :w :w :w :w :o :o :o :o :o]
   [:w :s :w :o :w :w :o :o :o :w :w :o :w :w :o :o]
   [:w :w :w :o :w :w :o :w :o :w :w :o :o :w :o :w]
   [:w :w :o :o :o :o :o :w :o :o :o :o :w :w :o :g]
   [:w :w :o :w :w :w :o :w :w :o :w :w :w :w :w :w]
   [:w :o :o :w :w :w :o :o :o :o :o :o :o :o :o :w]
   [:o :o :w :w :w :w :w :w :o :w :w :w :w :w :o :w]])

(def test-map8
  [[:w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w]
   [:w :o :o :w :w :o :o :o :o :o :w :o :o :o :o :o]
   [:w :w :w :o :o :w :o :w :o :w :w :o :o :w :o :w]
   [:w :o :o :o :w :w :o :o :o :o :o :o :o :w :o :g]
   [:w :s :w :o :o :o :o :w :o :w :w :w :o :w :w :w]
   [:w :o :w :w :w :w :o :o :o :w :w :w :o :o :o :w]
   [:o :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w]])

(def test-map9
  [[:o :w :w :w :w :w :w :w :w :o :o :w :o :o :o :w :o :w :o :w :o :o :w :w :w :w :w :w :o :o :o :w :o :o :o :w :o :o :o :o :w :w :o :w :o :o :o :o]
   [:o :w :o :o :o :w :w :o :w :w :o :w :o :w :w :w :o :w :o :o :o :w :w :o :w :w :o :o :o :o :w :w :o :w :o :w :o :o :w :o :o :o :o :w :o :w :o :w]
   [:w :w :w :w :o :o :o :o :w :o :o :o :o :o :o :w :o :o :o :w :o :o :w :o :o :w :o :o :w :o :o :w :o :w :o :w :w :o :w :w :w :w :w :w :o :w :o :w]
   [:o :w :o :w :o :w :w :o :o :o :o :w :o :w :w :w :w :w :w :w :w :o :w :w :o :w :w :o :w :w :w :w :o :w :w :w :o :o :o :o :w :o :o :w :w :w :o :w]
   [:o :o :o :o :o :w :o :s :w :o :o :w :o :o :o :w :o :o :w :o :o :o :w :o :o :w :o :o :o :o :o :o :o :o :o :o :o :w :w :o :o :o :o :w :o :w :o :o]
   [:w :w :w :w :o :w :w :w :w :o :w :w :w :w :w :w :o :w :w :o :w :w :w :o :o :w :o :o :o :o :o :w :o :o :o :w :o :o :w :o :w :o :o :w :o :o :o :o]
   [:o :o :w :o :o :o :w :o :w :o :o :o :w :o :o :w :o :o :o :o :o :o :w :o :w :w :w :o :w :w :w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w]
   [:o :w :w :w :w :o :w :o :w :o :w :o :w :o :o :o :o :o :w :o :o :o :w :o :o :w :o :o :w :o :o :w :o :w :o :w :o :o :w :o :o :o :w :o :w :o :o :w]
   [:o :o :o :o :o :o :o :o :w :o :w :w :w :o :w :w :w :o :w :w :w :o :w :o :o :w :o :o :w :o :o :w :o :w :o :w :w :o :w :o :w :o :w :o :w :o :w :w]
   [:w :o :w :w :w :o :w :w :w :o :o :o :o :o :o :w :o :o :w :o :o :o :w :o :o :o :o :w :w :w :o :w :o :o :o :w :o :o :o :o :w :o :o :o :o :o :o :o]
   [:o :o :w :o :o :o :o :o :w :o :o :o :w :o :o :w :o :o :w :o :o :o :w :o :o :w :o :o :o :w :o :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w :w :w]
   [:w :w :w :w :w :w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :o :w :o :o :o :o :o :w :o :w :o :o :w :o :o :o :o :w :o :o :o :o :o :o]
   [:w :o :o :o :w :o :o :o :w :o :w :o :w :o :o :o :o :w :o :w :o :o :w :w :o :w :w :o :w :w :w :w :o :w :o :o :o :o :w :o :o :w :o :w :o :o :w :o]
   [:w :w :o :o :o :o :o :o :w :o :o :o :w :o :w :o :o :o :o :o :o :w :w :o :o :w :o :o :o :w :o :w :o :w :o :o :w :o :w :w :w :w :w :w :w :o :w :w]
   [:w :o :o :o :w :w :w :o :w :o :w :o :o :o :w :o :o :o :o :w :o :o :w :o :o :w :o :w :w :w :o :w :o :o :o :o :w :o :w :o :o :w :o :o :w :o :o :o]
   [:w :o :w :w :w :o :w :o :o :o :w :w :o :w :w :w :w :o :w :w :w :w :w :o :w :w :o :o :o :w :o :w :w :w :o :w :w :w :w :w :w :w :o :w :w :o :w :o]
   [:o :o :o :o :w :o :o :o :w :o :w :o :o :o :w :o :o :o :o :o :o :o :w :o :o :w :o :o :o :o :o :o :o :o :o :w :o :o :o :o :o :w :o :o :w :o :w :o]
   [:w :w :o :w :w :w :w :w :w :o :w :o :o :o :w :w :o :w :o :w :o :o :o :o :o :w :w :w :w :o :w :w :o :o :o :o :o :o :w :o :o :o :o :o :w :o :w :o]
   [:o :w :o :o :w :o :w :o :w :w :w :w :o :w :w :o :o :o :o :w :o :o :w :o :o :w :o :w :o :o :o :w :w :o :w :w :o :o :w :o :o :w :o :w :w :w :w :w]
   [:o :w :o :o :o :o :w :o :w :o :o :o :o :o :w :w :w :w :o :w :w :w :w :o :w :w :o :w :o :w :o :w :o :o :o :w :o :w :w :w :w :w :o :o :w :o :w :o]
   [:o :o :o :w :w :o :o :o :w :w :o :w :o :o :w :o :w :o :o :w :o :o :w :o :o :w :o :o :o :w :o :w :o :w :o :o :o :o :o :o :o :w :o :o :o :o :o :o]
   [:o :w :o :o :w :o :w :o :w :o :o :w :o :o :w :o :o :o :o :w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w :w :w :w :w :w :w :w :w :w]
   [:w :w :w :w :w :o :w :w :w :w :w :w :w :o :w :o :w :o :o :o :o :o :w :o :o :o :o :w :o :o :w :o :o :w :o :o :o :o :w :o :w :o :o :o :o :o :w :o]
   [:o :w :o :o :w :o :o :o :o :w :o :o :o :o :w :o :w :o :o :w :o :o :w :w :o :o :o :w :o :o :o :o :w :w :o :w :o :o :o :o :w :o :w :w :w :w :w :o]
   [:o :w :o :w :w :o :o :o :o :w :o :o :w :o :w :w :w :w :o :w :w :o :w :w :o :w :o :w :w :o :w :o :w :w :o :w :w :w :w :o :o :o :o :o :o :o :w :o]
   [:o :o :o :o :w :o :w :w :w :w :o :w :w :o :w :o :o :o :o :w :o :o :w :o :o :w :o :o :o :o :w :o :o :w :o :w :o :o :w :o :w :w :w :w :w :w :w :o]
   [:o :w :o :o :o :o :o :o :o :o :o :o :o :o :w :o :o :o :o :w :o :w :w :w :w :w :o :w :w :w :w :w :w :w :o :o :o :o :w :o :o :o :o :o :o :o :o :o]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w :w :w :w :w :o :o :o :o :w :o :w :o :o :o :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w]
   [:o :o :o :w :o :o :o :o :o :w :o :o :o :w :w :o :o :o :o :w :o :o :w :o :w :o :o :w :o :w :o :o :o :w :o :w :o :o :o :o :w :o :o :w :o :o :o :w]
   [:o :w :o :o :o :o :w :o :w :w :o :w :o :o :o :o :o :o :o :w :w :o :w :o :w :o :o :o :o :w :w :w :o :w :o :w :o :w :o :o :w :o :o :o :o :w :o :w]
   [:w :w :w :o :w :w :w :o :o :o :o :w :o :o :w :w :o :w :o :o :o :o :w :w :w :w :o :w :o :o :w :o :o :o :o :o :o :w :w :w :w :o :o :w :o :w :w :w]
   [:o :o :o :o :o :o :w :w :o :w :w :w :w :w :w :o :o :w :w :w :o :w :w :o :o :o :o :w :o :o :o :o :o :w :o :w :o :o :o :o :o :o :g :w :o :o :o :w]])

(def test-map-10
  [[:o :w :w :w :w :o :o :o :o :w :w :w :o :w :o :o :w :o :w :o :w :o :o :o :w :o :o :o :w :o :o :o :w :o :o :o :o :w :o :o :w :o :o :o :o :o :w :o]
   [:o :w :o :o :w :w :o :o :o :w :o :o :o :w :w :o :o :o :w :o :w :o :o :o :o :o :w :o :w :o :o :o :w :o :o :w :o :w :o :o :o :o :o :w :o :o :o :o]
   [:o :w :o :o :w :o :o :w :o :w :o :o :o :w :o :o :w :o :w :o :w :w :o :w :w :w :w :w :w :o :w :w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :o :w]
   [:o :o :w :o :o :o :o :w :o :w :o :o :o :o :o :w :o :o :o :w :o :o :o :o :w :o :o :o :w :o :o :o :w :o :w :o :o :w :o :w :w :o :o :o :w :o :o :o]
   [:o :o :o :o :w :o :w :w :o :w :o :o :o :w :o :w :w :w :w :w :w :o :o :o :w :o :o :o :o :o :o :o :o :o :w :w :o :o :o :o :w :o :w :w :w :o :w :w]
   [:w :w :w :o :w :o :w :o :o :w :o :o :o :w :o :w :o :o :o :o :w :o :w :w :w :o :o :o :w :w :w :o :w :o :o :o :o :w :o :o :o :o :o :o :o :o :o :o]
   [:o :w :o :o :w :o :w :w :o :w :o :w :w :w :o :w :o :w :o :o :w :o :o :o :o :o :w :w :w :o :o :o :w :o :w :w :o :w :o :w :w :w :w :o :w :o :w :o]
   [:o :w :o :o :w :o :o :o :o :o :o :w :o :w :o :o :o :w :o :o :w :o :o :o :w :o :o :o :w :o :o :o :w :o :w :o :o :w :o :o :w :o :o :o :w :o :w :o]
   [:o :w :w :o :o :o :w :w :o :w :o :w :o :w :w :w :w :w :w :o :w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :w :w :w :w]
   [:o :s :w :o :w :o :o :o :o :w :o :o :o :w :o :o :w :o :o :o :w :o :o :o :o :o :w :o :o :o :w :o :o :o :o :w :o :w :o :o :o :o :w :o :o :w :o :o]
   [:o :o :w :o :w :o :w :w :w :w :w :w :w :w :w :o :w :o :o :o :w :o :o :o :o :o :w :o :o :o :w :o :w :w :w :w :o :w :w :o :w :o :w :o :w :w :w :o]
   [:o :w :w :o :w :o :o :w :o :o :w :o :o :w :o :o :o :o :o :o :w :o :w :w :w :w :w :o :w :w :w :o :o :w :o :w :o :o :o :o :w :o :w :o :o :w :o :o]
   [:o :o :o :o :w :o :w :w :o :o :w :o :o :w :w :w :w :o :w :w :w :o :o :o :w :o :w :o :o :o :w :o :o :w :o :w :w :o :w :w :w :w :w :w :o :w :o :w]
   [:o :w :o :o :w :o :o :w :w :o :w :o :o :w :o :o :o :o :o :o :w :o :w :o :w :o :o :o :o :o :o :o :o :o :o :w :o :o :w :o :o :o :w :o :o :w :o :o]
   [:o :w :o :o :w :o :o :w :o :o :w :o :o :w :o :w :w :o :o :o :w :o :w :o :o :o :w :w :w :w :o :w :w :w :w :w :w :o :w :o :w :o :o :o :w :w :w :o]
   [:w :w :w :o :w :o :o :o :o :o :o :o :o :w :o :o :w :o :o :o :w :w :w :o :w :w :w :o :o :o :o :o :w :o :o :o :o :o :w :w :w :o :w :o :o :o :o :o]
   [:o :w :o :o :w :w :w :w :w :w :o :w :w :w :o :o :w :w :w :o :w :o :o :o :w :o :w :o :o :w :o :o :w :o :o :w :o :o :o :o :w :o :w :w :w :o :w :w]
   [:o :w :o :w :w :o :o :o :w :o :o :o :o :w :w :w :w :o :w :o :w :o :w :o :o :o :w :o :o :w :o :o :o :o :o :w :o :w :w :o :w :o :w :o :w :o :o :o]
   [:o :o :o :o :w :o :o :o :w :o :o :o :o :o :o :o :o :o :w :o :w :w :w :w :w :w :w :w :w :w :w :o :w :w :w :w :o :o :w :o :o :o :w :o :o :o :o :o]
   [:o :w :o :o :w :o :w :w :w :w :w :o :w :w :o :o :o :o :o :o :w :o :o :o :o :w :o :o :w :o :o :o :o :o :o :w :w :w :w :w :w :w :w :w :w :w :o :w]
   [:o :w :w :o :w :o :o :o :o :o :o :o :o :w :o :w :w :w :w :o :w :o :w :o :w :w :w :o :o :o :o :o :w :o :w :w :o :o :o :w :o :o :o :o :o :o :o :o]
   [:o :w :o :o :w :o :o :o :w :o :w :o :o :w :o :o :w :o :w :o :w :o :w :o :o :w :w :w :w :w :o :w :w :o :o :w :o :w :o :w :o :o :w :o :w :o :w :o]
   [:o :w :o :o :w :o :o :o :w :o :w :o :o :w :o :o :o :o :o :o :w :o :w :o :o :w :o :w :o :o :o :o :w :o :w :w :o :w :o :o :o :o :w :o :w :o :w :o]
   [:w :w :w :w :w :w :w :o :w :w :w :w :w :w :w :w :w :w :w :o :o :o :w :w :w :w :o :w :o :w :o :o :w :o :o :w :w :w :w :w :o :w :w :w :w :o :w :o]
   [:o :o :o :o :o :o :w :o :o :o :o :w :o :o :o :o :o :w :o :o :w :o :o :o :o :w :o :o :o :w :o :o :w :o :o :w :o :o :o :o :o :w :o :o :w :o :w :o]
   [:o :w :o :w :o :o :w :o :w :o :w :w :o :o :w :w :o :o :o :o :w :o :w :w :w :w :w :w :w :w :w :w :w :w :o :w :o :w :w :w :o :w :o :o :w :o :o :o]
   [:w :w :w :w :w :o :w :o :w :o :o :w :o :w :w :o :o :w :o :o :w :o :o :w :o :w :o :o :w :o :w :o :o :o :o :w :o :w :o :o :o :w :w :o :w :o :w :o]
   [:o :w :w :o :o :o :w :o :w :o :o :o :o :o :w :w :w :w :w :o :w :o :o :o :o :o :o :w :w :o :w :o :o :o :o :w :o :o :o :o :o :o :o :o :w :o :w :o]
   [:o :o :w :o :o :o :o :o :w :o :o :w :o :o :w :o :o :o :o :o :w :o :w :w :w :w :o :o :w :o :w :w :w :w :o :w :w :w :o :w :w :w :w :w :w :o :w :o]
   [:w :o :w :w :w :o :w :o :w :w :w :w :w :w :w :w :w :o :w :w :w :o :o :w :o :w :o :o :o :o :w :o :o :o :o :w :o :o :o :w :o :w :o :o :w :w :w :o]
   [:o :o :o :o :o :o :w :o :o :w :o :w :o :o :o :o :o :o :w :o :w :w :o :w :o :w :o :w :w :w :w :o :w :w :w :w :o :w :o :w :o :w :o :w :w :o :w :o]
   [:o :o :w :o :w :o :w :w :o :o :o :w :o :w :w :w :o :o :o :o :w :w :o :o :o :w :o :o :o :o :o :o :o :o :o :w :o :w :o :o :o :o :o :o :w :o :o :g]])

(def test-mapw
  [[:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :o :o :o :o :o :o :w :o :o :o :o :o :o :o :o :w :w :w :w :w :o :o :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :o :o :o :o :o :o :w :o :w :w :w :w :w :w :o :o :o :w :w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :o :o :w]
   [:w :w :w :w :w :w :w :w :w :w :o :o :o :o :o :o :w :o :w :w :w :w :w :w :w :w :o :w :o :o :o :w :w :w :w :w :w :w :w :w :o :o :o :o :w :o :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :o :o :o :o :o :o :w :o :w :w :w :w :w :w :w :w :o :o :o :w :w :w :o :w :w :w :w :w :w :w :o :w :w :o :w :o :w :w :w]
   [:w :w :w :o :o :o :o :o :o :w :o :o :o :o :o :o :w :o :w :w :w :o :o :o :o :o :w :w :o :w :w :w :o :w :w :w :w :w :w :w :o :w :w :o :w :o :w :w :w]
   [:w :w :o :o :s :o :w :o :o :o :o :o :o :o :o :o :w :o :w :w :w :o :w :w :w :o :w :w :o :w :w :o :o :o :o :w :w :o :o :o :o :o :w :o :o :o :o :w :w]
   [:w :o :o :w :o :o :w :o :o :w :o :o :o :o :o :o :o :o :w :o :o :o :w :w :w :o :w :w :o :w :w :o :w :w :o :w :w :o :o :o :o :o :w :w :w :w :o :w :w]
   [:w :o :w :w :o :w :w :w :o :w :o :o :o :o :o :o :w :o :w :o :w :w :w :w :w :o :o :w :o :w :w :o :w :w :o :o :w :o :o :o :o :o :w :w :w :w :o :w :w]
   [:w :o :o :w :o :o :w :o :o :w :o :o :o :o :o :o :w :o :o :o :w :w :w :w :w :w :o :w :o :w :w :o :w :w :w :o :w :o :o :o :o :o :w :w :w :w :o :w :w]
   [:w :w :o :w :o :o :w :o :o :w :w :w :w :o :o :o :w :o :w :w :w :w :w :w :w :w :o :w :o :o :o :o :w :w :w :o :o :o :o :o :o :o :w :w :w :w :o :o :w]
   [:w :o :o :w :o :o :o :o :o :w :w :w :w :o :w :w :w :o :w :o :o :o :o :o :o :w :o :w :w :w :o :w :w :w :w :w :w :o :o :o :o :o :o :o :w :w :w :w :w]
   [:w :o :w :w :o :o :o :o :o :o :o :o :o :o :o :w :w :o :w :o :o :o :o :o :o :o :o :w :w :w :o :w :w :w :w :w :w :o :o :o :o :o :w :o :w :w :w :w :w]
   [:w :o :w :w :w :w :w :w :w :w :w :w :w :w :o :w :w :o :o :o :w :W :W :o :o :w :w :w :w :w :o :w :w :w :w :w :w :w :o :w :w :w :w :o :o :o :w :w :w]
   [:w :o :w :w :w :o :o :o :o :o :w :w :o :o :o :w :w :w :w :o :w :W :W :o :o :w :w :w :w :w :o :w :w :w :w :w :w :w :o :w :w :w :w :w :w :o :w :w :w]
   [:w :o :o :o :o :o :w :w :w :o :w :w :o :w :w :w :w :w :w :o :w :W :W :o :o :w :w :w :w :w :o :o :o :o :w :o :o :o :o :w :w :w :w :w :w :o :w :w :w]
   [:w :w :w :w :w :w :w :w :w :o :w :w :o :o :w :w :w :w :w :o :o :o :o :o :o :o :o :o :o :w :w :w :o :w :w :o :w :w :w :w :w :w :w :w :w :o :w :w :w]
   [:w :w :o :w :w :w :w :w :w :o :w :w :w :o :o :o :o :o :w :o :o :o :o :o :o :w :w :w :o :w :w :w :o :w :w :o :w :w :w :w :w :w :w :w :w :o :w :w :w]
   [:w :w :o :w :w :w :o :o :o :o :w :w :w :w :w :w :w :o :w :w :o :w :w :w :w :w :w :w :o :o :w :w :o :w :w :o :w :w :w :w :w :w :w :w :w :o :o :o :w]
   [:w :o :o :o :o :o :o :w :w :w :w :w :w :w :w :w :w :o :o :o :o :w :w :w :w :w :w :w :w :o :w :w :o :o :w :o :w :w :w :w :w :o :o :o :w :o :w :o :w]
   [:w :o :o :o :o :w :w :w :w :w :w :w :o :o :o :w :w :w :o :w :w :w :w :w :o :o :o :o :w :o :w :w :w :w :w :o :w :w :w :w :w :o :w :o :w :o :w :o :w]
   [:w :o :o :o :o :w :w :w :w :o :w :w :o :w :o :w :w :o :o :w :w :w :w :o :o :o :o :o :w :o :w :w :w :w :w :o :o :o :o :o :o :o :w :o :o :o :w :o :w]
   [:w :o :o :o :o :o :o :w :w :o :w :w :o :w :o :w :w :w :w :w :w :o :o :o :o :o :o :o :w :o :w :w :w :w :w :o :w :w :w :o :w :w :w :w :w :w :w :o :w]
   [:w :o :o :o :o :w :o :w :w :o :w :o :o :o :o :o :w :w :w :w :w :o :w :w :o :o :o :o :o :o :o :o :w :w :w :o :w :w :w :o :w :w :w :w :w :w :w :o :w]
   [:w :w :w :o :w :w :o :o :o :o :o :o :o :o :w :o :w :w :w :o :o :o :o :w :o :o :o :o :w :o :w :o :w :w :w :o :w :w :w :o :w :o :o :o :w :w :w :w :w]
   [:w :w :w :o :w :w :o :w :o :w :w :o :w :o :w :w :w :w :w :o :w :w :o :w :w :w :w :w :w :o :w :o :o :o :o :o :o :w :w :o :o :o :w :o :w :w :w :w :w]
   [:w :o :o :o :o :o :o :w :o :w :w :o :w :o :o :o :o :o :o :o :w :w :o :w :w :w :w :w :w :o :w :o :o :w :w :o :o :w :w :w :w :w :w :o :w :w :w :w :w]
   [:w :o :w :w :w :o :w :w :w :w :w :o :w :o :o :o :w :w :o :w :w :w :o :w :w :w :w :o :o :o :w :o :w :w :w :w :o :w :w :w :w :w :w :o :o :o :w :w :w]
   [:w :o :w :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :w :o :w :w :w :o :o :w :w :w :o :o :w :w :o :o :w :w :w :w :w :w :w :w :o :w :w :w]
   [:w :w :w :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :w :o :o :o :o :o :w :w :w :w :o :o :o :o :o :o :w :w :w :w :w :w :w :w :o :w :w :w]
   [:w :w :w :w :o :o :o :o :o :o :w :w :w :o :o :w :w :w :o :w :w :w :o :w :w :o :w :w :w :w :w :o :o :o :o :o :o :w :w :w :w :o :o :o :o :o :o :w :w]
   [:w :w :w :w :o :o :w :o :w :o :w :w :w :o :w :w :o :o :o :o :o :w :o :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :o :o :o :o :o :o :o :o :w :w]
   [:w :w :w :w :o :o :o :o :o :o :o :o :o :o :w :w :o :o :o :o :o :o :o :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :o :o :o :o :o :o :w :w]
   [:w :w :w :w :o :o :w :o :w :o :w :w :o :w :w :w :o :o :o :o :o :w :w :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :o :o :o :o :o :o :w :w]
   [:w :w :o :o :o :o :o :o :o :o :w :w :o :o :o :o :o :o :o :o :w :w :w :w :o :o :w :w :w :w :w :w :w :w :o :o :o :o :o :o :o :o :o :o :o :o :o :w :w]
   [:w :w :o :w :o :o :w :o :w :o :w :w :w :w :o :w :o :o :o :o :w :w :w :w :w :o :o :o :o :o :o :o :o :o :o :w :w :w :o :w :w :o :o :o :o :o :o :w :w]
   [:w :w :o :w :o :o :o :o :o :o :w :w :w :w :o :w :w :w :w :w :w :w :w :o :o :o :w :w :w :w :w :o :w :w :w :w :w :w :o :w :w :o :o :o :o :o :o :w :w]
   [:w :w :o :w :w :w :w :w :w :w :w :w :w :w :o :o :o :o :w :w :w :w :w :o :w :w :w :w :w :w :w :o :o :w :w :w :w :w :o :o :o :o :o :o :o :o :o :w :w]
   [:w :w :o :o :o :o :o :o :o :o :w :w :w :w :w :w :w :o :w :w :w :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :w :w :o :o :o :o :o :o :w :w]
   [:w :w :w :w :w :w :w :w :w :o :w :w :w :w :w :o :o :o :o :o :w :w :w :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :w :w :w :w :w :w :w :o :w :w]
   [:w :w :o :o :o :o :o :o :o :o :w :w :w :w :w :o :w :w :w :o :w :w :w :o :w :w :w :w :w :o :o :o :o :o :w :w :o :w :w :w :w :w :w :w :w :w :o :w :w]
   [:w :w :o :w :w :w :w :w :w :w :w :w :w :w :w :o :w :o :w :o :o :o :o :o :w :w :w :w :w :o :o :o :o :o :w :w :o :w :w :w :w :w :o :o :o :o :o :o :w]
   [:w :w :o :o :o :o :o :w :w :w :w :w :w :w :w :o :w :w :w :o :w :w :o :w :w :w :o :o :o :o :o :o :o :o :w :w :o :w :w :w :w :w :o :w :w :w :w :o :w]
   [:w :w :w :w :w :w :o :w :w :w :w :w :w :w :w :o :o :o :o :o :w :w :o :w :w :w :o :w :w :o :o :o :o :o :o :o :o :o :o :w :w :w :o :w :w :w :w :o :w]
   [:w :w :w :w :w :w :o :o :o :o :o :o :o :o :o :o :o :o :o :o :w :w :o :w :w :w :o :w :w :o :o :o :o :o :w :w :w :w :o :w :w :w :o :w :w :w :w :o :w]
   [:w :w :w :w :w :w :w :w :w :o :w :w :w :w :w :o :w :w :w :w :w :w :o :w :w :w :o :w :w :o :o :o :o :o :w :w :w :o :o :w :w :w :o :w :o :o :o :g :w]
   [:w :w :w :w :w :w :w :w :w :o :w :w :w :w :w :o :w :w :w :o :w :w :o :w :w :w :o :o :w :w :w :w :w :w :w :w :w :o :w :w :w :w :o :w :o :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :o :w :w :w :w :w :o :w :o :o :o :o :o :o :w :w :w :w :o :w :w :w :w :w :w :w :w :w :o :o :w :w :w :o :o :o :w :w :w :w]
   [:w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :o :o :o :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w :w]])

(def test-map-12
  [[:o :o :w :o :o]
   [:w :o :w :w :g]
   [:o :s :o :o :o]
   [:w :o :w :w :o]
   [:o :o :w :o :o]])