import java.util.Scanner;

public class Reviewarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Program Menghitung IP Semester");
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int numCourses = scanner.nextInt();
        
        String[] courseNames = new String[numCourses];
        int[] sks = new int[numCourses];
        double[] numericGrades = new double[numCourses];
        double[] gradePoints = new double[numCourses];
        
        double totalWeightedScore = 0;
        int totalSKS = 0;
        
        for (int i = 0; i < numCourses; i++) {
            scanner.nextLine(); 
            System.out.print("Masukkan nama mata kuliah ke-" + (i + 1) + ": ");
            courseNames[i] = scanner.nextLine();
            
            System.out.print("Masukkan jumlah SKS untuk " + courseNames[i] + ": ");
            sks[i] = scanner.nextInt();
            
            System.out.print("Masukkan nilai angka untuk " + courseNames[i] + ": ");
            numericGrades[i] = scanner.nextDouble();
            gradePoints[i] = convertToGradePoint(numericGrades[i]);
            
            totalWeightedScore += gradePoints[i] * sks[i];
            totalSKS += sks[i];
        }
        
        System.out.println("\nHasil Konversi Nilai:");
        System.out.println("--------------------------------------------------");
        System.out.printf("%-25s %-10s %-10s %-10s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        System.out.println("--------------------------------------------------");
        
        for (int i = 0; i < numCourses; i++) {
            System.out.printf("%-25s %-10.2f %-10s %-10.2f\n", courseNames[i], numericGrades[i], convertToLetter(gradePoints[i]), gradePoints[i]);
        }
        
        System.out.println("--------------------------------------------------");
        
        double ipSemester = totalSKS == 0 ? 0 : totalWeightedScore / totalSKS;
        System.out.printf("IP Semester: %.2f\n", ipSemester);
        
        scanner.close();
    }
    
    public static double convertToGradePoint(double numericGrade) {
        if (numericGrade >= 80) return 4.0;
        else if (numericGrade >= 73) return 3.5;
        else if (numericGrade >= 65) return 3.0;
        else if (numericGrade >= 60) return 2.5;
        else if (numericGrade >= 50) return 2.0;
        else if (numericGrade >= 39) return 1.0;
        else return 0.0;
    }
    
    public static String convertToLetter(double gradePoint) {
        if (gradePoint == 4.0) return "A";
        else if (gradePoint == 3.5) return "B+";
        else if (gradePoint == 3.0) return "B";
        else if (gradePoint == 2.5) return "C+";
        else if (gradePoint == 2.0) return "C";
        else if (gradePoint == 1.0) return "D";
        else return "E";
    }
}
