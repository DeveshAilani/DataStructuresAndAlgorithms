## Data Structures and Algorithms Interview Questions & Practice Problems  <img src="https://media.giphy.com/media/WUlplcMpOCEmTGBtBW/giphy.gif" width="30">


## What is Data Structure? 
- A data structure is a storage that is used to store and organize data. It is a way of arranging data on a computer so that it can be accessed and updated efficiently.

- A data structure is not only used for organizing the data. It is also used for processing, retrieving, and storing data. There are different basic and advanced types of data structures that are used in almost every program or software system that has been developed.


## What is Algorithms?
- An algorithm is a set of step-by-step instructions to solve a given problem or achieve a specific goal.


## Time Complexity ⏰ 
- The number of times a particular instruction set is executed rather than the total time taken. It is because the total time taken also depends on some external factors like the compiler used, the processor’s speed, etc.
- <b><u>Note:</u></b>  Time complexity does not refer to the time taken by the machine to execute a particular code.
- <b><u>How we will represent the time complexity of any code:</u></b>  To represent the time complexity, we generally use the Big O notation. Example: <b>O(n)</b> 
<br><br><b><u>Here come the three rules, that we are going to follow while calculating the time complexity:</u></b>
1. Always calculate the time complexity for the worst-case scenario. <br> So that we can actually judge the robustness of any code or any system.
2. Avoid including the constant terms.
3. Avoid the lower values.

Lets take this Example:
```java
int x = 10
for(int i=1; i<=x; i++) {
    System.out.println("Devesh");
}
```
- Here, the first step (i.e. int x = 10) will be executed in unit time i.e. constant time. 
- The precise time complexity is O(3N + 1) but in this case, the constant 1 is very less significant. So we will write the time complexity as O(3N) avoiding the constant term.
- O(3n) can be also written as O(n)


## Space Complexity 📊
- It is the total memory space required by the program for its execution.
- Space complexity generally represents the <b>summation of Auxiliary space and the Input space.</b> 
- <b><u> Auxiliary space </u></b> refers to the space that we use additionally to solve a problem. 
- <b><u> Input space </u></b> refers to the space that we use to store the inputs.

Lets take this Example:
```java
int a = inputA();   // 1 input space
int b = inputB();   // 1 input space
int c = a + b;      // 1 auxiliary space
```
- The variables a and b are used to store the inputs but c refers to the space we are using to solve the problem and c is the auxiliary space. 
- Here the space complexity will be O(3). 
- Similarly, if we use an array of size n, the space complexity will be O(N).

## Sorting Techniques
1. Selection Sort
2. Bubble Sort
3. Insertion Sort
4. Merge Sort
5. Recursive Bubble Sort
6. Recursive Insertion Sort
7. Quick Sort

## Must do Pattern Problems before starting DSA
[List of Question based on Patterns](https://takeuforward.org/strivers-a2z-dsa-course/must-do-pattern-problems-before-starting-dsa/) <br>
[Solution](https://github.com/DeveshAilani/DataStructuresAndAlgorithms/tree/main/src/a_patterns)

## About me <img src="https://media.tenor.com/k_FD58xnsicAAAAi/work-internet.gif" width="33">
- Hey! 👋,  I'm Devesh Ailani
- 👨🏻‍💻 Working at [Lenskart](https://lenskart.com/) as a Senior Software Enginner
- 🦸🏻‍♂️ [DeveshAilani](https://www.linkedin.com/in/deveshailani/) on Linkedin

## Important Links 📔
▶️ [take U forward](https://takeuforward.org/strivers-a2z-dsa-course/strivers-a2z-dsa-course-sheet-2) <br>
📌 [500+ Data Structures and Algorithms Interview Questions & Practice Problems](https://medium.com/techie-delight/500-data-structures-and-algorithms-practice-problems-35afe8a1e222) <br>
📌 [Striver’s SDE Sheet – Top Coding Interview Problems](https://takeuforward.org/interviews/strivers-sde-sheet-top-coding-interview-problems) <br>
📌 [Top 50 String Coding Problems for Interviews](https://www.geeksforgeeks.org/top-50-string-coding-problems-for-interviews/) <br>
▶️ [DS & Algo by (take U forward)](https://www.youtube.com/@takeUforward/playlists) <br>
▶️ [DS & Algo by (Aditya Verma)](https://www.youtube.com/@TheAdityaVerma/playlists) <br>
& lot more will come ...