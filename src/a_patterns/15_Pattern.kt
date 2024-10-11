package a_patterns


/* Pattern 15

 1    2    3    4
 12  13   14    5
 11  16   15    6
 10   9    8    7

 */
fun main() {
    printPattern(n = 0)
}

private fun printPattern(n: Int) {
    val array = Array(n) { IntArray(n) }
    var top = 0
    var left = 0
    var right = n - 1
    var bottom = n - 1
    var num = 1

    while (num <= n * n) {
        // Left to Right from Top
        for (i in left..right) {
            array[top][i] = num
            num++
        }
        top++

        // Top to Bottom from End
        for (i in top..bottom) {
            array[i][right] = num
            num++
        }
        right--

        // Right to left from Bottom
        for (i in right downTo left) {
            array[bottom][i] = num
            num++
        }
        bottom--

        // Bottom to Top from Start
        for (i in bottom downTo top) {
            array[i][left] = num
            num++
        }
        left++
    }

    printArray(array, num)
}

private fun printArray(array: Array<IntArray>, maxNum: Int) {
    if (array.isEmpty()) {
        println("Array is empty")
        return
    }
    val maxNumSize = maxNum.toString().length
    for (i in 0..<array.size) {
        for (j in 0..<array.size) {
            val num = array[i][j]
            val numSize = num.toString().length
            val spaceCount = (maxNumSize + 3) - numSize
            val sb = StringBuilder(num.toString())
            for (k in 1..spaceCount) {
                sb.append(" ")
            }
            print(sb.toString())
        }
        println()
    }
}