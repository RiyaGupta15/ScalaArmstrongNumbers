object ArmstrongNumbers extends App{

  def isArmstrongNumber(number: Int): Boolean = {
    var result:Double = 0
    var new_number:Int = number
    while (new_number > 0) {
      val mod = (new_number % 10)
      result = result+ Math.pow(mod, number.toString.length)
      new_number = new_number / 10
    }
    if (result == number) true
    else false
  }
}