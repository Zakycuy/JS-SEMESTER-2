package Pertemuan_10;

public class DoubleLinkedLists {
    Node head;
    Node tail;

    DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    boolean isEmpty() {
        return head == null;

    }

    void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                break;
            }
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") notfound!!");
        }
    }

    void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currentlyempty!!");
        }
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }

        int size = 0;
        Node countTemp = head;
        while (countTemp != null) {
            size++;
            countTemp = countTemp.next;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index " + index + " is out of bounds!");
            return;
        }

        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    void add(int index, Student data) {
        if (index < 0) {
            System.out.println("Invalid index!");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        int currentIndex = 0;

        while (temp != null && currentIndex < index) {
            temp = temp.next;
            currentIndex++;
        }

        if (temp == null) {
            addLast(data);
        } else {
            Node newNode = new Node(data);
            newNode.prev = temp.prev;
            newNode.next = temp;
            temp.prev.next = newNode;
            temp.prev = newNode;
        }
    }

    void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp.next == null) {
                    System.out.println("No node exists after the specified key.");
                    return;
                } else {
                    Node toDelete = temp.next;
                    temp.next = toDelete.next;
                    if (toDelete.next != null) {
                        toDelete.next.prev = temp;
                    } else {
                        tail = temp;
                    }
                    return;
                }
            }
            temp = temp.next;
        }
        System.out.println("Key not found: " + key);
    }

    Student getFirst() {
        if (!isEmpty()) {
            return head.data;
        }
        return null;
    }

    Student getLast() {
        if (!isEmpty()) {
            return tail.data;
        }
        return null;
    }

    Student getIndex(int index) {
        if (index < 0)
            return null;

        Node temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index)
                return temp.data;
            temp = temp.next;
            currentIndex++;
        }
        return null;
    }

    int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    int indexOf(String nimKey) {
        int index = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(nimKey)) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1; 
    }
}