package Teori04;

public class Pelanggan {
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;

    // Konstruktor
    public Pelanggan(String nama, Mobil mobil, Sopir sopir, int hari) {
        this.nama = nama;
        this.mobil = mobil;
        this.sopir = sopir;
        this.hari = hari;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Mobil getMobil() {
        return this.mobil;
    }

    public void setSopir(Sopir sopir) {
        this.sopir = sopir;
    }

    public Sopir getSopir() {
        return this.sopir;
    }

    public void setHari(int hari) {
        this.hari = hari;
    }

    public int getHari() {
        return this.hari;
    }

    // Menghitung total biaya sewa mobil dan sopir
    public int hitungBiayaTotal() {
        int biayaMobil = mobil.hitungBiayaMobil(hari);
        int biayaSopir = sopir.hitungBiayaSopir(hari);
        return biayaMobil + biayaSopir;
    }
}
