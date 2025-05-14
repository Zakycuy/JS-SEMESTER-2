package Pertemuan_9;

import Pertemuan_8.Student;

public class SingleLinkedList {
    Node23 head;
    Node23 tail;

    boolean isEmpty() {
        return (head==null);
    }

    void print() {
        if (!isEmpty()) {
            Node23 tmp = head;
            System.out.println("LinkedList Data:");
            while(tmp!=null){
                tmp.data.print();
                tmp = tmp.next;
            }
        }else {
            System.out.println("LinkedList is empty!!");
        }
    }

    void AddFirst(Student23 std) {
        Node23 newNode = new Node23(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    void addLast(Student23 std){
        Node23 newNode = new Node23(std, null);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    } 

    void insertAfter(Student23 std, String key){
        Node23 newNode = new Node23(std, null);
        Node23 temp = head;
        do {
            if (temp.data.name.equalsIgnoreCase(key)) {
                newNode.next = temp.next;
                temp.next = newNode;
                if (newNode.next == null) {
                    tail = newNode;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }


    public void insertAt(int index, Student23 std) {
        if (index < 0) {
            System.out.println("Wrong index!!");
        } else if (index == 0) {
            AddFirst(std);
        } else {
            Node23 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new Node23(std, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();
    }
}
