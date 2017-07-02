import objsets._



val set1 = new Empty
val set2 = set1.incl(new Tweet("a", "aaaa", 21))
val set3 = set2.incl(new Tweet("b", "bbbb", 20))
val c = new Tweet("c", "ccc", 23)
val d = new Tweet("d", "dddd", 9)
val set4c = set3.incl(c)
val set4d = set3.incl(d)
val set5 = set4c.incl(d)

val t = set4c.filter(tw => tw.user == "a" || tw.user == "b")

val m = set4c.mostRetweeted

val mm = set4c.descendingByRetweet



val at = TweetReader.allTweets

val googleTweets: TweetSet = at.filter(tw => (tw.text.contains("an")))

at.isEmpty




