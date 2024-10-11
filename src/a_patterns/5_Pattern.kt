package a_patterns


/* Pattern 5:

* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

 */
fun main() {
    printPattern(row = 7)
}

private fun printPattern(row: Int) {
    for (i in 1..row) {
        for (j in row downTo i) {
            print("* ")
        }
        println()
    }
}