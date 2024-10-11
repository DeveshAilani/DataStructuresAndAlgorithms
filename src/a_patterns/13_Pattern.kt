package a_patterns


/* Pattern 13

E
D E
C D E
B C D E
A B C D E

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    for (i in row downTo 0) {
        for (j in i ..<row) {
            val c = 'A' + j
            print("$c ")
        }
        println()
    }
}