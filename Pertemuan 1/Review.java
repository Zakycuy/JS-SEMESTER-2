import java.util.Scanner;

public class Review {
    static double calculateScore (int Quiz, int Tasks, int Uts, int Uas) {
        int Score = Quiz*20/100 + Tasks*20/100 + Uts*30/100 + Uas*30/100;
        return Score;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Tasks, Quiz, Uts, Uas;
        double Result;
        String kualifikasi = "", nilai_Akhir_Huruf = "";
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("==============================");
        System.out.print("Input The TASKS Score = ");
        Tasks = input.nextInt();

        System.out.print("Input The QUIZ Score = ");
        Quiz = input.nextInt();
       
        System.out.print("Input The UTS Score = ");
        Uts = input.nextInt();
        
        System.out.print("Input The UAS Score = ");
        Uas = input.nextInt();

        Result = calculateScore(Quiz, Tasks, Uts, Uas);

        System.out.println("==============================");
        System.out.println("==============================");

        if (Quiz > 100 || Tasks > 100 || Uts > 100 || Uas > 100) {
            System.out.println("INVALID");
            System.out.println("==============================");
            System.out.println("==============================");

        } else {
            if (Result >=80 && Result <=100) {
                nilai_Akhir_Huruf = "A";
                kualifikasi = "Sangat Baik";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");

                System.out.println("SELAMAT ANDA LULUS");
    
            }else if (Result >=73 && Result <=80){
                nilai_Akhir_Huruf = "B+" ;
                kualifikasi = "Lebih Dari Baik";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");

                System.out.println("SELAMAT ANDA LULUS");
    
            }else if (Result >=65 && Result <=73){
                nilai_Akhir_Huruf = "B";
                kualifikasi = "Baik";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");
                
                System.out.println("SELAMAT ANDA LULUS");
    
            }else if (Result >=60 && Result <=65){
                nilai_Akhir_Huruf = "C+";
                kualifikasi = "Lebih dari cukup";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");

                System.out.println("SELAMAT ANDA LULUS");
    
            }else if (Result >=50 && Result <=60){
                nilai_Akhir_Huruf = "C";
                kualifikasi = "Cukup";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");

                System.out.println("SELAMAT ANDA LULUS");
                
            }else if (Result >=39 && Result <=50){
                nilai_Akhir_Huruf = "D";
                kualifikasi = "Kurang";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");

                System.out.println("KASIHAN GAK LULUS");
    
            }else if (Result <39){
                nilai_Akhir_Huruf = "E";
                kualifikasi = "Gagal";
                System.out.println("The Final score is = " + Result);        
                System.out.println("The Letter grade is = " + nilai_Akhir_Huruf);
                
                System.out.println("==============================");
                System.out.println("==============================");

                System.out.println("KASIHAN GAK LULUS");
            
            }else{

            }
        }
    }
    
}