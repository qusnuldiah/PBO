package Tugas1;

public class Demo {
    public static void main(String[] args) {
        // Membuat objek Apel
        Apel apel = new Apel("Apel", 95, "Fuji", true);
        apel.makan();
        apel.tampilkanInformasiGizi();

        System.out.println();

        // Membuat objek TomatCeri
        TomatCeri tomatCeri = new TomatCeri("Tomat Ceri", 18, true, "Kecil");
        tomatCeri.makan();
        tomatCeri.tampilkanInformasiGizi();
    }
}
