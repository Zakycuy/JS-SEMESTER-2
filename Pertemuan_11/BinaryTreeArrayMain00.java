package Pertemuan_11;

public class BinaryTreeArrayMain00 {
    public static void main(String[] args) {
        BinaryTreeArray00 bta = new BinaryTreeArray00();
        Student23 m1 = new Student23("244107020138", "Devin", "TI-1I", 3.57);
        Student23 m2 = new Student23("244107020023", "Dewi", "TI-1I", 3.85);
        Student23 m3 = new Student23("244107020225", "Wahyu", "TI-1I", 3.21);
        Student23 m4 = new Student23("244107020076", "Angelina", "TI-1I", 3.54);
        Student23 m5 = new Student23("244107020223", "Andhika", "TI-1I", 3.72);
        Student23 m6 = new Student23("244107020226", "Bima", "TI-1I", 3.37);
        Student23 m7 = new Student23("244107020181", "Eiyu", "TI-1I", 3.46);
        Student23[] data = { m1, m2, m3, m4, m5, m6, m7 };
        bta.populateData(data, data.length - 1);
        System.out.println("In-order traversal:");
        bta.traverseInOrder(0);
    }
}
