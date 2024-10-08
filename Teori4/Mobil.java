package Teori04;

public class Mobil {
    private String nama;
    private int biaya;

    // Konstruktor 
    public Mobil(String nama, int biaya) {
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

    // Menghitung total biaya sewa mobil berdasarkan jumlah hari
    public int hitungBiayaMobil(int hari) {
        return this.biaya * hari;
    }
}