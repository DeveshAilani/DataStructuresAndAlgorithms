package c_recursion

import kotlin.math.log10


/*
Print Name N times using Recursion
Input:N = 5
Input: Name = Devesh
Output:Devesh, Devesh, Devesh, Devesh, Devesh
 */
fun main() {
    val n = 5
    val name = "Devesh"
    printName(n, name)
}

private fun printName(n: Int, name: String) {
    if (n < 1) {
        println("Invalid Input")
        return
    }

    if (n > 1) {
        printName(n - 1, name)
    }
    println("$n. $name")
}