package Praktikum4;
public class Tiket {
    private String nomorTiket;
    private double harga;
    private boolean isBooked;

    public Tiket(String nomorTiket, double harga) {
        this.nomorTiket = nomorTiket;
        this.harga = harga;
        this.isBooked = false;
    }

    public String getNomorTiket() {
        return nomorTiket;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTiket() {
        this.isBooked = true;
    }

    public void getInfoTiket() {
        System.out.println("Tiket Nomor: " + nomorTiket + " | Harga: Rp " + harga 
        + " | Status: " + (isBooked ? "Sudah dipesan" : "Tersedia"));
    }
}

