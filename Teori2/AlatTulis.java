package Teori2;

public class AlatTulis {
    private String nama;
    private int stok, hargaSatuan, hargaTotal;
    
    // Method Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setStok(int stok) {
        this.stok = stok;
        hitungHargaTotal();
    }

    public void setHargaSatuan(int hargaSatuan) {
        this.hargaSatuan = hargaSatuan;
        hitungHargaTotal();
    }

    // Method hitung harga total (stok x hargaSatuan)
    public void hitungHargaTotal() {
        this.hargaTotal = this.stok * this.hargaSatuan;
    }

    // Method Getter
    public String getNama() {
        return this.nama;
    }

    public int getStok() {
        return this.stok;
    }

    public int getHargaSatuan() {
        return this.hargaSatuan;
    }

    public int getHargaTotal() {
        return this.hargaTotal;
    }
}
