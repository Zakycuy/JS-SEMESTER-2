package Pertemuan2;

public class Dosen11 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;
   public Dosen11(){

   }
   public Dosen11(String id,String nm , boolean status,int thnbergabung,String bidang){
        idDosen = id;
        nama = nm;
        statusAktif = status;
        tahunBergabung = thnbergabung;
        bidangKeahlian = bidang;
   }
    void tampilInformasi (){
        System.out.println("Id Dosen: " + idDosen);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Status Aktif Dosen: " + statusAktif);
        System.out.println("Tahun Bergabung Dosen: " + tahunBergabung);
        System.out.println("Bidang Keahlian: " + bidangKeahlian);
        System.out.println("Masa Kerja: " + hitungMasaKerja(2025) + " Tahun" );
    }
    void setStatusAktif(boolean Status){
        if (Status == true) {
            System.out.println("Dosen masih Aktif");
        }else{
            System.out.println("Dosen sudah tidak aktif");
        }
    }
    int hitungMasaKerja (int thnSKrg){
        return thnSKrg - tahunBergabung;
        
    }
    void ubahKeahlian (String bidang){
        bidangKeahlian = bidang;
        System.out.println("Bidang Keahlian Baru: " + bidangKeahlian);
    }
}