public class CourseMain23 {
    public static void main(String[] args) {
        Course23 course = new Course23(null, null, 0, 0);
        course.CourseID = "RT 08";
        course.Name = "Agama";
        course.Credit = 2;
        course.Hour = 2;
        course.print();
        course.changeCredit(4);
        course.addHour(1);
        course.reduceHour(4);
        course.print();

        Course23 course2 = new Course23("RT 10", "BING", 2, 4);
        course2.print();
    }
}
