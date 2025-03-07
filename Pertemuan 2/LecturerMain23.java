public class LecturerMain23 {
    public static void main(String[] args) {
        Lecturer23 lecturer1 = new Lecturer23();
        lecturer1.lecturerID = "Zk";
        lecturer1.name = "Zaky";
        lecturer1.startYear = 2005;
        lecturer1.expertiseField = "Math";
        lecturer1.setStatus(true);
        lecturer1.print();
        lecturer1.changeExpertiseField("Singing");
    }
}
