package b_basic_math

import java.util.LinkedList
import kotlin.math.log10
import kotlin.math.max
import kotlin.math.sqrt


/*
Print all Divisors of a given Number

Problem Statement: Given an integer N, return all divisors of N.

A divisor of an integer N is a positive integer that divides N without leaving a remainder. In other words,
if N is divisible by another integer without any remainder, then that integer is considered a divisor of N.

Example 1:
Input:N = 36
Output:[1, 2, 3, 4, 6, 9, 12, 18, 36]
Explanation: The divisors of 36 are 1, 2, 3, 4, 6, 9, 12, 18, 36.

Example 2:
Input:N =12
Output: [1, 2, 3, 4, 6, 12]
Explanation: The divisors of 12 are 1, 2, 3, 4, 6, 12.

 */
fun main() {
    val input1 = 36
    val input2 = 12
    printAllDivisors(input1)
    println()
    printAllDivisors(input2)

    println()

    printLinkedList(getAllDivisors2(input1))
    println()
    printLinkedList(getAllDivisors2(input2))
}

private fun printAllDivisors(num: Int) {
    print("1")
    for (i in 2..num) {
        if (num % i == 0) {
            print(", $i")
        }
    }
}

private fun getAllDivisors2(num: Int): LinkedList<Int> {
    var index = 0
    val divisorList = LinkedList<Int>()

    val sqrtNum = sqrt(num.toDouble()).toInt()
    for (i in 1..sqrtNum) {
        if (num % i == 0) {
            divisorList.add(index, i)
            index++
            if (i != num / i) {
                divisorList.add(index, num / i)
            }
        }
    }
    return divisorList
}

private fun printLinkedList(list: LinkedList<Int>) {
    for (i in list) {
        print("$i \t")
    }
}