package a_patterns


/* Pattern 2:

 *
 * *
 * * *
 * * * *
 * * * * *

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    for (i in 1..row) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}