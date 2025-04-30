package Pertemuan_5;

public class SortingMain23 {
    public static void main(String[] args) {
        int[] a = {34, 7, 23, 32, 5, 62};
        Sorting23 sorting = new Sorting23(a);

        System.out.println("Original array:");
        sorting.print();
        sorting.bubbleSort();
        System.out.println("Sorted array (Bubble Sort):");
        sorting.print();

        int[] b = {30, 20, 2, 8, 14};
        Sorting23 sorting2 = new Sorting23(b);

        System.out.println("Original array:");
        sorting2.print();
        sorting2.bubbleSort();
        System.out.println("Sorted array (Selection Sort):");
        sorting2.print();

        int[] c = {40, 10, 4, 9, 3};
        Sorting23 sorting3 = new Sorting23(c);

        System.out.println("Original array:");
        sorting3.print();
        sorting3.bubbleSort();
        System.out.println("Sorted array (Insertion Sort):");
        sorting3.print();
    }
}
