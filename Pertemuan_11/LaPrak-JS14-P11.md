|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020070 |
| Nama | Raihan Zaky Ramadhan |
| Kelas | TI - 1I |
| Repository | [https://github.com/Zakycuy/JS-SEMESTER-2] () |

# Labs #14 TREE

# 14.2.2 Output Verification

![Screenshot 2025-06-09 111039](https://github.com/user-attachments/assets/0f98d7a1-a886-4097-9b99-3b9a46a8b9c3)

# 14.2.2 Questions

1. Since the data is organized with the rule Smaller values go on the left, Larger values go on the right, it makes it easier to search by comparison, and instantly know whether to go left or right.

2. left attribute Refers to the left child, which is the node with data smaller than the current node. right attribute Refers to the right child, which is the node with data larger than the current node.

3. A. The function is to be the topmost node of a binary tree. It is the starting point for all operations (add, search, browse).
   B. When a BinaryTree object is first created, the root will be null, which means the tree is still empty when first created.

4. Ensure that the first data inserted into the tree will be placed as the root with the code 
if (isEmpty()) {
    root = new Node23(data);
}
with this code, the first data inserted into the tree will be placed as the root of the tree.

5. Ensure that the new node is inserted in the correct position based on the ipk value, If data.ipk is smaller than current, then move to the left child. If larger, move to the right child. If the child position is still empty (null), then create and place the new node there. The main purpose is to maintain the structure and rules of the search binary tree.

6. Find the node you want to delete (current) and store a reference to its parent node (parent). when the node has no children then delete it directly, when the node has one child then replace it with the child, when the node has two children then find the successor, which is the node with the smallest value in the right subtree. then replace the deleted node with the successor, then set the pointer so that the tree structure remains correct.

7. The getSuccessor() function is that when you want to delete a node that has 2 children, you cannot directly delete the node, so you can replace the node with another node.

# 14.3.2 Output Verification

![Screenshot 2025-06-09 124532](https://github.com/user-attachments/assets/b3d4de7d-caa9-400b-9e69-d7629a11f8f0)

# 14.3.2 Questions

1. Data is an array that stores Student23 objects as elements in the binary tree, while idxLast is the last index that indicates the position of the last data used in the array. The purpose is to store the binary tree data and keep track of how far the array has been filled.

2. The populateData() method serves to fill the data array with student data from outside (for example from main), as well as set the idxLast value according to the amount of data.to initialize the contents of the binary tree array with data that is already available.

3. To traversal the tree in-order, in the order of Left then Root then Right.

4. Using the binary tree formula in the array, namely
Left child = 2 * i + 1, Right child = 2 * i + 2

If the node is at index 2, that is
Left child => 2 * 2 + 1 = 5, Right child => 2 * 2 + 2 = 6

So, the left child is at index 5, and the right child is at index 6.

5. Since the array contains 7 elements (indexes 0 to 6), idxLast = 6 tells us that all data from indexes 0 to 6 is actively used, so that traversal or other operations do not access data outside the array boundaries.

6. The general formula for a complete binary tree stored in an array (a tree filled from left to right with no gaps), in the traverseInOrder() method, is used to determine where the traversal moves next (whether left or right), depending on the current node position in the array.

# Assigment 

Result no 1, 2, 3 = ![image](https://github.com/user-attachments/assets/d11dafaa-2d25-4db8-beb4-b2f2f18306f0)

Result no 4 = ![image](https://github.com/user-attachments/assets/7a197ec8-ea30-481b-893e-9001257b06e8)




