package Tugas1;

public class DemoPersegiPanjang {
    public static void main(String[] args) {
        // Membuat objek PersegiPanjang
        PersegiPanjang pp1 = new PersegiPanjang();
        
        // Mengisi nilai panjang dan lebar
        pp1.panjang = 10;
        pp1.lebar = 5;
        pp1.displayInfo();

        System.out.println("Luas Persegi Panjang: " + pp1.getLuas());
        System.out.println("Keliling Persegi Panjang: " + pp1.getKeliling());
    }
}


