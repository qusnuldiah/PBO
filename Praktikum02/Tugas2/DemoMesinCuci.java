package Tugas2;

public class DemoMesinCuci {
    public static void main(String[] args) {
        // Membuat 2 objek MesinCuci
        MesinCuci mesinCuci1 = new MesinCuci("Samsung", 7, "Putih", 500);
        MesinCuci mesinCuci2 = new MesinCuci("LG", 8, "Hitam", 600);

        // Update nilai atribut dari objek kedua
        mesinCuci2.merk = "Panasonic";
        mesinCuci2.kapasitas = 10;
        mesinCuci2.warna = "Merah";
        mesinCuci2.power = 700;

        // Mencetak informasi setelah di-update
        System.out.println("\nSetelah update nilai atribut:");
        mesinCuci1.cetakInfo();
        mesinCuci2.cetakInfo();
        mesinCuci2.menu();
    }
}



