package b_basic_math

import kotlin.math.log10


/*
Check if a number is Palindrome or Not
Problem Statement: Given an integer N, return true if it is a palindrome else return false.

Example 1:
Input:N = 4554
Output:Palindrome Number

Example 2:
Input:N = 7789
Output: Not Palindrome
 */
fun main() {
    val input1 = 4554
    val input2 = 7789
    val input3 = 22322
    val input4 = 87789
    println("Input: $input1,   Output: " + checkPalindrome(input1))
    println("Input: $input2,   Output: " + checkPalindrome(input2))
    println("Input: $input3,   Output: " + checkPalindrome(input3))
    println("Input: $input4,   Output: " + checkPalindrome(input4))
}

private fun checkPalindrome(num: Int): Boolean {
    val digitCount = log10(num.toDouble()).toInt() + 1
    var start = num
    var end = 0
    for (i in 1..digitCount / 2) {
        val lastDigit = start % 10
        end = (end * 10) + lastDigit
        start /= 10
    }
    if (digitCount % 2 != 0) {
        start /= 10
    }
    return start == end
}


