package Praktikum4;
public class Pemesan {
    private String nama;
    private Tiket tiketPesanan;

    public Pemesan(String nama) {
        this.nama = nama;
    }

    public void pesanTiket(Tiket tiket) {
        if (!tiket.isBooked()) {
            tiket.bookTiket();
            this.tiketPesanan = tiket;
            System.out.println(">> " + nama + " berhasil memesan tiket nomor: " + tiket.getNomorTiket());
        } else {
            System.out.println(">> Tiket nomor " + tiket.getNomorTiket() + " sudah dipesan.");
        }
    }

    public void showPemesanan() {
        System.out.println("Pemesan: " + nama);
        if (tiketPesanan != null) {
            tiketPesanan.getInfoTiket();
        } else {
            System.out.println(">> Belum ada tiket yang dipesan.");
        }
        System.out.println("---------------------------------------------------------------");
    }
}

