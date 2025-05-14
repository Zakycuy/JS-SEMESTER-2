package Pertemuan_9;

public class MainSingleLinkedList {
    public static void main(String[] args) {
        SingleLinkedList sll = new SingleLinkedList();

        Student23 std1 = new Student23("001", "Student 1", "TI-1I", 3.89);
        Student23 std2 = new Student23("002", "Student 2", "TI-1I", 3.45);
        Student23 std3 = new Student23("003", "Student 3", "TI-1I", 3.20);
        Student23 std4 = new Student23("004", "Student 4", "TI-1I", 3.00);

        sll.print();
        sll.AddFirst(std4);
        sll.print();
        sll.addLast(std1);
        sll.print();
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);
        sll.print();
    }
}
