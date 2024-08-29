package TugasPraktikum;

public class MesinJahitManual extends MesinJahit {
    private boolean pedal;
    private boolean rodaPengatur;

    public void setPedal(boolean newValue) {
        pedal = newValue;
    }

    public void setRodaPengatur(boolean newValue) {
        rodaPengatur = newValue;
    }

    public void cetakInformasi() {
        super.cetakInformasi();
        System.out.println("Pedal: " + (pedal ? "Ada" : "Tidak Ada"));
        System.out.println("Roda Pengatur: " + (rodaPengatur ? "Ada" : "Tidak Ada"));
        cetakHarga();
    }
}


