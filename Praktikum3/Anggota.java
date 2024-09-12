package Praktikum3;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    // Konstruktor berparameter
    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    // Getter untuk nomor KTP
    public String getNomorKTP() {
        return nomorKTP;
    }


    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Getter untuk limit pinjaman
    public int getLimitPiinjaman() {
        return limitPeminjaman;
    }

    // Getter untuk jumlah pinjaman
    public int getJumlahPinjaman() {
        return jumlahPinjaman;
    }

    // Method untuk meminjam uang
    public void pinjam(int nominal) {
        if (jumlahPinjaman + nominal > limitPeminjaman) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.");
        } else {
            jumlahPinjaman += nominal;
        }
    }

    // Method untuk mengangsur atau membayar pinjaman dengan minimal 10%
    public void angsur(int nominal) {
        if (nominal >= jumlahPinjaman * 0.1) {
            jumlahPinjaman -= nominal;
            System.out.println("Terima kasih! Anda telah mengangsur sebesar: " + nominal);
        } else {
            System.out.println("Maaf, angsuran harus minimal 10% dari jumlah pinjaman.");
        }
    }

}

