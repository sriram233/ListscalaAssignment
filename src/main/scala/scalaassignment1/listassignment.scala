package scalaassignment1

object listassignment {
  def main(args: Array[String]): Unit={
    val word = List("Scala","Spark","Training")
    println("the list of word: "+word)
    println("second element of the list: " +word(1))
    val wordcount = word.count(x=>x.length==5)
    println("number of words with lenght 5:" +wordcount)
    val worddrop = word.drop(1)
    println(worddrop)
    val worddropright = word.dropRight(2)
    println(worddropright)
    println("does list contain spark:" +word.contains("Spark"))
    val wordfilter = word.filter(x=>x.length==5)
    println("elements with length 4:" +wordfilter)
    println("first element of list"+word.head)
    println("list of elements except last element:" +word.init)
    println("is list empty:" +word.isEmpty)
    println("list with easy concatinate:"+word.map(x=>x.concat("easy")))




  }

}
