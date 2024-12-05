package b_basic_math

import kotlin.math.log10


/*
Reverse Digits of A Number
Problem Statement: Given an integer N return the reverse of the given number.

Example 1:
Input:N = 12345
Output: 54321

Example 2:
Input:N = 10400
Output: 401
 */
fun main() {
    println("Input: 12345,   Output: " + reverseDigit1(12345))
    println("Input: 10400,   Output: " + reverseDigit2(10400))

    println()

    println("Input: 12345,   Output: " + reverseDigit2(12345))
    println("Input: 10400,   Output: " + reverseDigit2(10400))
}

private fun reverseDigit1(num: Int): Int {
    val sb = StringBuilder()
    var n = num
    while (n > 0) {
        val digit = n % 10
        sb.append("$digit")
        n /= 10
    }
    return sb.toString().toInt()
}

private fun reverseDigit2(num: Int): Int {
    var n = num
    var reverseNum = 0
    while (n > 0) {
        val digit = n % 10
        reverseNum = (reverseNum * 10) + digit
        n /= 10
    }
    return reverseNum
}


