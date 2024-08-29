package TugasPraktikum;

public class MesinJahit {
    private String merek;
    private int jumlahJarum;
    private double harga;

    public void setMerek(String newValue) {
        merek = newValue;
    }

    public void setJumlahJarum(int newValue) {
        jumlahJarum = newValue;
    }

    public void setHarga(double newValue) {
        harga = newValue;
    }

    public void cetakInformasi() {
        System.out.println("Merek: " + merek);
        System.out.println("Jumlah Jarum Jahit: " + jumlahJarum);
    }

    public void cetakHarga() {
        System.out.printf("Harga: Rp%.2f%n", harga);
    }
}


