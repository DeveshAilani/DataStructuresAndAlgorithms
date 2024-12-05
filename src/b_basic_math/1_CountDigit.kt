package b_basic_math

import kotlin.math.log10


/*
Count digits in a number
Problem Statement: Given an integer N, return the number of digits in N.
Input:N = 12345
Output:5
 */
fun main() {
    val num = 123456789
    println("Method 1: " + countDigit1(num))
    println("Method 2: " + countDigit2(num))
    println("Method 3: " + countDigit3(num))
}

private fun countDigit1(num: Int): Int {
    return num.toString().length
}

private fun countDigit2(num: Int): Int {
    var n = num
    var count = 0
    while (n > 0) {
        count++
        n /= 10
    }
    return count
}

private fun countDigit3(num: Int):Int{
    return (log10(num.toDouble()) +1).toInt()
}


