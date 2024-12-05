package c_recursion

import kotlin.math.log10


/*
Print numbers using recursion
Problem Statement: Given an integer N, print the number from N to 1 using recursion
Input:N = 5
Output: 5, 4, 3, 2, 1
 */
fun main() {
    val input1 = 5
    val input2 = 10
    printNumberUsingRecursion(input1)
    println("-----")
    printNumberUsingRecursion(input2)
}

private fun printNumberUsingRecursion(num: Int) {
    if (num < 1) {
        println("Invalid Input")
        return
    }

    println(num)
    if (num > 1) {
        printNumberUsingRecursion(num - 1)
    }
}