package Pertemuan_8;

public class KRSQueue {
    Student[] data;
    int front, rear, size, max;
    int totalApproved;

    public KRSQueue(int capacity) {
        max = capacity;
        data = new Student[max];
        front = 0;
        rear = -1;
        size = 0;
        totalApproved = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == max;
    }

    void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Queue cleared.");
    }

    void enqueue(Student s) {
        if (isFull()) {
            System.out.println("Queue is full!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = s;
        size++;
        System.out.println("Student added to the queue.");
    }

    void dequeue() {
        if (size < 2) {
            System.out.println("Less than 2 students in queue!");
            return;
        }
        System.out.println("Processing KRS approval for:");
        for (int i = 0; i < 2; i++) {
            data[front].print();
            front = (front + 1) % max;
            size--;
            totalApproved++;
        }
    }

    void peekFrontTwo() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("First student:");
        data[front].print();
        if (size >= 2) {
            int secondIndex = (front + 1) % max;
            System.out.println("Second student:");
            data[secondIndex].print();
        }
    }

    void viewRear() {
        if (!isEmpty()) {
            System.out.println("Last student:");
            data[rear].print();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.println("All students in queue:");
        int idx = front;
        for (int i = 0; i < size; i++) {
            data[idx].print();
            idx = (idx + 1) % max;
        }
    }

    int getTotalApproved() {
        return totalApproved;
    }

    int getRemaining() {
        return 30 - totalApproved;
    }

    int getSize() {
        return size;
    }
}
