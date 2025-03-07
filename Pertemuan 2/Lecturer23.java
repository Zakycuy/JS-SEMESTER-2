public class Lecturer23 {
    String lecturerID;
    String name;
    boolean status;
    int startYear;
    String expertiseField;

    void print () {
        System.out.println("lecturer ID : " + lecturerID);
        System.out.println("Name : " + name);
        System.out.println("StartYear : " + startYear);
        System.out.println("expertiseField : " + expertiseField);
        System.out.println(startYear);
    }

    void setStatus (boolean status) {
        if (status == true) {
            System.out.println("Active lecturer");
        }else {
            System.out.println("Inactive lecturer");
        }
    }

    void calculateTenure (int thisYear) {
        thisYear -= startYear;
    }

    void changeExpertiseField (String changeEF) {
        expertiseField = changeEF;
        System.out.println("New ExpertiseField : " + expertiseField);
    }

}
