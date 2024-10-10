package Tugas1;

public class Buah extends Makanan {
    String jenis;

    public Buah(String nama, int kalori, String jenis) {
        super(nama, kalori);
        this.jenis = jenis;
    }

    public void tampilkanInformasiGizi() {
        System.out.println("---------------------------------------");
        System.out.println("Informasi Gizi Buah");
        System.out.println("---------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Jenis               : " + jenis);
        System.out.println("Kandungan Kalori    : " + kalori + " kalori");
        System.out.println("=======================================");
    }
}
