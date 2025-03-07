public class Course23 {
    static String CourseID;
    static String Name;
    static int Credit;
    static int Hour;
    
    void print () {
        System.out.println("Course ID : " + CourseID);
        System.out.println("Name : " + Name);
        System.out.println("Credit : " + Credit);
        System.out.println("Hour : " + Hour);
        
    }

    void changeCredit (int newCredit) {
        Credit = newCredit;
    }

    void addHour (int newHour) {
        Hour += newHour;
    }

    void reduceHour (int newHour) {
        if (newHour < Hour) {
            Hour -= newHour;
        }
    }

    public Course23 (String id, String newname, int Credit, int newHour) {
        CourseID = id;
        Name = newname;
        this.Credit = Credit;
        Hour = newHour;
    }
}
