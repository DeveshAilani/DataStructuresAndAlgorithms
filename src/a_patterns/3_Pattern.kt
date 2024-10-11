package a_patterns


/* Pattern 3:

 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    for (i in 1..row) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}