package Pertemuan_9;

public class As_StudentQueue {
    As_Node head, tail;
    int maxSize;

    public As_StudentQueue(int maxSize) {
        this.maxSize = maxSize;
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public boolean isFull() {
        return size() >= maxSize;
    }

    public void enqueue(As_Student s) {
        if (isFull()) {
            System.out.println("Antrean penuh. Tidak bisa menambahkan mahasiswa.");
            return;
        }

        As_Node newNode = new As_Node(s);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("Mahasiswa berhasil ditambahkan ke antrean.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean kosong. Tidak ada mahasiswa yang bisa dipanggil.");
        } else {
            System.out.print("Mahasiswa dipanggil: ");
            head.data.print();
            head = head.next;
            if (head == null) tail = null;
        }
    }

    public void printFrontAndRear() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
        } else {
            System.out.print("Mahasiswa Pertama: ");
            head.data.print();
            System.out.print("Mahasiswa Terakhir: ");
            tail.data.print();
        }
    }

    public void clear() {
        head = tail = null;
        System.out.println("Antrean telah dibersihkan.");
    }

    public int size() {
        int count = 0;
        As_Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrean kosong.");
            return;
        }
        As_Node temp = head;
        System.out.println("=== Daftar Mahasiswa Dalam Antrean ===");
        while (temp != null) {
            temp.data.print();
            temp = temp.next;
        }
    }
}

