package a_patterns


/* Pattern 9

        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

for 5 rows
spc *   *
1   4   3
2   3   2
3   2   1
4   1   0

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    for (i in 1..row) {
        for (j in i..<row) {
            print("  ")
        }
        for (j in 1..i) {
            print("* ")
        }
        for (j in 1..<i) {
            print("* ")
        }
        println()
    }

    for (i in row - 1 downTo 1) {
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