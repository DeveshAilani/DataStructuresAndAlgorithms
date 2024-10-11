package a_patterns


/* Pattern 8

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

 */
fun main() {
    printPattern(row = 7)
}

private fun printPattern(row: Int) {
    for (i in row downTo 1) {
        for (j in i..<row) {
            print("  ")
        }
        for (j in i downTo 1) {
            print("* ")
        }
        for (j in i downTo 2) {
            print("* ")
        }
        println()
    }
}