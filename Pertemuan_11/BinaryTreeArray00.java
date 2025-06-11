package Pertemuan_11;

public class BinaryTreeArray00 {
    Student23[] data;
    int idxLast;

    public BinaryTreeArray00() {
        data = new Student23[10];
        idxLast = -1;
    }

    void populateData(Student23[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
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
}