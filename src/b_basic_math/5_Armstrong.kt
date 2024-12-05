package b_basic_math

import kotlin.math.log10
import kotlin.math.max


/*
Check if a number is Armstrong Number or not

Problem Statement: Given an integer N, return true it is an Armstrong number otherwise return false.

An Amrstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Example 1:
Input:N = 153
Output:True
Explanation: 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

Example 2:
Input:N = 1634
Output: True
Explanation: 1^4 + 6^4 + 3^4 + 4^4 = 27 + 343 + 1 = 1634


 */
fun main() {
    val input1 = 153
    val input2 = 1634
    val input3 = 37243

    println("$input1,\t is Armstrong:${armstrongNumber(input1)}")
    println("$input2,\t is Armstrong:${armstrongNumber(input2)}")
    println("$input3,\t is Armstrong:${armstrongNumber(input3)}")
}

private fun armstrongNumber(num: Int): Boolean {
    val digits = log10(num.toDouble()).toInt() + 1
    var input = num
    var sum = 0
    while (input > 0) {
        val lastDigit = input % 10
        var temp = lastDigit
        for (i in 1..<digits) {
            temp *= lastDigit
        }
        sum += temp
        input /= 10
    }
    return num == sum
}

