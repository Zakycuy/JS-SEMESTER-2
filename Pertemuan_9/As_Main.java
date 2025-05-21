package Pertemuan_9;

import java.util.Scanner;

public class As_Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        As_StudentQueue queue = new As_StudentQueue(10); 
        int choice;

        do {
            System.out.println("\n===== MENU LAYANAN MAHASISWA =====");
            System.out.println("1. Tambah Mahasiswa ke Antrean");
            System.out.println("2. Panggil Mahasiswa Berikutnya");
            System.out.println("3. Tampilkan Mahasiswa Pertama & Terakhir");
            System.out.println("4. Tampilkan Jumlah Mahasiswa di Antrean");
            System.out.println("5. Cek Apakah Antrean Kosong");
            System.out.println("6. Bersihkan Antrean");
            System.out.println("7. Tampilkan Semua Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK: ");
                    double ipk = sc.nextDouble();
                    sc.nextLine();

                    As_Student s = new As_Student(nim, nama, kelas, ipk);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printFrontAndRear();
                    break;
                case 4:
                    System.out.println("Jumlah Mahasiswa di Antrean: " + queue.size());
                    break;
                case 5:
                    System.out.println(queue.isEmpty() ? "Antrean kosong." : "Antrean tidak kosong.");
                    break;
                case 6:
                    queue.clear();
                    break;
                case 7:
                    queue.printAll();
                    break;
                case 0:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 0);

        sc.close();
    }
}

