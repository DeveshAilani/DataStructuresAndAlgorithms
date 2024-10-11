package a_patterns


/* Pattern 1:
 * * * * *
 * * * * *
 * * * * *
 * * * * *
 */
fun main() {
    printPattern(row = 5, column = 6)
}

private fun printPattern(row: Int, column: Int) {
    for (i in 1..row) {
        for (j in 1..column) {
            print("* ")
        }
        println()
    }
}