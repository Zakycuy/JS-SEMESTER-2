package Pertemuan_4;

public class StudentGrades {
    public static int cariNilaiUTSTertinggi(int[] uts, int left, int right) {
        if (left == right) return uts[left]; 
        int mid = (left + right) / 2;
        return Math.max(cariNilaiUTSTertinggi(uts, left, mid), 
                        cariNilaiUTSTertinggi(uts, mid + 1, right));
    }

    public static int cariNilaiUTSTerendah(int[] uts, int left, int right) {
        if (left == right) return uts[left]; 
        int mid = (left + right) / 2;
        return Math.min(cariNilaiUTSTerendah(uts, left, mid), 
                        cariNilaiUTSTerendah(uts, mid + 1, right));
    }

    public static double hitungRataRataUAS(int[] uas) {
        int total = 0;
        for (int nilai : uas) total += nilai;
        return (double) total / uas.length;
    }
}
