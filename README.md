# Data Structure Refresher For Interviews


# Table of Contents

- Big O notation
- Arrays
- Linked lists
- Stacks
- Queues
- Graphs
- Hash tables
- Binary search tree
- Recursion
- Bubble sort
- Selection sort
- Insertion Sort
- Binary search
- Heap sort
- Quick sort
- Merge sort
- Dynamic programming
- AVL tree
- Doubly linked list
- Dijkstra’s algorithm
- Tries

# Big O notation

- Big O notation is an asymptotic analysis that describes how long an algorithm takes to perform. In other words, it’s used to talk about how efficient or complex an algorithm is.
- Big O describes the execution time, or run time, of an algorithm relative to its input N
- N as the input increases. Though we can analyze an algorithm’s efficiency using average-case and best-case, we typically use worst-case with Big O notation.
- Today, you will learn about time complexity, but take note that space complexity is also an important concept to understand. Runtime complexity can be a difficult concept to grasp at first, so let’s look at some examples.
### O(1) O(1)

```
public int findInt(int[] arr) {
    return arr[0];
}
```

