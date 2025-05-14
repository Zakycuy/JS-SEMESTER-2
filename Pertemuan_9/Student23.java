package Pertemuan_9;

public class Student23 {
    String nim, name, className, k;
    double gpa;
    
    public Student23(){
    }

    public Student23(String nm, String nama, String kls, double ip){
        nim = nm;
        name = nama;
        className = kls;
        gpa = ip;
    }

    void print(){
        System.out.println(nim + " - " + name + " - " + className + " - " + gpa);
    }
}

