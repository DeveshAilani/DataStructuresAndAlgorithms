package a_patterns


/* Pattern 4:

 1
 2 2
 3 3 3
 4 4 4 4
 5 5 5 5 5

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    for (i in 1..row) {
        for (j in 1..i) {
            print("$i ")
        }
        println()
    }
}