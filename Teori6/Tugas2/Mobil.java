package Tugas2;

public class Mobil extends Kendaraan {
    String warna;

    public Mobil(int kecepatan, String warna) {
        super(kecepatan);
        this.warna = warna;
    }

    public void tampilkanInfoMobil() {
        System.out.println("==============================");
        System.out.println("Informasi Mobil:");
        tampilkanInfo();
        System.out.printf("Warna: %s%n", warna);
        System.out.println("______________________________");
    }
}

