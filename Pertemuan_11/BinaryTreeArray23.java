package Pertemuan_11;

public class BinaryTreeArray23 {
    Student23[] data;
    int idxLast;

    public BinaryTreeArray23() {
        data = new Student23[10];
        idxLast = -1;
    }

    void populateData(Student23[] dataArray, int lastIndex) {
        this.data = dataArray;
        this.idxLast = lastIndex;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                data[idxStart].print();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    public void add(Student23 student) {
        if (idxLast + 1 < data.length) {
            data[++idxLast] = student;
        } else {
            System.out.println("Tree is full!");
        }
    }

    public void traversePreOrder() {
        preOrder(0);
    }

    private void preOrder(int index) {
        if (index >= data.length || data[index] == null) return;

        data[index].print();
        preOrder(2 * index + 1); 
        preOrder(2 * index + 2); 
    }
}
