package Pertemuan_11;

public class Student23 {
    String nim, name, className;
    double ipk;

    public Student23() {

    }

    public Student23(String nm, String nama, String kls, double ip) {
        nim = nm;
        name = nama;
        className = kls;
        ipk = ip;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + className + " - " + ipk);
    }
}
