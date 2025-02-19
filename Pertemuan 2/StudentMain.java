public class StudentMain {
    public static void main(String[] args) {
        Student_23 student1 = new Student_23(null, null, null, 0);
        student1.studentID = "244107020070";
        student1.name = "Zaky";
        student1.className = "TI-1I";
        student1.gpa = 3.8;
        student1.print();
        student1.changeClass("TI-2I");
        student1.updateGPA(3.9);
        student1.print();

        Student_23 student2 = new Student_23("244107020071", "Dilo", "TI-1I", 3.5);
        student2.updateGPA(3.3);
        student2.print();
    }
}
