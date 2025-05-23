package Pertemuan_8;

public class StudentQueue {
    Student[] data;
    int front, rear, size, max;

    public StudentQueue(int n){
        max = n;
        data = new Student[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty(){
        if (size == 0) {
            return true;
        }else{
            return false;
        }
    }

    boolean isFull(){
        if (size == max) {
            return true;
        }else{
            return false;
        }
    }

    void peek(){
        if (!isEmpty()) {
            System.out.println("Front data: ");
            data[front].print();
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    void print(){
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Number of element: " + size);
    }

    void clear(){
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed!");
        }else{
            System.out.println("Queue is already empty!!!");
        }
    }

    void enqueue(Student dt){
        if (isFull()) {
            System.out.println("Queue is full!!!");
            return;
        }
            rear = (rear+1)%max;
            data[rear] = dt;
            size++;
            System.out.printf("%s is successfully added at index %d\n", dt.name, rear);
    }

    Student dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!!!");
            return null;
        }
            Student dt = data[front];
            front = (front+1)%max;
            size--;
            return dt;
    }

    void viewRear(){
        if (!isEmpty()) {
            System.out.println("Rear data: ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty!!!");
        }
    }

    static void menu(){
        System.out.println("Available menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Check rear of the queue");
        System.out.println("0. Exit");
        System.out.println("=========================");
    }
}

