package a_patterns


/* Pattern 12

A
A B
A B C
A B C D
A B C D E

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    for (i in 0..<row) {
        for (j in 0..i) {
            val c = 'A' + j
            print("$c ")
        }
        println()
    }
}