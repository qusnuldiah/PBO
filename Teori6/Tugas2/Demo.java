package Tugas2;

public class Demo {
    public static void main(String[] args) {
        // Membuat objek Mobil
        Mobil mobil = new Mobil(120, "Merah");
        mobil.tampilkanInfoMobil();

        // Membuat objek Becak
        Becak becak = new Becak(15, "Kuning");
        becak.tampilkanInfoBecak();

        // Membuat objek Motor
        Motor motor = new Motor(100, "Hitam");
        motor.tampilkanInfoMotor();
    }
}

