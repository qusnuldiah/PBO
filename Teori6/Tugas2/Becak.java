package Tugas2;

public class Becak extends Kendaraan {
    String warna;

    public Becak(int kecepatan, String warna) {
        super(kecepatan);
        this.warna = warna;
    }

    public void tampilkanInfoBecak() {
        System.out.println("==============================");
        System.out.println("Informasi Becak:");
        tampilkanInfo();
        System.out.printf("Warna: %s%n", warna);
        System.out.println("______________________________");
    }
}

