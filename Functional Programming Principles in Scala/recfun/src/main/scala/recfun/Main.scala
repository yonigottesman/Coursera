package recfun

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
    def pascal(c: Int, r: Int): Int = if (c == 0 || c == r || r == 0) 1 else pascal(c-1,r-1) + pascal(c,r-1)
  
  /**
   * Exercise 2
   */
    def balance(chars: List[Char]): Boolean = {

      def calcCount(count: Int, sign: Char): Int = if (sign == ')') count - 1
      else if (sign == '(') count + 1
      else count

      def iterate(count: Int, partialChars: List[Char]): Boolean = if (partialChars.size == 0 && count == 0) true
      else if ((partialChars.size == 0 && count != 0) || (partialChars.head == ')' && count == 0)) false
      else  iterate(calcCount(count,partialChars.head),partialChars.tail)

      iterate(0,chars)
    }
  
  /**
   * Exercise 3
   */
    def countChange(money: Int, coins: List[Int]): Int = {
      if (money == 0) 1
      else if (money < 0) 0
      else if (coins.isEmpty && money != 0) 0
      else countChange(money,coins.tail) + countChange(money-coins.head,coins)
    }


  }
