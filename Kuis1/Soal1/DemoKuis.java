package Soal1;

public class DemoKuis {
    public static void main(String[] args) {
        // Membuat objek SepedaMotor dengan merek "Honda"
        SepedaMotor honda = new SepedaMotor("Vario", "Honda");
        honda.tampilkanInformasiMotor();
        honda.tambahKecepatanMotor();
        honda.tambahKecepatanMotor();
        honda.kurangiKecepatanMotor();
        System.out.println("=================================\n");

        // Membuat objek SepedaMotor dengan merek "Yamaha"
        SepedaMotor yamaha = new SepedaMotor("NMax", "Yamaha");
        yamaha.tampilkanInformasiMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.tambahKecepatanMotor();
        yamaha.kurangiKecepatanMotor();
        System.out.println("=================================");
    }
}

