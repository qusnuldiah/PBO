package Praktikum7;

public class Segitiga {
    
    // Method overloading untuk menghitung total sudut
    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

    // Method overloading untuk menghitung keliling segitiga
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    // Metode untuk menghitung sisi miring segitiga siku-siku
    public double keliling(int sisiA, int sisiB) {
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("======================================================================");
        System.out.println("    Hasil Perhitungan Segitiga");
        System.out.println("======================================================================\n");

        System.out.println("1. Total sudut dengan 1 sudut (sudutA = 60):");
        System.out.println("   Total sudut: " + segitiga.totalSudut(60) + " derajat\n");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("2. Total sudut dengan 2 sudut (sudutA = 60, sudutB = 50):");
        System.out.println("   Total sudut: " + segitiga.totalSudut(60, 50) + " derajat\n");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("3. Keliling segitiga dengan 3 sisi (3, 4, 5):");
        System.out.println("   Keliling: " + segitiga.keliling(3, 4, 5) + " satuan\n");
        System.out.println("----------------------------------------------------------------------");

        System.out.println("4. Sisi miring segitiga siku-siku (3, 4):");
        System.out.println("   Sisi miring: " + segitiga.keliling(3, 4) + " satuan\n");
        System.out.println("======================================================================\n");
    }
}
