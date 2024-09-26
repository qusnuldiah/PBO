package Praktikum4;
import java.util.ArrayList;

public class Konser {
    private String namaKonser;
    private String lokasi;
    private String tanggal;
    private ArrayList<Tiket> daftarTiket;
    private ArrayList<Pemesan> daftarPemesan;

    public Konser(String namaKonser, String lokasi, String tanggal) {
        this.namaKonser = namaKonser;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
        this.daftarTiket = new ArrayList<>();
        this.daftarPemesan = new ArrayList<>();
    }

    public void addTiket(Tiket tiket) {
        daftarTiket.add(tiket);
    }

    public void addPemesan(Pemesan pemesan) {
        daftarPemesan.add(pemesan);
    }

    public void showTiketTersedia() {
        System.out.println("===============================================================");
        System.out.println("                 Tiket Tersedia untuk Konser         ");
        System.out.println("===============================================================");
        System.out.println("Nama Konser : " + namaKonser);
        System.out.println("Lokasi      : " + lokasi);
        System.out.println("Tanggal     : " + tanggal);
        System.out.println("---------------------------------------------------------------");
        for (Tiket tiket : daftarTiket) {
            if (!tiket.isBooked()) {
                tiket.getInfoTiket();
            }
        }
        System.out.println("===============================================================\n");
    }

    public void showPemesan() {
        System.out.println("===============================================================");
        System.out.println("                 Daftar Pemesan Tiket Konser        ");
        System.out.println("===============================================================");
        for (Pemesan pemesan : daftarPemesan) {
            pemesan.showPemesanan();
        }
        System.out.println("===============================================================\n");
    }
}

