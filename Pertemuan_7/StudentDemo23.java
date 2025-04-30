package Pertemuan_7;

import java.util.Scanner;

public class StudentDemo23 {
    public static void main(String[] args) {
        StudentAssignmentStack stack = new StudentAssignmentStack(5);
        Scanner sc = new Scanner(System.in);
        int Choose;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Collecting Assignments");
            System.out.println("2. Assessing Tasks");
            System.out.println("3. View Top Tasks");
            System.out.println("4. View Task List");
            System.out.print("Choose:  ");
            Choose = sc.nextInt();
            sc.nextLine();
            switch (Choose) {
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("NIM: ");
                    String NIM = sc.nextLine();
                    System.out.print("Class Name: ");
                    String className = sc.nextLine();
                    Student23 mhs = new Student23(name, NIM, className);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.name);
                    break;

                case 2:
                    Student23 assessed = stack.pop();
                    if (assessed != null) {
                        System.out.println("Menilai tugas dari " + assessed.name);
                        System.out.print("Masukan nilai (0-100) : ");
                        int grade = sc.nextInt();
                        assessed.grading(grade);
                        System.out.printf("Nilai Tugas %s adalah %d\n", assessed.name, grade);
                    }
                    break;
                    
                case 3:
                    Student23 see = stack.peek();
                    if (see != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + see.name);
                    }
                    break;

                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (Choose >= 1 && Choose <= 4);
    }
}
