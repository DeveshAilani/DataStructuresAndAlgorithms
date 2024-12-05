package b_basic_math

import kotlin.math.max


/*
Find GCD of two numbers

Problem Statement: Given two integers N1 and N2, find their greatest common divisor.

The Greatest Common Divisor of any two integers is the largest number that divides both integers.

Example 1:
Input:N1 = 9, N2 = 12
Output:3
Explanation:Factors of 9: 1, 3 and 9
Factors of 12: 1, 2, 3, 4, 6, 12
Common Factors: 1, 3 out of which 3 is the greatest hence it is the GCD.

Example 2:
Input:N1 = 20, N2 = 15
Output: 5
Explanation:Factors of 20: 1, 2, 4, 5
Factors of 15: 1, 3, 5
Common Factors: 1, 5 out of which 5 is the greatest hence it is the GCD

 */
fun main() {
    val input1 = 9
    val input2 = 12
    val input3 = 20
    val input4 = 15
    val input5 = 7
    val input6 = 15

    println("N1=$input1,\t N2=$input2,\t GCD=${findGcd2(input1, input2)}")
    println("N1=$input3,\t N2=$input4,\t GCD=${findGcd2(input3, input4)}")
    println("N1=$input5,\t N2=$input6,\t GCD=${findGcd2(input5, input6)}")
}

private fun findGcd(n1: Int, n2: Int): Int {
    val num = if (n1 < n2) {
        n1
    } else {
        n2
    }
    for (i in num downTo 1) {
        if (n1 % i == 0 && n2 % i == 0) {
            return i
        }
    }
    return 1
}

private fun findGcd2(n1: Int, n2: Int): Int {
    var num1 = n1
    var num2 = n2
    while (num1 > 0 && num2 > 0) {
        if (num1 > num2) {
            num1 -= num2
        } else {
            num2 -= num1
        }
    }
    return max(num1, num2)
}