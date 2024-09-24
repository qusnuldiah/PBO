package Teori04;

public class Sopir {
    private String nama;
    private int biaya;

    // Konstruktor
    public Sopir(String nama, int biaya) {
        this.nama = nama;
        this.biaya = biaya;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setBiaya(int biaya) {
        this.biaya = biaya;
    }

    public int getBiaya() {
        return this.biaya;
    }

    // Menghitung total biaya jasa sopir berdasarkan jumlah hari
    public int hitungBiayaSopir(int hari) {
        return this.biaya * hari;
    }
}
