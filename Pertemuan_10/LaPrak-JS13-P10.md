|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020070 |
| Nama | Raihan Zaky Ramadhan |
| Kelas | TI - 1I |
| Repository | [https://github.com/Zakycuy/JS-SEMESTER-2] () |

# Labs #13 DOUBLE LINKED LIST

# 12.2.2 Output Verification

Before
![Screenshot 2025-05-21 134618](https://github.com/user-attachments/assets/1619959c-1970-4b78-9ac2-71b948850621)

After
![image](https://github.com/user-attachments/assets/3c7b6239-b34b-40a7-a6f5-dbaaa0ad111f)


# 12.2.3 Questions

1. The difference lies in the node path or node connection, if the single circumscribed list is only one path (next), while the double lingked list is two paths (prev, next).

2. So that the node can move to the next path or node, as well as to the previous (prev).

3. Emptying or nulling the head or tail

4. when (isEmpty) then the newNode will be head (first node) and tail (last node) (head = tail = newNode).

5. In the addfirst method as the name implies, it adds in the first order while the head is the first row of nodes so head.prev is before the head equal to the newNode that you want to add (head.prev = newNode).

6. Connect newNode with temp that needs the same prev next connection (current.next.prev = newNode).

7. Move to the next node in the list.

8. Do we have to implement it? Must use that code for (insertAfter) What if we remove it? there will be an error in the code ![image](https://github.com/user-attachments/assets/9dd4211e-b3fe-4b73-a18e-1834783f8200) because it can access to next temp but cannot access to prev temp.

9. Checks if the nim of the current node matches the target key.

# 12.3.2 Output Verification

![image](https://github.com/user-attachments/assets/1d1dd4a7-2539-41a7-b07d-f5ac9f5dfafa)

# 12.3.3 Questions

1. Remove or break the reference of the node that was originally before the head (with the code (head = head.next; head.prev = null;) which means move the head that was originally in the first position and then move to the next head, then after the head moves to the second order just break the reference or remove before the head or the first order

2. Important because when the head is equal to tail or only 1 data is available, the code will be deleted with the code (head = tail = null;) which means that the head and tail are null or the code is equal to null.

3. By using traverses that will move continuously until before the last code can be coded (tmp.next = null).

4. The purpose is to prevent errors or exceptions when trying to remove nodes from an empty list because it avoids access to null pointers that can cause a NullPointerException.

5. Using removeFirst where in the code we first check whether the list is empty or not when not then continue whether there is only one data or not when one data then uses the code (head = tail = null;) which means that the head and tail are null or the node is the same as null, when not then uses the code (head = head.next; head.prev = null;) which means moving the head which was originally in the first position and then moving to the next head, then after the head moves to the second order just break the reference or delete before the head or the first order.
then use removeLast which uses the same code but is different at the end, namely using the code (tail = tail.prev; tail.next = null;) which means moving the tail which was originally at the end of the list to the previous node then deciding the reference or deleting the last sequence before the tail.

6. with the code (temp.prev.next = temp.next; temp.next.prev = temp.prev;) means connecting between 2 lists such as the sequence A <-> B <-> C <-> D If we want to delete node C (which is in the middle), then we need to connect the node before C (ie B) directly to the node after C (ie D).

7. ![image](https://github.com/user-attachments/assets/0e561dde-6827-4db3-bd21-a2771187c9d3)








