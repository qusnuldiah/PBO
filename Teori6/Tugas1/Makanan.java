package Tugas1;

public class Makanan {
    String nama;
    int kalori;

    public Makanan(String nama, int kalori) {
        this.nama = nama;
        this.kalori = kalori;
    }

    public void makan() {
        System.out.println("=======================================");
        System.out.println("Memakan " + nama);
        System.out.println("Kalori              : " + kalori + " kalori");
        System.out.println("=======================================");
    }
}
