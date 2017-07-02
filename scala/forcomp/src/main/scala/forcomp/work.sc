import forcomp.Anagrams
import forcomp.Anagrams.{Occurrences, Sentence}

val wa = Anagrams.wordOccurrences("yesm" )
val wc = Anagrams.combinations(wa) map( comb => Anagrams.dictionaryByOccurrences(comb)) filter (x => !x.isEmpty) flatten


wc.contains(Anagrams.wordOccurrences("yesm"))

Anagrams.dictionaryByOccurrences(List(('m',1),('y',1)))


