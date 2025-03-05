package Pertemuan_3;

public class DataLecture23 { 
     
    public void dataAllLecturers (ALecture23[] arrayOflecture23){ 
         
        int i = 1; 
        for (ALecture23 lecture23 : arrayOflecture23) { 
            System.out.println("Data Lecturer -" + (i)); 
            System.out.println("Code          : " + lecture23.code); 
            System.out.println("Name          : " + lecture23.name); 
            System.out.println("Gender        : " + (lecture23.gender ? "man" : "woman")); 
            System.out.println("Age           : " + lecture23.age); 
            System.out.println("-------------------------------"); 
            i++;
        }
    } 

        public void NumberOfLecturersPerGender (ALecture23 [] arrayOflecture23){ 
            int man = 0; 
            int woman = 0; 
     
            for (ALecture23 lecture23 : arrayOflecture23) { 
                if (lecture23.gender) { 
                    man++; 
                } else { 
                    woman++; 
                } 
            } 
            System.out.println("Number of Lecturer woman : " + woman); 
            System.out.println("Number of Lecturer man   : " + man); 
        } 

        public void AverageAgeOfLecturersPerGender (ALecture23 [] arrayOflecture23){ 
            int man = 0; 
            int woman = 0; 
            int totalAgeMale = 0; 
            int totalWomenAge = 0; 
     
            for (ALecture23 lecture23 : arrayOflecture23) { 
                if (lecture23.gender) { 
                    woman++; 
                    totalWomenAge += lecture23.age; 
                } else { 
                    man++; 
                    totalAgeMale += lecture23.age; 
                } 
            } 
            System.out.println("Average Age of Female Lecturers : " + (totalWomenAge / woman)); 
            System.out.println("Average Age of Male Lecturers   : " + (totalAgeMale / man)); 
        
    }

    public void InfoTheOldestLecturer (ALecture23[] arrayOflecture23){ 
        ALecture23 lecturerOldest = arrayOflecture23[0]; 
 
        for (ALecture23 lecture23 : arrayOflecture23) { 
            if (lecture23.age > lecturerOldest.age) { 
                lecturerOldest = lecture23; 
            } 
        } 
        System.out.println("Lecturer Oldest"); 
        System.out.println("Code          : " + lecturerOldest.code); 
        System.out.println("Name          : " + lecturerOldest.name); 
        System.out.println("Gender        : " + (lecturerOldest.gender ? "man" : "woman")); 
        System.out.println("Age           : " + lecturerOldest.age); 
    } 
 
    public void InfoYoungestLecturer (ALecture23 [] arrayOflecture23){ 
        ALecture23 youngestLecturer = arrayOflecture23[0]; 
 
        for (ALecture23 lecture23 : arrayOflecture23) { 
            if (lecture23.age < youngestLecturer.age) { 
                youngestLecturer = lecture23; 
            } 
        } 
        System.out.println("Youngest Lecturer"); 
        System.out.println("Code          : " + youngestLecturer.code); 
        System.out.println("Name          : " + youngestLecturer.name); 
        System.out.println("Gender        : " + (youngestLecturer.gender ? "man" : "woman")); 
        System.out.println("Age           : " + youngestLecturer.age); 
    } 
} 