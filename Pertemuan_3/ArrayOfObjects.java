package Pertemuan_3;
import java.util.Scanner;

public class ArrayOfObjects {
    public static void main(String[] args) {
        Rectangle[] rectangleArray = new Rectangle[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            rectangleArray[i] = new Rectangle();
            System.out.println("Rectangle " + i);

            System.out.print("Input Length : ");
            rectangleArray[i].length = sc.nextInt();
            
            System.out.print("Input width : ");
            rectangleArray[i].weidth = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Rectangle " + i);
            System.out.println("width: " + rectangleArray[0].weidth + ", length: " + rectangleArray[0].length);
        }

            rectangleArray[0] = new Rectangle();
            rectangleArray[0].length = 110;
            rectangleArray[0].weidth = 30;

            rectangleArray[1] = new Rectangle();
            rectangleArray[1].length = 80;
            rectangleArray[1].weidth = 40;

            rectangleArray[2] = new Rectangle();
            rectangleArray[2].length = 100;
            rectangleArray[2].weidth = 20;

            System.out.println("First rectangle, width: " + rectangleArray[0].weidth + ", length: " + rectangleArray[0].length);
            System.out.println("First rectangle, width: " + rectangleArray[1].weidth + ", length: " + rectangleArray[1].length);
            System.out.println("First rectangle, width: " + rectangleArray[2].weidth + ", length: " + rectangleArray[2].length);
    }
}
