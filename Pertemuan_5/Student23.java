package Pertemuan_5;

public class Student23 {
    String nim;
    String name;
    String studentClass;
    double gpa;

    public Student23(String nim, String name, String studentClass, double gpa) {
        this.nim = nim;
        this.name = name;
        this.studentClass = studentClass;
        this.gpa = gpa;
    }

    public void print() {
        System.out.println("NIM: " + nim + ", Name: " + name + ", Class: " + studentClass + ",GPA: " + gpa);
    }
}
