package thor

object PrimeStream {
  private def isPrime(number: Int): Boolean =
    number > 1 && !(2 until number).exists(number % _ == 0)

  def generatePrimesFrom(starting: Int): LazyList[Int] = {
    if (isPrime(starting)) {
      starting #:: generatePrimesFrom(starting + 1)
    } else {
      generatePrimesFrom(starting + 1)
    }
  }
}
