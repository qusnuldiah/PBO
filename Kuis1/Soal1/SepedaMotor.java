package Soal1;

public class SepedaMotor {
    private String merekMotor;
    private Mesin mesin;

    // Konstruktor
    public SepedaMotor(String merekMotor, String merekMesin) {
        this.merekMotor = merekMotor;
        this.mesin = new Mesin(merekMesin);
    }

    public void setMerekMotor(String merekMotor) {
        this.merekMotor = merekMotor;
    }

    public String getMerekMotor() {
        return merekMotor;
    }

    public String getMerekMesin() {
        return mesin.getMerek();
    }

    public void tambahKecepatanMotor() {
        mesin.tambahKecepatan();
        System.out.println(mesin.getKecepatan() + " Km/jam");
    }

    public void kurangiKecepatanMotor() {
        mesin.kurangiKecepatan();
        System.out.println(mesin.getKecepatan() + " Km/jam");
    }

    public void tampilkanInformasiMotor() {
        System.out.println("=================================");
        System.out.println("Merek Sepeda Motor  : " + getMerekMotor());
        System.out.println("Merek Mesin         : " + getMerekMesin());
        System.out.println("---------------------------------");
    }
}
