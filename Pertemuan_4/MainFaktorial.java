package Pertemuan_4;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = input.nextInt();  
        Faktorial fk = new Faktorial();
        System.out.println("The factorial of " + num + " using BF: " + fk.FactorialBF(num));
        System.out.println("The factorial of " + num + " using DC: " + fk.FactorialDC(num));
    }  
} 
    

