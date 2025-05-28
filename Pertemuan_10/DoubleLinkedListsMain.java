package Pertemuan_10;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();
        dll.print();
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.print();
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        dll.print();
        dll.addFirst(new Student("113", "Herco", "TI-1I", 3.89));
        dll.print();
        dll.insertAfter("111", new Student("114", "Rizki", "TI-1I", 3.8));
        dll.print();
        dll.insertAfter("112", new Student("115", "Hanzel", "TI-1I", 3.6));
        dll.print();
        dll.insertAfter("120", new Student("116", "Eiyu", "TI-1I", 3.4));
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.removeLast();
        dll.print();
        dll.remove(1);
        dll.print();

        System.out.println("Size: " + dll.getSize());
        System.out.println("Index of NIM 114: " + dll.indexOf("114"));

        System.out.println("Add student at index 1:");
        dll.add(1, new Student("117", "Anya", "TI-1I", 3.65));
        dll.print();

        System.out.println("Remove node after NIM 114:");
        dll.removeAfter("114");
        dll.print();

        System.out.println("Get first: " + dll.getFirst().name);
        System.out.println("Get last: " + dll.getLast().name);
        System.out.println("Get index 1: " + dll.getIndex(1).name);

    }
}
