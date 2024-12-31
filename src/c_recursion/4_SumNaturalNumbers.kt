package c_recursion


/*
Sum of first N Natural Numbers
Problem Statement: Given a number ‘N’, find out the sum of the first N natural numbers.
Input:N = 5
Output: 15

Input:N = 6
Output: 21
 */
fun main() {
    val sum = 0
    val input1 = 5
    val input2 = 6
    // printSumOfNaturalNumber(input1, sum)
    // println("-------")
    // printSumOfNaturalNumber(input2, sum)

    sumOfNaturalNumber1(input1)
    sumOfNaturalNumber1(input2)
    println("-------")

    sumOfNaturalNumber2(input1, sum)
    sumOfNaturalNumber2(input2, sum)
    println("-------")

    println(sumOfNaturalNumber3(input1))
    println(sumOfNaturalNumber3(input2))
    println("-------")
}

// Method 1: using maths formula
fun sumOfNaturalNumber1(n: Int) {
    if(n < 1){
        println("Invalid Input")
        return
    }

    val sum = (n*(n+1))/2
    println(sum)
}


// Method 2: Parameterized Way
private fun sumOfNaturalNumber2(num: Int, sum: Int) {
    if (num < 1) {
        println("Invalid Input")
        return
    }

    val total = sum + num
    if (num > 1) {
        sumOfNaturalNumber2(num - 1, total)
    } else {
        println(total)
    }
}

// Method 3: Functional Way
private fun sumOfNaturalNumber3(num: Int):Int {
    if (num < 1) {
        println("Invalid Input")
        return -1
    }

    if (num > 1) {
        return num + sumOfNaturalNumber3(num - 1)
    } else return 1
}

// num = 5            -->  15
// return(5 + fun(4)) -->  5 + 10
// return(4 + fun(3)) -->  4 + 6
// return(3 + fun(2)) -->  3 + 3
// return(2 + fun(1)) -->  2+1
// return 1
