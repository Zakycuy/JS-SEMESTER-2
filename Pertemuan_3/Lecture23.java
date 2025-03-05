package Pertemuan_3;

import java.util.Scanner;

public class Lecture23 {
    String id, name;
    boolean gender;
    int age;

    public Lecture23(String id, String name, boolean gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public void Input() {
        Scanner sc = new Scanner(System.in);
        id = sc.nextLine();
        name = sc.nextLine();
        gender = sc.nextBoolean();
        age = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            System.out.print("id lecture " + i + " = ");
        }

    }

    public void input() {
        for (int i = 0; i < 2; i++) {
            System.out.print("id lecture " + i + " = ");
        }
        
    }

    public void print() {

    }
} 
    

