package Tugas2;

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
    public void nyalakan() {
        System.out.println("Mesin cuci dinyalakan.");
    }

    // Method untuk mematikan mesin cuci
    public void matikan() {
        System.out.println("Mesin cuci dimatikan.");
    }

    // Method untuk memulai pencucian
    public void pencucian() {
        System.out.println("Mesin cuci mulai proses pencucian.");
    }

    // Method untuk memulai pengeringan
    public void pengering() {
        System.out.println("Mesin cuci mulai proses pengeringan.");
    }

    // Method untuk mencetak informasi mesin cuci
    public void cetakInfo() {
        System.out.println("INFORMASI MESIN CUCI:");
        System.out.println("=================================");
        System.out.println("Merk: " + merk);
        System.out.println("Kapasitas: " + kapasitas + " kg");
        System.out.println("Warna: " + warna);
        System.out.println("Power: " + power + " watt");
        System.out.println("=================================");
    }

    // Method untuk menampilkan menu
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Mesin Cuci ===");
            System.out.println("1. Nyalakan Mesin Cuci");
            System.out.println("2. Matikan Mesin Cuci");
            System.out.println("3. Pencucian");
            System.out.println("4. Pengering");
            System.out.print("Pilih aksi: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    nyalakan();
                    break;
                case 2:
                    matikan();
                    System.out.println("Keluar dari menu.");
                    return;
                case 3:
                    pencucian();
                    break;
                case 4:
                    pengering();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (true);
    }
}