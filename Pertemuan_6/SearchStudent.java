package Pertemuan_6;

public class SearchStudent {
    Students[] listStd = new Students[5];
    int idx;
    
    public void add(Students std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already");
        }
    }

    public void display() {
        for (Students students : listStd) {
            students.display();
            System.out.println("-------------------------------");
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
            if (pos != -1) { 
                System.out.println("Data : " + x + "is found in index-" + pos);
            }else {
                System.out.println("Data : " + x + "is not found ");
            }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t : " + listStd[pos].age);
            System.out.println("IPK \t : " + listStd[pos].gpa);
        } else  {
            System.out.println("Data " + x + " is not found");
        }
    }
}
