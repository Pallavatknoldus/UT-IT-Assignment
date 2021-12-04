package com.knoldus.calculations

class PalindromeAndFactorial extends PalindromeAndFactorialTrait {

  def isPalindrome(Number: Int): Boolean = {
    var remainder: Int = 0
    var temp: Int = Number
    var sum: Int = 0

    while (temp > 0) {
      remainder = temp % 10
      sum = (sum * 10) + remainder
      temp = temp / 10
    }
    if (Number == sum)
      true
    else
       false
  }

  def isFactorial(Number: Int): Int = {
    var result: Int = 1
    for (i <-2 to Number){
      result *= i
    }
    result
  }

}
