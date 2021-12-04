package com.knoldus.calculations

import org.scalatest.flatspec.AnyFlatSpec

class PalindromeAndFactorialTest extends AnyFlatSpec {

  "A number" should "be palindrome" in {
    val obj = new PalindromeAndFactorial()
    assert(obj.isPalindrome(4556554))
  }
  "A number" should "not be palindrome" in {
    val obj = new PalindromeAndFactorial()
    assert(!obj.isPalindrome(1212))
   }
  "A number" should "not be palindrome as it is negative" in {
    val obj = new PalindromeAndFactorial()
    assert(!obj.isPalindrome(-12570))
  }
  "A number" should "be palindrome as 0 is palindrome" in {
    val obj = new PalindromeAndFactorial()
    assert(obj.isPalindrome(0))
  }
  "A condition" should "be valid as 5 will return 120" in {
    val obj = new PalindromeAndFactorial()
    assert(120==obj.isFactorial(5))
  }
  "A condition" should "be valid as 0 will return 1" in {
    val obj = new PalindromeAndFactorial()
    assert(1==obj.isFactorial(0))
  }
  "A condition" should "be invalid as 7 will return 720" in {
    val obj = new PalindromeAndFactorial()
    assert(!(720==obj.isFactorial(7)))
  }
}
