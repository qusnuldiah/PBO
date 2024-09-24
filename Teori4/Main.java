package Teori04;

public class Main {
    public static void main(String[] args) {
        
        Mobil mobil = new Mobil("Toyota Fortuner", 400000);
        Sopir sopir = new Sopir("Abdul", 100000);
        Pelanggan pelanggan = new Pelanggan("Diah", mobil, sopir, 4);

        // Menampilkan informasi total biaya
        System.out.println("=============================================================");
        System.out.println("                        TOTAL BIAYA                          ");
        System.out.println("-------------------------------------------------------------");   
        System.out.println("Nama Pelanggan          : " + pelanggan.getNama());
        System.out.println("Mobil yang disewa       : " + pelanggan.getMobil().getNama());
        System.out.println("Sopir                   : " + pelanggan.getSopir().getNama());
        System.out.println("Sewa selama             : " + pelanggan.getHari() + " hari");
        System.out.println("_____________________________________________________________");
        System.out.println("Total biaya sewa        : " + "Rp " + pelanggan.hitungBiayaTotal());
        System.out.println("=============================================================");
    }
}


