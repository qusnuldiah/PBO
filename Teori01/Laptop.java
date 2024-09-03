import java.util.Scanner;

public class Laptop {
    // Atribut
    String merk;
    String ram;
    String processor;
    String display;
    String sistemOperasi;

    // Konstruktor
    Laptop(String merk, String ram, String processor, String display, String sistemOperasi) {
        this.merk = merk;
        this.ram = ram;
        this.processor = processor;
        this.display = display;
        this.sistemOperasi = sistemOperasi;
    }

    // Method untuk menyalakan laptop
    void nyalakan() {
        System.out.println("Laptop dinyalakan.");
    }

    // Method untuk mematikan laptop
    void matikan() {
        System.out.println("Laptop dimatikan.");
    }

    // Method untuk mengatur brightness
    void brightness(int level) {
        System.out.println("Brightness diatur ke level: " + level);
    }

    // Method untuk mengatur volume
    void volume(int level) {
        System.out.println("Volume diatur ke level: " + level);
    }

    // Method untuk mencetak informasi laptop
    void cetakInfo() {
        System.out.println("INFORMASI LAPTOP:");
        System.out.println("=================================");
        System.out.println("Merk: " + merk);
        System.out.println("RAM: " + ram);
        System.out.println("Processor: " + processor);
        System.out.println("Display: " + display);
        System.out.println("Sistem Operasi: " + sistemOperasi);
        System.out.println("=================================");
    }

    // Method untuk menampilkan menu
    void menu() {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Nyalakan Laptop");
            System.out.println("2. Matikan Laptop");
            System.out.println("3. Atur Brightness");
            System.out.println("4. Atur Volume");
            System.out.println("5. Keluar");
            System.out.print("Pilih tindakan: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    nyalakan();
                    break;
                case 2:
                    matikan();
                    break;
                case 3:
                    System.out.print("Masukkan level brightness (0-100): ");
                    int brightnessLevel = scanner.nextInt();
                    brightness(brightnessLevel);
                    break;
                case 4:
                    System.out.print("Masukkan level volume (0-100): ");
                    int volumeLevel = scanner.nextInt();
                    volume(volumeLevel);
                    break;
                case 5:
                    System.out.println("Keluar dari menu.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }
        } while (pilihan != 5);
        scanner.close();
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        Laptop laptop = new Laptop("Dell", "8GB", "Intel i5", "14 inch", "Windows 10");
        laptop.cetakInfo();
        laptop.menu();
    }
}
