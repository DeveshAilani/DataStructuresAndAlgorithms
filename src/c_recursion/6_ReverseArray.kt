package c_recursion


/*
    Reverse a given Array
    Problem Statement: You are given an array. The task is to reverse the array and print it.

    arr[] = {5,4,3,2,1}
    Output: {1,2,3,4,5}

    arr[] = {10,20,30,40}
    Output: {40,30,20,10}
 */
fun main() {
    val input1 = arrayOf(5, 4, 3, 2, 1)
    val input2 = arrayOf(10, 20, 30, 40)

    reverseArray1(input1)
    println()
    reverseArray1(input2)
}

// Solution 1: Space-optimized iterative method
private fun reverseArray1(arr: Array<Int>) {
    if (arr.isEmpty()) {
        println("Invalid Input")
        return
    }

    var startIndex = 0
    var endIndex = arr.size - 1
    while ((startIndex != endIndex) && (startIndex < endIndex)) {
        arr[startIndex] = arr[startIndex] + arr[endIndex]
        arr[endIndex] = arr[startIndex] - arr[endIndex]
        arr[startIndex] = arr[startIndex] - arr[endIndex]
        startIndex++
        endIndex--
    }

    for (x in arr) {
        print("$x ")
    }
}

// Solution 2: Recursive method

