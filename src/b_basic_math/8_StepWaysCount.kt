package b_basic_math

import kotlin.math.log10


/*
Problem Statement: You have staircase with N steps. you can clam either 1, 2 or 3 steps at a time.
total how many ways you can reach to the end of the staircase

Input:N = 2
Output:4
1, 1
2

Input:N = 3
Output:4
1, 1, 1
1, 2
2, 1
3

Input:N = 4
Output: 7
1, 1, 1 ,1

2, 1, 1
1, 2, 1
1, 1, 2

2, 2
3, 1

1, 3

Input:N = 5
Output: 13
1, 1, 1, 1, 1

2, 1, 1, 1
1, 2, 1, 1
1, 1, 2, 1
1, 1, 1, 2

2, 2, 1
2, 1, 2
1, 2, 2

3, 1, 1
1, 3, 1
1, 1, 3

3, 2
2, 3

Input:N = 6
Output: 22
1, 1, 1, 1, 1, 1

1, 1, 1, 1, 2
1, 1, 1, 2, 1
1, 1, 2, 1, 1
1, 2, 1, 1, 1
2, 1, 1, 1, 1

2, 2, 1, 1
1, 2, 2, 1
1, 1, 2, 2
2, 1, 1, 2

2, 2, 2

3, 1, 1, 1
1, 3, 1, 1
1, 1, 3, 1
1, 1, 1, 3

3, 2, 1
3, 1, 2
2, 3, 1
2, 1, 3
1, 2, 3
1, 3, 2

3, 3




 */
fun main() {
    val steps = 7
    getNumberOfWays(steps)
}

private fun getNumberOfWays(steps: Int) {
    if (steps <= 0) {
        println("No Way to go :( ")
    }

    if (steps == 1 || steps == 2) {
        println("Number of ways is $steps")
    }

    var numberOfWays = 1

    if (steps % 2 == 0) {
        numberOfWays++
    }

    if (steps % 3 == 0) {
        numberOfWays++
    }

    for (i in 1..steps-2) {

    }

    println("Number of ways is $numberOfWays")
}
