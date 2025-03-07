package Quiz_1;

import Pertemuan_3.Rectangle;

public class LibraryDemo {
    static String title;
    static String author;
    static int borrowCount;
    static double cost;
            
        public static void main(String[] args) {
            DataLibrary [] arrayOfLibrary = new DataLibrary[3];
            
            arrayOfLibrary[0] = new DataLibrary(title, author, borrowCount, cost);
            arrayOfLibrary[0].title  = "Kisah Hidup"; 
            arrayOfLibrary[0].author = "Zaky";
            arrayOfLibrary[0].borrowCount = 3;
            arrayOfLibrary[0].cost = 5;

            arrayOfLibrary[1] = new DataLibrary(title, author, borrowCount, cost);
            arrayOfLibrary[1].title  = "Kemari"; 
            arrayOfLibrary[1].author = "Keenan";
            arrayOfLibrary[1].borrowCount = 3;
            arrayOfLibrary[1].cost = 3;

            arrayOfLibrary[2] = new DataLibrary(title, author, borrowCount, cost);
            arrayOfLibrary[2].title  = "Kesana"; 
            arrayOfLibrary[2].author = "Hafiz";
            arrayOfLibrary[2].borrowCount = 4;
            arrayOfLibrary[2].cost = 7;

            for (int i = 0; i < arrayOfLibrary.length; i++) {
                System.out.println("Title " + i + " = " + arrayOfLibrary[i].title);
                System.out.println("Author " + i + " = " + arrayOfLibrary[i].author);
                System.out.println("Borrow Count " + i + " = " + arrayOfLibrary[i].borrowCount);
                System.out.println("Cost " + i + " = " + arrayOfLibrary[i].cost);
                System.out.println("================================================");
            }
           
            DataLibrary dataLibrary = new DataLibrary(title, author, borrowCount, cost);
            dataLibrary.borrowCount();
            dataLibrary.calculateRevenue();


    }
}
