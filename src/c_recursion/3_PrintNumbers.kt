package c_recursion

/*
Print numbers without using loop
or
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
    printNumberUsingRecursion(-6)
    printNumberUsingRecursion(0)
    printNumberUsingRecursion(1)
}

private fun printNumberUsingRecursion(num: Int) {
    if (num < 1) {
        println("Invalid Input")
        return
    }

    if(num > 1) {
        print("$num, ")
        printNumberUsingRecursion(num - 1)
    } else {
        println(num)
    }
}