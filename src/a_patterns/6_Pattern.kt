package a_patterns


/* Pattern 6:

1 2 3 4 5 6
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */
fun main() {
    printPattern(row = 7)
}

private fun printPattern(row: Int) {
    for (i in row downTo 1) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}