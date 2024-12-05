package b_basic_math

import kotlin.math.log10
import kotlin.math.sqrt


/*
Check if a number is prime or not
Problem Statement: Given an integer N, check whether it is prime or not. A prime number is a number that is only divisible by 1
and itself and the total number of divisors is 2.

Example 1:
Input:N = 2
Output:True
Explanation: 2 is a prime number because it has two divisors: 1 and 2 (the number itself).

Example 2:
Input:N =10
Output: False
Explanation: 10 is not prime, it is a composite number because it has 4 divisors: 1, 2, 5 and 10.
 */
fun main() {
    val input1 = 2
    val input2 = 10
    val input3 = 13
    val input4 = 17

    checkIfPrimeNumber1(input1)
    checkIfPrimeNumber1(input2)
    checkIfPrimeNumber1(input3)
    checkIfPrimeNumber1(input4)

    println()

    checkIfPrimeNumber2(input1)
    checkIfPrimeNumber2(input2)
    checkIfPrimeNumber2(input3)
    checkIfPrimeNumber2(input4)
}

private fun checkIfPrimeNumber1(num: Int) {
    for (i in 2..<num) {
        if (num % i == 0) {
            println("$num is NOT prime number")
            return
        }
    }
    println("$num is prime number")
}

private fun checkIfPrimeNumber2(num: Int) {
    val sqrtNum = sqrt(num.toDouble()).toInt()

    for (i in 2..sqrtNum) {
        if (num % i == 0) {
            println("$num is NOT prime number")
            return
        }
    }

    println("$num is prime number")
}