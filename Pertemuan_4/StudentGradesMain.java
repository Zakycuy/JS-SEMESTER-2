package Pertemuan_4;

public class StudentGradesMain {
    public static void main(String[] args) {
        String[] nama = {"Ahmad", "Budi", "Cindy", "Dian", "Eko", "Fajar", "Gina", "Hadi"};
        int[] nilaiUTS = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] nilaiUAS = {82, 88, 87, 79, 95, 85, 83, 84};

        int maxUTS = StudentGrades.cariNilaiUTSTertinggi(nilaiUTS, 0, nilaiUTS.length - 1);
        int minUTS = StudentGrades.cariNilaiUTSTerendah(nilaiUTS, 0, nilaiUTS.length - 1);
        double rataUAS = StudentGrades.hitungRataRataUAS(nilaiUAS);

        System.out.println("Nilai UTS tertinggi (Divide and Conquer): " + maxUTS);
        System.out.println("Nilai UTS terendah (Divide and Conquer): " + minUTS);
        System.out.printf("Rata-rata nilai UAS (Brute Force): %.2f\n", rataUAS);
    }
}
