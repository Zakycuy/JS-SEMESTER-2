public class Student_23 {
    String studentID, name ,className;
    double gpa;

    void print () {
        System.out.println("Student ID : " + studentID);
        System.out.println("Name : " + name);
        System.out.println("Class : " + className);
        System.out.println("GPA : " + gpa);
        
    }

    void changeClass (String newClass) {
        className = newClass;
    }

    void updateGPA (double newGPA) {
        gpa = newGPA;
    }

    String evaluate () {
        if (gpa >= 3.5) {
            return "Excellent";
        }else if (gpa >= 3.0) {
            return "Good";
        }else if (gpa >= 2.0) {
            return "Fair";
        }else {
            return "poor";
        }

    }

    public Student_23 (String id, String name,String cls, double gpa) {
        studentID = id;
        this.name = name;
        className = cls;
        this.gpa = gpa;
    }
}
