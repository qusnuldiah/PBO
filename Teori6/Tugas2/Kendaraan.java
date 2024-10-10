package Tugas2;

public class Kendaraan {
    int kecepatan;

    public Kendaraan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public void tampilkanInfo() {
        System.out.printf("Kecepatan: %d km/jam%n", kecepatan);
    }
}

