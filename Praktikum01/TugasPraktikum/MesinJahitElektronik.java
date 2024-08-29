package TugasPraktikum;

public class MesinJahitElektronik extends MesinJahit {
    private int jumlahModeJahit;
    private boolean otomatis;

    public void setJumlahModeJahit(int newValue) {
        jumlahModeJahit = newValue;
    }

    public void setOtomatis(boolean newValue) {
        otomatis = newValue;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Jumlah Mode Jahit: " + jumlahModeJahit);
        System.out.println("Otomatis: " + (otomatis ? "Ya" : "Tidak"));
        cetakHarga();
    }
}


