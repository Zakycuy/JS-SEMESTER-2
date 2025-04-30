|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020070 |
| Nama | Raihan Zaky Ramadhan |
| Kelas | TI - 1I |
| Repository | [https://github.com/Zakycuy/JS-SEMESTER-2] () |

# Labs #5 SORTING (BUBBLE, SELECTION, DAN INSERTION SORT)

# 6.2.5 Questions!

1. to swap elements in the array if the element at index j is greater than the element at index j + 1, and then go to the correct position after a few iterations.

2. ![alt text](image.png)

3. j >= 0 ensures the index stays within the array bounds. then data[j] > key means the data[j] element is larger than the key, so it needs to be shifted to the right so that the key can be inserted in the correct position.

4. used in Insertion Sort to shift the element to the right if it is greater than the key/ process the insertion of the element to the correct position in Insertion Sort.

# 6.3.4 Questions!

1. 
A. Loop i controls the number of iterations of Bubble Sort.
At each iteration, the largest element will “float” to the correct position. Therefore, it only needs idx - 1 iterations, because after idx - 1 steps, the elements are already sorted.
B. Loop j controls the comparison between elements. After every iteration beyond i, the largest element is already in the correct place. Thus, we don't need to compare elements that are already sorted. idx - i - 1 ensures that each iteration only compares elements that are not yet sorted.
C. Loop i runs idx - 1 times. If idx = 50, then loop i will run 49 times. The number of Bubble Sort stages  performed is 49.

2. ![alt text](image.png)

# 6.3.9 Questions!

1.  Selection Sort which looks for the element with the smallest GPA value in the subarray. After finding the element with the smallest GPA (minIndex), it will be swapped with the element in the starting position (i). This process is repeated until the entire list of students is sorted by GPA in ascending order.

# 6.3.13 Question!


