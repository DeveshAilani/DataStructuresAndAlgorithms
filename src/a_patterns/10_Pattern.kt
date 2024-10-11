package a_patterns


/* Pattern 10

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
0 1 0 1 0 1
1 0 1 0 1
0 1 0 1
1 0 1
0 1
1

 */
fun main() {
    printPattern(row = 5)
}

private fun printPattern(row: Int) {
    var rowFlag = true
    var columnFlag = true
    for (i in 1..row) {
        for (j in 1..i) {
            if (columnFlag) {
                print("1 ")
            } else {
                print("0 ")
            }
            columnFlag = columnFlag.not()
        }
        rowFlag = rowFlag.not()
        columnFlag = rowFlag
        println()
    }
    for (i in row - 1 downTo 1) {
        for (j in i downTo 1) {
            if (columnFlag) {
                print("1 ")
            } else {
                print("0 ")
            }
            columnFlag = columnFlag.not()
        }
        rowFlag = rowFlag.not()
        columnFlag = rowFlag
        println()
    }
}