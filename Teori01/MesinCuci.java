import java.util.Scanner;

public class MesinCuci {
    // Atribut
    String merk;
    int kapasitas;
    String warna;
    int power;

    // Konstruktor
    public MesinCuci(String merk, int kapasitas, String warna, int power) {
        this.merk = merk;
        this.kapasitas = kapasitas;
        this.warna = warna;
        this.power = power;
    }

    // Method untuk menyalakan mesin cuci
    void nyalakan() {
        System.out.println("Mesin cuci dinyalakan.");
    }

    // Method untuk mematikan mesin cuci
    void matikan() {
        System.out.println("Mesin cuci dimatikan.");
    }

    // Method untuk memulai pencucian
    void pencucian() {
        System.out.println("Proses pencucian dimulai.");
    }

    // Method untuk memulai pengeringan
    void pengering() {
        System.out.println("Proses pengeringan dimulai.");
    }

    // Method untuk mencetak informasi mesin cuci
    void cetakInfo() {
        System.out.println("INFORMASI MESIN CUCI:");
        System.out.println("=================================");
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas: " + kapasitas + " kg");
        System.out.println("Warna: " + warna);
        System.out.println("Power: " + power + " watt");
        System.out.println("=================================");
    }

    // Method untuk menampilkan menu
    void menu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Mesin Cuci ===");
            System.out.println("1. Nyalakan Mesin Cuci");
            System.out.println("2. Matikan Mesin Cuci");
            System.out.println("3. Pencucian");
            System.out.println("4. Pengering");
            System.out.println("5. Keluar");
            System.out.print("Pilih aksi: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    nyalakan();
                    break;
                case 2:
                    matikan();
                    break;
                case 3:
                    pencucian();
                    break;
                case 4:
                    pengering();
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
        MesinCuci mesinCuci1 = new MesinCuci("Samsung", 7, "Putih", 500);
        mesinCuci1.cetakInfo();
        mesinCuci1.menu();
    }
}
