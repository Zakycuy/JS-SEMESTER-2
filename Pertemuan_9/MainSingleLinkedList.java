package Pertemuan_9;

import java.util.Scanner;

public class MainSingleLinkedList {
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     SingleLinkedList sll = new SingleLinkedList();

    //     System.out.print("Masukkan jumlah mahasiswa: ");
    //     int jumlah = sc.nextInt();
    //     sc.nextLine(); 

    //     for (int i = 0; i < jumlah; i++) {
    //         System.out.println("Data Mahasiswa ke-" + (i + 1));
    //         System.out.print("NIM: ");
    //         String nim = sc.nextLine();
    //         System.out.print("Nama: ");
    //         String nama = sc.nextLine();
    //         System.out.print("Kelas: ");
    //         String kelas = sc.nextLine();
    //         System.out.print("IPK: ");
    //         double ipk = sc.nextDouble();
    //         sc.nextLine(); 

    //         Student23 std = new Student23(nim, nama, kelas, ipk);
    //         sll.addLast(std); 
    //     }

    //     System.out.println();
    //     sll.print();
    // }
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        Student23 std1 = new Student23("001", "Student 1", "TI-1I", 3.89);
        Student23 std2 = new Student23("002", "Student 2", "TI-1I", 3.45);
        Student23 std3 = new Student23("003", "Student 3", "TI-1I", 3.20);
        Student23 std4 = new Student23("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.AddFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();

        System.out.println("Data at index 1 is:");
        Student23 data = sll.getData(1);
        data.print();
        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);
        
        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
