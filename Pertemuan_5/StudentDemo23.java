package Pertemuan_5;

public class StudentDemo23 {
    public static void main(String[] args) {
        TopStudents23 topStudents23 = new TopStudents23(5);

        topStudents23.add(new Student23("2201", "Alice", "A ", 3.9));
        topStudents23.add(new Student23("2202", "Bob", "B ", 3.7));
        topStudents23.add(new Student23("2203", "Charlie", "C ", 3.8));
        topStudents23.add(new Student23("2204", "David", "D ", 3.6));
        topStudents23.add(new Student23("2205", "Eve", "E ", 4.0));

        System.out.println("Original student list:");
        topStudents23.print();

        topStudents23.bubbleSort();
        System.out.println("Sorted student list (by GPA, descending):");
        topStudents23.print();

        topStudents23.selectionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Selection Sort:");
        topStudents23.print();

        topStudents23.insertionSort();
        System.out.println("Sorted student list (by GPA, ascending) using Insertion Sort:");
        topStudents23.print();
    }
}
