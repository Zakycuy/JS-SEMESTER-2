package Pertemuan_8;

import java.util.Scanner;

public class KRSQueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KRSQueue queue = new KRSQueue(10);
        int choice;

        do {
            System.out.println("\n== KRS Approval Queue Menu ==");
            System.out.println("1. Add student to queue");
            System.out.println("2. Approve KRS (process 2 students)");
            System.out.println("3. Show all students in queue");
            System.out.println("4. Show first 2 students");
            System.out.println("5. Show last student");
            System.out.println("6. Show total in queue");
            System.out.println("7. Show total approved");
            System.out.println("8. Show remaining students to approve");
            System.out.println("9. Clear queue");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Study Program: ");
                    String program = sc.nextLine();
                    System.out.print("Class: ");
                    String className = sc.nextLine();
                    Student s = new Student(nim, name, program, className);
                    queue.enqueue(s);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.printAll();
                    break;
                case 4:
                    queue.peekFrontTwo();
                    break;
                case 5:
                    queue.viewRear();
                    break;
                case 6:
                    System.out.println("Students in queue: " + queue.getSize());
                    break;
                case 7:
                    System.out.println("Students approved: " + queue.getTotalApproved());
                    break;
                case 8:
                    System.out.println("Students remaining: " + queue.getRemaining());
                    break;
                case 9:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 0);
    }
}

