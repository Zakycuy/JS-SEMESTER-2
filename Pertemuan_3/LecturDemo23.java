package Pertemuan_3;

import java.util.Scanner; 
public class LecturDemo23 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        ALecture23 [] arrayOflecture23 = new ALecture23[3]; 
        String code, name, dummy, dataGender; 
        boolean gender; 
        int age; 

        for (int i = 0; i < 3; i++) { 
            System.out.println("Enter Lecturer Data -" + (i+1)); 
            System.out.print("Code          : "); 
            code = sc.nextLine(); 
            System.out.print("Name          : "); 
            name = sc.nextLine(); 
            System.out.print("Gender        : "); 
            dataGender = sc.nextLine();
            gender = dataGender.equalsIgnoreCase("man"); 
            System.out.print("Age           : "); 
            dummy = sc.nextLine(); 
            age = Integer.parseInt(dummy); 
            System.out.println("==============================="); 

            arrayOflecture23[i] = new ALecture23(code, name, gender, age); 
        } 

        DataLecture23 dataLecture = new DataLecture23(); 
        dataLecture.dataAllLecturers(arrayOflecture23); 
        dataLecture.NumberOfLecturersPerGender(arrayOflecture23); 
        dataLecture.AverageAgeOfLecturersPerGender(arrayOflecture23); 
        dataLecture.InfoTheOldestLecturer(arrayOflecture23); 
        dataLecture.InfoYoungestLecturer(arrayOflecture23);
        
    }
}
