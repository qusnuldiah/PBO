import java.util.Scanner;

class ATM {
    // Atribut
    String namaBank;
    String warna;
    int ukuran;
    String layar;

    // Konstruktor
    public ATM(String namaBank, String warna, int ukuran, String layar) {
        this.namaBank = namaBank;
        this.warna = warna;
        this.ukuran = ukuran;
        this.layar = layar;
    }

    // Method untuk menarik uang tunai
    void tarikTunai() {
        System.out.println("Menarik uang tunai.");
    }

    // Method untuk menyetor uang tunai
    void setorTunai() {
        System.out.println("Menyetor uang tunai.");
    }

    // Method untuk mengecek saldo
    double cekSaldo() {
        // Dummy saldo
        double saldo = 1000000.00;
        System.out.println("Saldo saat ini: " + saldo);
        return saldo;
    }

    // Method untuk transfer uang
    void transfer() {
        System.out.println("Transfer uang.");
    }

    // Method untuk mencetak informasi ATM
    void cetakInfo() {
        System.out.println("INFORMASI ATM:");
        System.out.println("=================================");
        System.out.println("Nama Bank: " + namaBank);
        System.out.println("Warna: " + warna);
        System.out.println("Ukuran: " + ukuran + " inci");
        System.out.println("Layar: " + layar);
        System.out.println("=================================");
    }

    // Method untuk menampilkan menu
    void menu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu ATM ===");
            System.out.println("1. Tarik Tunai");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Cek Saldo");
            System.out.println("4. Transfer");
            System.out.println("5. Keluar");
            System.out.print("Pilih aksi: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    tarikTunai();
                    break;
                case 2:
                    setorTunai();
                    break;
                case 3:
                    cekSaldo();
                    break;
                case 4:
                    transfer();
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
        ATM atm1 = new ATM("Bank ABC", "Hitam", 15, "Sentuh");
        atm1.cetakInfo();
        atm1.menu();
    }
}
