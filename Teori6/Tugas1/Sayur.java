package Tugas1;

public class Sayur extends Makanan {
    public Sayur(String nama, int kalori) {
        super(nama, kalori);
    }

    public void tampilkanInformasiGizi() {
        System.out.println("---------------------------------------");
        System.out.println("Informasi Gizi Sayur");
        System.out.println("---------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Kandungan Kalori    : " + kalori + " kalori");
        System.out.println("=======================================");
    }
}
