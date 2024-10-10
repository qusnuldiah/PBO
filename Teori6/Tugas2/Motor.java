package Tugas2;

public class Motor extends Kendaraan {
    String warna;

    public Motor(int kecepatan, String warna) {
        super(kecepatan);
        this.warna = warna;
    }

    public void tampilkanInfoMotor() {
        System.out.println("==============================");
        System.out.println("Informasi Motor:");
        tampilkanInfo();
        System.out.printf("Warna: %s%n", warna);
        System.out.println("______________________________");
    }
}

