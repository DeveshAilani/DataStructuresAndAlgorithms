package a_patterns


/* Pattern 11

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1

 */
fun main() {
    printPattern(row = 7)
}

private fun printPattern(row: Int) {
    var flag = true
    for (i in 1..row) {
        for (j in 1..i) {
            if (flag) {
                print("1 ")
            } else {
                print("0 ")
            }
            flag = flag.not()
        }
        println()
    }
}