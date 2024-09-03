import java.util.Scanner;

public class Mobil {
    // Atribut
    String tipeMobil;
    String warna;
    double harga;
    String merk;

    // Method untuk menghidupkan mesin
    void hidupkanMesin() {
        System.out.println("Mesin dihidupkan.");
    }

    // Method untuk mematikan mesin
    void matikan() {
        System.out.println("Mesin dimatikan.");
    }

    // Method untuk mengaktifkan lampu sein
    void lampuSein(String arah) {
        System.out.println("Lampu sein " + arah + " dinyalakan.");
    }

    // Method untuk membunyikan klakson
    void klakson() {
        System.out.println("Klakson dibunyikan.");
    }

    // Method untuk menyalakan AC
    void nyalakanAc() {
        System.out.println("AC dinyalakan.");
    }

    // Method untuk mencetak informasi mobil
    void cetakInfo() {
        System.out.println("INFORMASI MOBIL:");
        System.out.println("=================================");
        System.out.println("Tipe Mobil: " + tipeMobil);
        System.out.println("Warna: " + warna);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Merk: " + merk);
        System.out.println("=================================");
    }

    // Method untuk menampilkan menu
    void menu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\nPILIHAN MENU:");
            System.out.println("1. Hidupkan Mesin");
            System.out.println("2. Matikan Mesin");
            System.out.println("3. Nyalakan Lampu Sein");
            System.out.println("4. Bunyi Klakson");
            System.out.println("5. Nyalakan AC");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu (1-6): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    hidupkanMesin();
                    break;
                case 2:
                    matikan();
                    break;
                case 3:
                    System.out.print("Pilih arah (kiri/kanan): ");
                    String arah = scanner.next();
                    lampuSein(arah);
                    break;
                case 4:
                    klakson();
                    break;
                case 5:
                    nyalakanAc();
                    break;
                case 6:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }
        } while (pilihan != 6);

        scanner.close();
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();

        mobil1.tipeMobil = "SUV";
        mobil1.warna = "Hitam";
        mobil1.harga = 350000000;
        mobil1.merk = "Toyota";

        mobil1.cetakInfo();
        mobil1.menu();
    }
}



