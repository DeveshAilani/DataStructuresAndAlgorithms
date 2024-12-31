package z_experimental

/* Pattern 1:

 *
 * *
 * * *
 * * * *
 * * * * *

 */

fun main() {
    printPattern(row = 5, column = 5)
}

private fun printPattern(row: Int, column: Int) {
    for (i in 1..row) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}
// i -> 1, 2, 3, 4, 5
// j = 1
// j = 1, 2
// j = 1, 2, 3
