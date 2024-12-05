package c_recursion

import kotlin.math.log10


/*
Print numbers using recursion
Problem Statement: Given an integer N, print the number from 1 to N using recursion
Input:N = 5
Output:1, 2, 3, 4, 5
 */
fun main() {
    val input1 = 5
    val input2 = 10

    printTillUsingRecursion(input1)
    println("---")
    printTillUsingRecursion(input2)
}

private fun printTillUsingRecursion(num: Int) {
    if (num < 1) {
        println("Invalid input")
        return
    }

    if (num > 1) {
        printTillUsingRecursion(num -1)
    }

    println(num)
}
