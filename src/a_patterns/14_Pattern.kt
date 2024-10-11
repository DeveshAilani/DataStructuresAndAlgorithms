package a_patterns


/* Pattern 14

4 4 4 4 4 4 4
4 3 3 3 3 3 4
4 3 2 2 2 3 4
4 3 2 1 2 3 4
4 3 2 2 2 3 4
4 3 3 3 3 3 4
4 4 4 4 4 4 4


 */
fun main() {
    printPattern(n = 9)
}

private fun printPattern(n: Int) {
    for (i in n downTo 2) {
        for (j in n downTo 2) {
            if (j > i) {
                print("$j ")
            } else {
                print("$i ")
            }
        }
        for (j in 1..n) {
            if (j > i) {
                print("$j ")
            } else {
                print("$i ")
            }
        }
        println()
    }
    for (i in 1.. n) {
        for (j in n downTo  2) {
            if (j > i) {
                print("$j ")
            } else {
                print("$i ")
            }
        }
        for (j in 1..n) {
            if (j > i) {
                print("$j ")
            } else {
                print("$i ")
            }
        }
        println()
    }
}