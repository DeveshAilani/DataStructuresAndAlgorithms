package a_patterns


/* Pattern 7

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
fun main() {
    printPattern(row = 7)
}

private fun printPattern(row: Int) {
    for (i in 1..row) {
        for (j in i..<row) {
            print("  ")
        }
        for (k in 1..i) {
            print("* ")
        }
        for (m in 2..i) {
            print("* ")
        }
        println()
    }
}