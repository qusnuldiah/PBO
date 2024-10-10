package Tugas1;

public class TomatCeri extends Tomat{
    String ukuran;

    public TomatCeri(String nama, int kalori, boolean matang, String ukuran) {
        super(nama, kalori, matang);
        this.ukuran = ukuran;
    }

    public void tampilkanInformasiGizi() {
        System.out.println("---------------------------------------");
        System.out.println("Informasi Gizi Tomat Ceri");
        System.out.println("---------------------------------------");
        System.out.println("Nama                : " + nama);
        System.out.println("Ukuran              : " + ukuran);
        System.out.println("Kandungan Kalori    : " + kalori + " kalori");
        System.out.println("Status kematangan   : " + (matang ? "Matang" : "Belum Matang"));
        System.out.println("=======================================");
    }
}
