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
### O(1) 

```
public int findInt(int[] arr) {
    return arr[0];
}
```
### O(1) 

 describes an algorithm that always runs at a constant time no matter its input. The function will execute at the same time no matter if the array holds a thousand integers or one integer because it only takes one “step”.

## O(N)

```
public int func(int[] arr) {
    for (int i = 1; i <= arr.length; i++) {
        System.out.println(i);
    }
}
```
- O(N) describes an algorithm whose runtime will increase linearly relative to the input N. The function above will take N steps for N values stored in the array. For example, if the array length is 1, the function will take 1 “step” to run, whereas if the array length is 1000, the function will take 1000 “steps” to run.

- In the example provided, the array length is the input size, and the number of iterations is the runtime.

```
public int func(int[] arr) {
    for (int i = 1; i <= arr.length; i++) {
        for (int i = 1; i <= arr.length; i++) {
        System.out.println(i);
        }
    }
}
```
- O(N^2) describes a function whose runtime is proportional to the square of the input size. This runtime occurs when there is a nested loop such that the outer loop runs times, and the inner loop runs N times for each iteration by the outer loop such that the function takes N^2 steps.

### Some rules to remember

- **Ignore constants:** When using Big O notation, you always drop the constants. So, even if the runtime complexity is O(2N)
 we call it O(N)
- **Drop less dominant terms:** You only keep the most dominant term when talking Big O. For example,O(N^3 + 50N +1 7)
O(N^3+50N+17) is simply O(N^3). Here’s the rule of thumb: O(1)
O(1) < O(logN) < O(N)< O(NlogN)< O(N^2)< O(2^N)< O(N!).

## Array

- An array is a collection of items of the same variable type that are stored sequentially in memory. It’s one of the most popular and simple data structures and often used to implement other data structures.

- Each item in an array is indexed starting with 0, and each item is known as an element. It’s also important to note that in Java, you cannot change the size of an array. For dynamic sizes, it’s recommended to use a List.

**Initializing Array**

```
int[] intArray = new int[14];

intArray[3] = 5;
intArray[4] = 3;
intArray[13] = 14;

// Indexes with no value are null

```
## Common interview questions:

- Find first non-repeating integer in an array

- Rearrange array in decreasing order

- Right rotate the array by one index

- Maximum sum subarray using divide and conquer



## Linked lists
- A linked list is a linear sequence of nodes that are linked together. Each node contains a value and a pointer to the next node in the list. Unlike arrays, linked lists do not have indexes, so you must start at the first node and traverse through each node until you get to the n
nth node. At the end, the last node will point to a null value.

- The first node is called the head, and the last node is called the tail. Below visualizes a singly linked list.

**A linked list has a number of useful applications:**

- Implement stacks, queues, and hash tables

- Create directories

- Polynomial representation and arithmetic operations

- Dynamic memory allocation

- Basic implementation of a linked list in Java:

``` 

import java.io.*; 
  
// Java program to implement 
// a Singly Linked List 
public class LinkedList { 
  
    Node head; // head of list 
  
    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node { 
  
        int data; 
        Node next; 
  
        // Constructor 
        Node(int d) 
        { 
            data = d; 
            next = null; 
        } 
    } 
  
    // Method to insert a new node 
    public static LinkedList insert(LinkedList list, int data) 
    { 
        // Create a new node with given data 
        Node new_node = new Node(data); 
        new_node.next = null; 
  
        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) { 
            list.head = new_node; 
        } 
        else { 
            // Else traverse till the last node 
            // and insert the new_node there 
            Node last = list.head; 
            while (last.next != null) { 
                last = last.next; 
            } 
  
            // Insert the new_node at last node 
            last.next = new_node; 
        } 
  
        // Return the list by head 
        return list; 
    } 
  
    // Method to print the LinkedList. 
    public static void printList(LinkedList list) 
    { 
        Node currNode = list.head; 
   
        System.out.print("LinkedList: "); 
   
        // Traverse through the LinkedList 
        while (currNode != null) { 
            // Print the data at current node 
            System.out.print(currNode.data + " "); 
   
            // Go to next node 
            currNode = currNode.next; 
        } 
    } 
   
    // Driver code 
    public static void main(String[] args) 
    { 
        /* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = insert(list, 1); 
        list = insert(list, 2); 
        list = insert(list, 3); 
        list = insert(list, 4); 
        list = insert(list, 5); 
        list = insert(list, 6); 
        list = insert(list, 7); 
        list = insert(list, 8); 
  
        // Print the LinkedList 
        printList(list); 
    } 
} 
```

**Common interview questions:**

- Reverse a linked list

- Find the middle value in a linked list

- Remove loop in a linked list


## Stacks

- Stacks are linear data structures in a LIFO (last-in, first-out) order. Now, what does that mean? Imagine a stack of plates. The last plate that you put on top of the stack is the first one you take out. Stacks work that way: the last value you add is the first one you remove.

- Think of a stack like a collection of items that we can add to and remove from. The most common functions in a stack are push, pop, isEmpty, and peek.svg viewer

**A stack has a number of useful applications:**

- Backtracking to a previous state

- Expression evaluation and conversion

**Basic implementation of a stack:**

```
class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
  
    boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top--]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[top]; 
            return x; 
        } 
    } 
}
```

**Common interview questions:**

- Use stack to check for balanced parenthesis

- Implement two stacks in an array

- Next greater element using a stack


## Queues

- Queues are very similar to stacks in that they both are linear data structures with dynamic size. However, queues are FIFO (first-in, first-out) data structures. To visualize this data structure, imagine you are lining up for a roller coaster. The first people that line up get to leave the line for the ride.

- In this data structure, elements enter from the “back” and leave from the “front.” The standard functions in a queue are enqueue, dequeue, rear, front, and isFull.svg viewer

**A queue has a number of useful applications:**

- When a resource is shared by multiple consumers

- Create directories

- When data is transferring asynchronously between two resources


Basic implementation of a queue:

```
class Queue 
{ 
    int front, rear, size; 
    int  capacity; 
    int array[]; 
       
    public Queue(int capacity) { 
         this.capacity = capacity; 
         front = this.size = 0;  
         rear = capacity - 1; 
         array = new int[this.capacity]; 
            
    } 
       
    // Queue is full when size becomes equal to  
    // the capacity  
    boolean isFull(Queue queue) 
    {  return (queue.size == queue.capacity); 
    } 
       
    // Queue is empty when size is 0 
    boolean isEmpty(Queue queue) 
    {  return (queue.size == 0); } 
       
    // Method to add an item to the queue.  
    // It changes rear and size 
    void enqueue( int item) 
    { 
        if (isFull(this)) 
            return; 
        this.rear = (this.rear + 1)%this.capacity; 
        this.array[this.rear] = item; 
        this.size = this.size + 1; 
        System.out.println(item+ " enqueued to queue"); 
    } 
       
    // Method to remove an item from queue.   
    // It changes front and size 
    int dequeue() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        int item = this.array[this.front]; 
        this.front = (this.front + 1)%this.capacity; 
        this.size = this.size - 1; 
        return item; 
    } 
       
    // Method to get front of queue 
    int front() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.front]; 
    } 
        
    // Method to get rear of queue 
    int rear() 
    { 
        if (isEmpty(this)) 
            return Integer.MIN_VALUE; 
           
        return this.array[this.rear]; 
    } 
} 
```

**Common interview questions:**

- Reverse first kth elements of a queue

- Generate binary numbers from 1 to n using a queue


## Graphs
- A graph is a collection of vertices (nodes) that are connected by edges, creating a network.
- In the example above, the set of vertices are (12, 2, 4, 18, 23) and the edges are (12-2, 12-4, 2-4, 4-18, 4-23, 18-23, 2-18).
- Graphs are very versatile data structures that can solve a plethora of real-world problems. Graphs are often used in social networks like LinkedIn or Facebook. With GraphQL on the rise, data is being organized as graphs, or networks.

**Basic implementation of a graph:**
```
import java.util.*; 
class Graph { 
      
    // A utility function to add an edge in an 
    // undirected graph 
    static void addEdge(ArrayList<ArrayList<Integer> > adj, 
                        int u, int v) 
    { 
        adj.get(u).add(v); 
        adj.get(v).add(u); 
    } 
  
    // A utility function to print the adjacency list 
    // representation of graph 
    static void printGraph(ArrayList<ArrayList<Integer> > adj) 
    { 
        for (int i = 0; i < adj.size(); i++) { 
            System.out.println("\nAdjacency list of vertex" + i); 
            for (int j = 0; j < adj.get(i).size(); j++) { 
                System.out.print(" -> "+adj.get(i).get(j)); 
            } 
            System.out.println(); 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        // Creating a graph with 5 vertices 
        int V = 5; 
        ArrayList<ArrayList<Integer> > adj  
                    = new ArrayList<ArrayList<Integer> >(V); 
          
        for (int i = 0; i < V; i++) 
            adj.add(new ArrayList<Integer>()); 
  
        // Adding edges one by one 
        addEdge(adj, 0, 1); 
        addEdge(adj, 0, 4); 
        addEdge(adj, 1, 2); 
        addEdge(adj, 1, 3); 
        addEdge(adj, 1, 4); 
        addEdge(adj, 2, 3); 
        addEdge(adj, 3, 4); 
          
        printGraph(adj); 
    } 
} 
```

**Common interview questions:**

- Find shortest path between two vertices

- Check if a path exists between two vertices

- Find “mother vertex” in a graph


## Hash tables
- What’s hashing? Before we dive into hash tables, it’s essential to understand what hashing is.

- Hashing is the process of assigning an object into a unique index, known as a key. Each object is identified using a key-value pair, and the collection of objects is known as a dictionary.

- A hash table is implemented by storing elements in an array and identifying them through a key. A hash function takes in a key and returns an index for which the value is stored.

- So, whenever you input the key into the hash function, it will always return the same index, which will identify the associated element. Furthermore, if the hash function ever receives a unique key that returns an already used index, you can create a chain of elements with a linked list.

**A hash table has a number of useful applications:**

- When a resource is shared by multiple consumers

- Password verification

- Linking file name and path

- Common interview questions:

- Find symmetric pairs in an array

- Union and intersection of lists using hashing


## Binary search tree
- A binary search tree is a binary tree data structure made up of nodes. The nodes are arranged with the following properties:

- The left subnode always contains values less than the parent node.

- The right subnode always contains values greater than the parent node.

- Both subnodes will also be binary search trees.

- Binary search trees are used in many search applications and also used to determine objects that need to be rendered in a 3D game. This data structure is widely used in engineer projects because hierarchical data is so common.

**Example of a binary search tree**

**Common operations:**

- Search - searches for an element

- Insert - inserts an element in the tree

- Pre-order traversal - traverses the tree in a pre-order way

- In-order traversal - traverses the tree in an in-order way

- Post-order traversal - traverses the tree in a post-order way

- Common interview questions:

- Find kth maximum value in a binary search tree

- Find the minimum value in a binary search tree

- Traverse a given directory using breadth first search

## Recursion
- Recursion is the practice in which a function calls itself directly or indirectly. The corresponding function that is called is known as the recursive function. While recursion is often associated as an algorithm, it may help to understand it as a way or methodology to solve a problem.

- So why is recursion useful? Or what even is it? Let’s look at how we can use recursion to calculate factorials as an example.
```
public static long factorial(int number){        
        //base case - factorial of 0 or 1 is 1
        if(number <=1){
            return 1;
        }        
        return number*factorial(number - 1);
    }
```
- In the example above, the function starts at a number n When the function is called, it will call factorial(n - 1)
factorial(n−1) Say the n nvalue is 4; the function will return

- 4 *factorial(3) -> 4 * 3 * factorial(2) -> 4 * 3 * 2 * factorial(1)

- Once n = 1, the function will return factorial(1) = 1, and we get factorial(4) equal to 4 * 3 * 2 * 1, which is 24.

- Here, you can see the power of recursion. It’s a widely used practice of solving a complex problem by breaking it into smaller instances of the problem until we can solve it. Using recursion, you can simplify a lot of complex problems that would be difficult otherwise.


## Bubble sort
- Bubble sort is a simple sorting algorithm that swaps adjacent elements if they are in an incorrect order. The algorithm will iterate through an array multiple times until the elements are in the correct order.

- Say, we have an array as seen below.

- As the algorithm scans the array from left to right for the first iteration, starting at index 0, it compares index i
i with index i + 1 At index 1, it will see that 11 is greater than 6 and swap the two.

- As the algorithm continues scanning for the first iteration, it will see that 13 is greater than 10 and swap the two.

- Next, it will go through the array for its second iteration. It will swap the values in index 2 and 3 when it sees that 11 is greater than 10.

- The algorithm will scan the array for the third iteration, and because it does not need to make any more swaps for the third iteration, the algorithm will end.

- As you can see, bubble sort can perform poorly when working with a lot more elements, making it primarily used as simply an educational tool. It has a runtime complexity of O(n^2).


**Implementing bubble sort:**
```
public static void bubble_srt(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }
```

## Selection sort
- Selection sort is an algorithm that splits a collection of elements into sorted and unsorted. During each iteration, the algorithm finds the smallest element in the unsorted group and moves it to the end of the sorted group.

**Let’s look at an example:**

- At first, all elements are unsorted. For the first iteration, the algorithm will go through each element and will identify 4 as the smallest value. The algorithm will swap the 11, the first element in the unsorted group with the lowest element in the unsorted group, 4.

- Now, the sorted group is index 0, and the unsorted group is index 1 to index 3. For the second iteration, the algorithm will start at index 1 and scan the array, identifying 6 as the lowest value in the unsorted group. It will swap 11 and 6.

- The sorted group is now index 0 to index 1, and the unsorted group is index 2 to index 3. For the third iteration, the algorithm will start at index 2, and find 11 as the lowest value. Because 11 is already in the right index, it will not move. With this, the algorithm ends.

- Similar to bubble sort, selection sort is often a slow algorithm. It also has a runtime complexity of O(n^2).

**Implementing selection sort:**
```
public static int[] doSelectionSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallerNumber = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
        return arr;
    }
}
```
## Insertion Sort
- Insertion sort is a simple sorting algorithm that builds the final array by sorting an element one at a time. How does it work?

- Examines each element and compare it to the sorted elements on the left

- Inserts the item in the correct order for the sorted elements

Let’s look at an example.


- The algorithm starts at index 0 with the value 11. Because there are no elements to the left of 11, it stays where it is. Now, onto index 1. The value to the left of it is 11, which means we swap 11 and 4.

- Again, the algorithm looks to the left of 4. Because there is no element to the left of 4, it stays where it is. Next, onto index 2. The element with the value 6 looks to left. Because it’s less than 11, the two switch.


- The element 6 looks to the left again, but because 4 is less than 6, it stays where it is. Next, we go to the element at index 4. The algorithm looks to the left, but because 11 is less than 13, it stays where it is. Now, the algorithm is done.

- Insertion sort is almost always more efficient than bubble sort and selection sort, so it’s used more often when working with a small number of elements. Similar to the two other sorting algorithms, insertion sort also has a quadratic runtime of O(n^2).

Implementing insertion sort:
```
public static int[] doInsertionSort(int[] input){
         
        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
```
## Binary search

- Binary search is the most efficient searching algorithm to find an element. The algorithm works by comparing the middle element of an array or list to the target element. If the values are the same, the index of the element will be returned. If not, the list will be cut in half.

- If the target value were less than the middle value, the new list would be the left half. If the target value were greater than the middle value, the new list would be the right half.

- This process continues where you keep splitting a list and searching one of the halves until the search algorithm finds the target value and returns the position. The runtime complexity of this algorithm is O(log2n)
O(log2n)

- It’s important to note that binary search only works if the list is already sorted.

- To visualize a binary search, let’s say that you have a sorted array with ten elements, and you are looking for an index of 33.

- The middle value of this array is 16, and the algorithm compares it to 33. 33 is greater than 16, so the algorithm splits the array and searches in the second half.

- The new middle value is 28. Because 33 is greater than 28, the algorithm searches in the second half of the array.

- After the array is split once again into the right half, the new middle value is 33. The algorithm sees that the middle value and the target value are the same and returns the position of the element.

**Implementing binary search:**

```
int binarySearch(int arr[], int l, int r, int x) 
    { 
        if (r >= l) { 
            int mid = l + (r - l) / 2; 
  
            // If the element is present at the 
            // middle itself 
            if (arr[mid] == x) 
                return mid; 
  
            // If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) 
                return binarySearch(arr, l, mid - 1, x); 
  
            // Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x); 
        } 
  
        // We reach here when element is not present 
        // in array 
        return -1; 
    } 

```

### Trie
* A trie, sometimes called a radix or prefix tree, is a kind of search tree that is used to store a dynamic set or associative
  array where the keys are usually Strings. No node in the tree stores the key associated with that node; instead, its position 
  in the tree defines the key with which it is associated. All the descendants of a node have a common prefix of the String associated 
  with that node, and the root is associated with the empty String.

![Alt text](/images/trie.png?raw=true "Trie")

### Fenwick Tree
* A Fenwick tree, sometimes called a binary indexed tree, is a tree in concept, but in practice is implemented as an implicit data
  structure using an array. Given an index in the array representing a vertex, the index of a vertex's parent or child is calculated
  through bitwise operations on the binary representation of its index. Each element of the array contains the pre-calculated sum of
  a range of values, and by combining that sum with additional ranges encountered during an upward traversal to the root, the prefix
  sum is calculated
* Time Complexity:
  * Range Sum: `O(log(n))`
  * Update: `O(log(n))`

![Alt text](/images/fenwickTree.png?raw=true "Fenwick Tree")

### Segment Tree
* A Segment tree, is a tree data structure for storing intervals, or segments. It allows querying which of the stored segments contain
  a given point
* Time Complexity:
  * Range Query: `O(log(n))`
  * Update: `O(log(n))`

![Alt text](/images/segmentTree.png?raw=true "Segment Tree")

### Heap
* A *Heap* is a specialized tree based structure data structure that satisfies the *heap* property: if A is a parent node of
B, then the key (the value) of node A is ordered with respect to the key of node B with the same ordering applying across the entire heap.
A heap can be classified further as either a "max heap" or a "min heap". In a max heap, the keys of parent nodes are always greater
than or equal to those of the children and the highest key is in the root node. In a min heap, the keys of parent nodes are less than
or equal to those of the children and the lowest key is in the root node
* Time Complexity:
  * Access Max / Min: `O(1)`
  * Insert: `O(log(n))`
  * Remove Max / Min: `O(log(n))`

<img src="/images/heap.png?raw=true" alt="Max Heap" width="400" height="500">


### Hashing
* *Hashing* is used to map data of an arbitrary size to data of a fixed size. The values returned by a hash
  function are called hash values, hash codes, or simply hashes. If two keys map to the same value, a collision occurs
* **Hash Map**: a *hash map* is a structure that can map keys to values. A hash map uses a hash function to compute
  an index into an array of buckets or slots, from which the desired value can be found.
* Collision Resolution
 * **Separate Chaining**: in *separate chaining*, each bucket is independent, and contains a list of entries for each index. The
 time for hash map operations is the time to find the bucket (constant time), plus the time to iterate through the list
 * **Open Addressing**: in *open addressing*, when a new entry is inserted, the buckets are examined, starting with the
 hashed-to-slot and proceeding in some sequence, until an unoccupied slot is found. The name open addressing refers to
 the fact that the location of an item is not always determined by its hash value


![Alt text](/images/hash.png?raw=true "Hashing")

### Graph
* A *Graph* is an ordered pair of G = (V, E) comprising a set V of vertices or nodes together with a set E of edges or arcs,
  which are 2-element subsets of V (i.e. an edge is associated with two vertices, and that association takes the form of the
  unordered pair comprising those two vertices)
 * **Undirected Graph**: a graph in which the adjacency relation is symmetric. So if there exists an edge from node u to node
 v (u -> v), then it is also the case that there exists an edge from node v to node u (v -> u)
 * **Directed Graph**: a graph in which the adjacency relation is not symmetric. So if there exists an edge from node u to node v
 (u -> v), this does *not* imply that there exists an edge from node v to node u (v -> u)


<img src="/images/graph.png?raw=true" alt="Graph" width="400" height="500">

## Algorithms

### Sorting

#### Quicksort
* Stable: `No`
* Time Complexity:
  * Best Case: `O(nlog(n))`
  * Worst Case: `O(n^2)`
  * Average Case: `O(nlog(n))`

![Alt text](/images/quicksort.gif?raw=true "Quicksort")

#### Mergesort
* *Mergesort* is also a divide and conquer algorithm. It continuously divides an array into two halves, recurses on both the
  left subarray and right subarray and then merges the two sorted halves
* Stable: `Yes`
* Time Complexity:
  * Best Case: `O(nlog(n))`
  * Worst Case: `O(nlog(n))`
  * Average Case: `O(nlog(n))`

![Alt text](/images/mergesort.gif?raw=true "Mergesort")

#### Bucket Sort
* *Bucket Sort* is a sorting algorithm that works by distributing the elements of an array into a number of buckets. Each bucket
  is then sorted individually, either using a different sorting algorithm, or by recursively applying the bucket sorting algorithm
* Time Complexity:
  * Best Case: `Ω(n + k)`
  * Worst Case: `O(n^2)`
  * Average Case:`Θ(n + k)`

![Alt text](/images/bucketsort.png?raw=true "Bucket Sort")

#### Radix Sort
* *Radix Sort* is a sorting algorithm that like bucket sort, distributes elements of an array into a number of buckets. However, radix
  sort differs from bucket sort by 're-bucketing' the array after the initial pass as opposed to sorting each bucket and merging
* Time Complexity:
  * Best Case: `Ω(nk)`
  * Worst Case: `O(nk)`
  * Average Case: `Θ(nk)`

### Graph Algorithms

#### Depth First Search
* *Depth First Search* is a graph traversal algorithm which explores as far as possible along each branch before backtracking
* Time Complexity: `O(|V| + |E|)`

![Alt text](/images/dfsbfs.gif?raw=true "DFS / BFS Traversal")

#### Breadth First Search
* *Breadth First Search* is a graph traversal algorithm which explores the neighbor nodes first, before moving to the next
  level neighbors
* Time Complexity: `O(|V| + |E|)`

![Alt text](/images/dfsbfs.gif?raw=true "DFS / BFS Traversal")

#### Topological Sort
* *Topological Sort* is the linear ordering of a directed graph's nodes such that for every edge from node u to node v, u
  comes before v in the ordering
* Time Complexity: `O(|V| + |E|)`

#### Dijkstra's Algorithm
* *Dijkstra's Algorithm* is an algorithm for finding the shortest path between nodes in a graph
* Time Complexity: `O(|V|^2)`

![Alt text](/images/dijkstra.gif?raw=true "Dijkstra's")

#### Bellman-Ford Algorithm
* *Bellman-Ford Algorithm* is an algorithm that computes the shortest paths from a single source node to all other nodes in a weighted graph
* Although it is slower than Dijkstra's, it is more versatile, as it is capable of handling graphs in which some of the edge weights are
  negative numbers
* Time Complexity:
  * Best Case: `O(|E|)`
  * Worst Case: `O(|V||E|)`

![Alt text](/images/bellman-ford.gif?raw=true "Bellman-Ford")

#### Floyd-Warshall Algorithm
* *Floyd-Warshall Algorithm* is an algorithm for finding the shortest paths in a weighted graph with positive or negative edge weights, but
  no negative cycles
* A single execution of the algorithm will find the lengths (summed weights) of the shortest paths between *all* pairs of nodes
* Time Complexity:
  * Best Case: `O(|V|^3)`
  * Worst Case: `O(|V|^3)`
  * Average Case: `O(|V|^3)`

#### Prim's Algorithm
* *Prim's Algorithm* is a greedy algorithm that finds a minimum spanning tree for a weighted undirected graph. In other words, Prim's find a
  subset of edges that forms a tree that includes every node in the graph
* Time Complexity: `O(|V|^2)`

![Alt text](/images/prim.gif?raw=true "Prim's Algorithm")

#### Kruskal's Algorithm
* *Kruskal's Algorithm* is also a greedy algorithm that finds a minimum spanning tree in a graph. However, in Kruskal's, the graph does not
  have to be connected
* Time Complexity: `O(|E|log|V|)`

![Alt text](/images/kruskal.gif?raw=true "Kruskal's Algorithm")

## Greedy Algorithms
* *Greedy Algorithms* are algorithms that make locally optimal choices at each step in the hope of eventually reaching the globally optimal solution
* Problems must exhibit two properties in order to implement a Greedy solution:
 * Optimal Substructure
    * An optimal solution to the problem contains optimal solutions to the given problem's subproblems
 * The Greedy Property
    * An optimal solution is reached by "greedily" choosing the locally optimal choice without ever reconsidering previous choices
* Example - Coin Change
    * Given a target amount V cents and a list of denominations of n coins, i.e. we have coinValue[i] (in cents) for coin types i from [0...n - 1],
      what is the minimum number of coins that we must use to represent amount V? Assume that we have an unlimited supply of coins of any type
    * Coins - Penny (1 cent), Nickel (5 cents), Dime (10 cents), Quarter (25 cents)
    * Assume V = 41. We can use the Greedy algorithm of continuously selecting the largest coin denomination less than or equal to V, subtract that
      coin's value from V, and repeat.
    * V = 41 | 0 coins used
    * V = 16 | 1 coin used (41 - 25 = 16)
    * V = 6  | 2 coins used (16 - 10 = 6)
    * V = 1  | 3 coins used (6 - 5 = 1)
    * V = 0  | 4 coins used (1 - 1 = 0)
    * Using this algorithm, we arrive at a total of 4 coins which is optimal

## Bitmasks
* Bitmasking is a technique used to perform operations at the bit level. Leveraging bitmasks often leads to faster runtime complexity and
  helps limit memory usage
* Test kth bit: `s & (1 << k);`
* Set kth bit: `s |= (1 << k);`
* Turn off kth bit: `s &= ~(1 << k);`
* Toggle kth bit: `s ^= (1 << k);`
* Multiple by 2<sup>n</sup>: `s << n;`
* Divide by 2<sup>n</sup>: `s >> n;`
* Intersection: `s & t;`
* Union: `s | t;`
* Set Subtraction: `s & ~t;`
* Extract lowest set bit: `s & (-s);`
* Extract lowest unset bit: `~s & (s + 1);`
* Swap Values:
             ```
                x ^= y;
                y ^= x;
                x ^= y;
             ```
