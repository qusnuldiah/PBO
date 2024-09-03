import java.util.Scanner;

public class Barista {
    // Atribut
    String nama;
    int umur;
    String jenisKelamin;
    String alamat;

    // Konstruktor
    public Barista(String nama, int umur, String jenisKelamin, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
    }

    // Method untuk menjelaskan menu
    void menjelaskanMenu() {
        System.out.println("Menjelaskan menu minuman kepada pelanggan.");
    }

    // Method untuk membuat minuman
    void membuatMinuman() {
        System.out.println("Membuat minuman sesuai pesanan.");
    }

    // Method untuk melayani pembayaran
    void melayaniPembayaran() {
        System.out.println("Melayani pembayaran pelanggan.");
    }

    // Method untuk mencetak informasi barista
    void cetakInfo() {
        System.out.println("INFORMASI BARISTA:");
        System.out.println("=================================");
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Alamat: " + alamat);
        System.out.println("=================================");
    }

    // Method untuk menampilkan menu
    void menu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Barista ===");
            System.out.println("1. Menjelaskan Menu");
            System.out.println("2. Membuat Minuman");
            System.out.println("3. Melayani Pembayaran");
            System.out.println("4. Cetak Info Barista");
            System.out.println("5. Keluar");
            System.out.print("Pilih aksi: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    menjelaskanMenu();
                    break;
                case 2:
                    membuatMinuman();
                    break;
                case 3:
                    melayaniPembayaran();
                    break;
                case 4:
                    cetakInfo();
                    break;
                case 5:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
        sc.close();
    }

    public static void main(String[] args) {
        Barista barista1 = new Barista("Anna", 25, "Perempuan", "Jakarta");
        barista1.cetakInfo();
        barista1.menu();
    }
}
