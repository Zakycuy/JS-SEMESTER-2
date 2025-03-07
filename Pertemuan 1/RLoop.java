import java.util.Scanner;
public class RLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long Nim, i = 0, nimakhir;
        System.out.print("Input your NIM = ");
        Nim = sc.nextLong();
        nimakhir = Nim % 100;
        System.out.println("n : " + nimakhir);

        for (i = 1; i <= nimakhir; i++) {
           if (i % 2 != 0) {    
            System.out.print(" *");
           } else if (i == 6 || i == 10) {
            System.out.print("");
           } else {
            System.out.print(" " + i);
           }
        } 
    }
}
