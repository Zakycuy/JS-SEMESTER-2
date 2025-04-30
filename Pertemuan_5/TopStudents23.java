package Pertemuan_5;

public class TopStudents23 {
    Student23[] listStudents23;
    int idx;

    public void selectionSort() {
        for (int i = 0; i < idx - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < idx; j++) {
                if (listStudents23[j].gpa < listStudents23[minIndex].gpa) {
                    minIndex = j;
                }
            }

            Student23 temp = listStudents23[minIndex];
            listStudents23[minIndex] = listStudents23[i];
            listStudents23[i] = temp;
        }
    }

    public void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Student23 temp = listStudents23[i];
            int j = i;

            while (j > 0 && listStudents23[j - 1].gpa > temp.gpa) {
                listStudents23[j] = listStudents23[j - 1];
                j--;
            }
            listStudents23[j] = temp;
        }
    }

    public TopStudents23(int size) {
        listStudents23 = new Student23[size];
        idx = 0;
    }

    public void add(Student23 student23) {
        if (idx < listStudents23.length) {
            listStudents23[idx] = student23;
            idx++;
        } else {
            System.out.println("List is full!");
        }
    }

    public void print() {
        for (int i = 0; i < idx; i++) {
            listStudents23[i].print();
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - 1; j++) {
                if (listStudents23[j].gpa < listStudents23[j + 1].gpa) {
                    Student23 temp = listStudents23[j];
                    listStudents23[j] = listStudents23[j + 1];
                    listStudents23[j + 1] = temp;
                }
            }
        }
    }
}
