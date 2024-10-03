package Soal2;

public class Bola {
    private double jariJari;
    private final double phi = 3.14159;

    // Konstruktor
    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method menghitung volume
    public double hitungVolume() {
        return (4.0 / 3.0) * phi * Math.pow(jariJari, 3);
    }

    // Method menghitung luas permukaan
    public double hitungLuasPermukaan() {
        return 4 * phi * Math.pow(jariJari, 2);
    }

    // Method untuk menampilkan hasil perhitungan
    public void tampilkanHasil() {
        System.out.println("===================================");
        System.out.println("   HASIL PERHITUNGAN BOLA");
        System.out.println("===================================");
        System.out.printf("Jari-jari bola         : %.2f cm\n", jariJari);
        System.out.printf("Volume bola            : %.2f cm³\n", hitungVolume());
        System.out.printf("Luas permukaan bola    : %.2f cm²\n", hitungLuasPermukaan());
        System.out.println("===================================");
    }
}
