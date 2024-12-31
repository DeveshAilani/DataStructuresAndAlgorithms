package c_recursion


/*
    Factorial of a Number
    Problem Statement: Given a number X,  print its factorial
    Input:N = 5
    Output: 120
    Explanation: 5! = 5*4*3*2*1

    Input:N = 3
    Output: 6
    Explanation: 3! = 3*2*1
 */
fun main() {
    val input1 = 5
    val input2 = 4
    val input3 = 3
    println(findFactorial(input1))
    println(findFactorial(input2))
    println(findFactorial(input3))

    println("------")

    findFactorial2(-1)
    findFactorial2(input2)
    findFactorial2(input3)
}

private fun findFactorial(num: Int):Int {
    if (num < 1) {
        println("Invalid Input")
        return -1
    }

    if (num > 1) {
        return num * findFactorial(num - 1)
    } else {
        return 1
    }
}

fun findFactorial2(num: Int){

    if(num < 1){
        println("Invalid Input")
        return
    }

    var factorial = 1
    for(i in 1..num){
        factorial *= i
    }
    println(factorial)
}

// num = 4
// return( 4 * fun(3)) = 4x3x2x1
// return( 3 * fun(2)) = 3x2x1
// return( 2 * fun(1)) = 2x1
// return(1)