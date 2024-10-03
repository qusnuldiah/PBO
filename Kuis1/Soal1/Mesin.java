package Soal1;

public class Mesin {
    private String merek;
    private double kecepatan;

    // Konstruktor
    public Mesin(String merek) {
        this.merek = merek;
        this.kecepatan = 0;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }

    public double getKecepatan() {
        return kecepatan;
    }

    // Tambah kecepatan sesuai dengan merek
    public void tambahKecepatan() {
        if (merek.equalsIgnoreCase("Honda")) {
            kecepatan += 10;
        } else if (merek.equalsIgnoreCase("Yamaha")) {
            kecepatan += 15;
        }

        if (kecepatan > 100) {
            kecepatan = 100;
        }
    }

    // Kurangi kecepatan sesuai dengan merek
    public void kurangiKecepatan() {
        if (merek.equalsIgnoreCase("Honda")) {
            kecepatan -= 5;
        } else if (merek.equalsIgnoreCase("Yamaha")) {
            kecepatan -= 10;
        }

        if (kecepatan < 0) {
            kecepatan = 0;
        }
    }
}
