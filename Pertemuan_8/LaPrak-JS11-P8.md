|  | Algorithm and Data Structure |
|--|--|
| NIM | 244107020070 |
| Nama | Raihan Zaky Ramadhan |
| Kelas | TI - 1I |
| Repository | [https://github.com/Zakycuy/JS-SEMESTER-2] () |

# Labs #10 QUEUE

# 2.1.2 Verification

![Screenshot 2025-05-07 205255](https://github.com/user-attachments/assets/a27d5d4c-2b1e-4384-9bf5-f2eb3e491b82)

# 2.1.3 Question

1. front and rear attributes set to -1, because it means that it is still empty or there is no data entered yet & size attribute is set to 0, because it means that there are no elements in the queue yet.

2. when rear reaches the end of the array (max-1), it returns to index 0 so that it can fill the empty slot at the beginning of the array.

3. when front reaches the last index, it is reset to 0 to read data from the beginning of the array (if any).

4. because it has to start the print from the first index or you can say the front index.

5. ensure i loops back to 0 when it reaches max - 1, so that it can pass through the array without going out of bounds.

6. ![image](https://github.com/user-attachments/assets/ea709a57-3254-4372-be0b-054b58099658).

7. Modify the program so that it stops when a queue overflow or underflow happens!
Before
![image](https://github.com/user-attachments/assets/50654014-db5a-4636-a498-7f0e006bbce5)


After
![image](https://github.com/user-attachments/assets/050dac68-fc72-47df-b923-3634b31f101c)

# 2.2.2 Question

![Screenshot 2025-05-13 204343](https://github.com/user-attachments/assets/50e64fd0-d4d0-484e-b948-d0473e295b70)

# 2.2.3 Questions

1. Queue (Experiment 1) usually uses primitive data types such as int, String, or double. Whereas StudentQueue uses the data type of an object or a self-made class, Student. This is important because we can store multiple attributes at once (such as NIM, name, study program, class) in one queue element. This makes the program more flexible and representative for complex data.

2. In Queue (Experiment 1), enqueue() and dequeue() only handle primitive data, so the process of adding and retrieving data is simpler. While in StudentQueue, these methods handle Student objects, meaning enqueue() adds objects to the array. then dequeue() retrieves objects and can directly call methods such as print() belonging to Student objects.

3. In StudentQueue using front = 0 because the position of the first element is interpreted as being directly at index 0 when the queue is still empty. This is suitable for circular queues, where the indexes will continue to rotate modulo. While in Queue Experiment 1 using front = -1 is often used to mark that the queue is still empty. This is suitable for regular linear queues, not circular queues.

4. ![image](https://github.com/user-attachments/assets/0d87ff15-d240-42d6-bee5-502ff6c966fb)

# 2.3 Assignment
CODE IN GITHUB https://github.com/Zakycuy/JS-SEMESTER-2

# Result 2.3 Assignment
![Screenshot 2025-05-13 212913](https://github.com/user-attachments/assets/0aaf01d6-1bb2-4faf-955a-a73e09310b03)
![Screenshot 2025-05-13 212937](https://github.com/user-attachments/assets/d6d50a6d-4646-4a63-bfcc-c27ae25b27f5)
![Screenshot 2025-05-13 212945](https://github.com/user-attachments/assets/12ba271c-e051-490a-b22e-3a2cd4679e0a)
![Screenshot 2025-05-13 212956](https://github.com/user-attachments/assets/65f93556-fa5c-43e7-97d5-22742b595841)
![Screenshot 2025-05-13 213007](https://github.com/user-attachments/assets/25b291c4-5b65-4f9e-a7bd-4f1fd4d4e7f3)
![Screenshot 2025-05-13 213018](https://github.com/user-attachments/assets/5a474e64-d2d2-4ab8-bd1a-05e737bac5e6)
![Screenshot 2025-05-13 213027](https://github.com/user-attachments/assets/13ef1dc2-5626-4314-8fe5-df1137944232)
![Screenshot 2025-05-13 213034](https://github.com/user-attachments/assets/636b8577-4880-40ba-ad14-49dcb80632da)
![Screenshot 2025-05-13 213040](https://github.com/user-attachments/assets/7474085d-8ea2-4873-8c9d-58f4c74cecb6)
![Screenshot 2025-05-13 213050](https://github.com/user-attachments/assets/c885c525-e9f9-46f3-aeef-a72042dc1d6f)

