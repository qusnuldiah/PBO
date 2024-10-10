package Tugas1;

public class Tomat extends Sayur{
    boolean matang;

    public Tomat(String nama, int kalori, boolean matang) {
        super(nama, kalori);
        this.matang = matang;
    }

    public void tampilkanInformasiGizi() {
        System.out.println("---------------------------------------");
        System.out.println("Informasi Gizi Tomat");
        System.out.println("---------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Kandungan Kalori    : " + kalori + " kalori");
        System.out.println("Status kematangan   : " + (matang ? "Matang" : "Belum Matang"));
        System.out.println("=======================================");
    }
}
