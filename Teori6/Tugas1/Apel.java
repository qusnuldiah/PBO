package Tugas1;

public class Apel extends Buah {
    boolean matang;

    public Apel(String nama, int kalori, String jenis, boolean matang) {
        super(nama, kalori, jenis);
        this.matang = matang;
    }

    public void tampilkanInformasiGizi() {
        System.out.println("---------------------------------------");
        System.out.println("Informasi Gizi Apel");
        System.out.println("---------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Jenis               : " + jenis);
        System.out.println("Kandungan Kalori    : " + kalori + " kalori");
        System.out.println("Status kematangan   : " + (matang ? "Matang" : "Belum Matang"));
        System.out.println("=======================================");
    }
}
