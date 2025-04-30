package Pertemuan_7;

public class Student23 {
    String name, nim, className;
    int grade;

    Student23(String name, String nim, String className) {
        this.nim = nim;
        this.name = name;
        this.className = className;
        this.grade = -1;
    }

    void grading(int grade) {
        this.grade = grade;
    }
}
