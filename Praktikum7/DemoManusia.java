package Praktikum7;

public class DemoManusia {
    public static void main(String[] args) {
        Manusia manusia = new Manusia();
        Dosen dosen = new Dosen();
        Mahasiswa mahasiswa = new Mahasiswa();

        System.out.println("===================================");
        System.out.println("        Aktivitas Manusia");
        System.out.println("===================================");
        manusia.bernafas();
        manusia.makan();
        System.out.println("-----------------------------------\n");

        System.out.println("===================================");
        System.out.println("        Aktivitas Dosen");
        System.out.println("===================================");
        dosen.bernafas();
        dosen.makan();
        dosen.lembur();
        System.out.println("-----------------------------------\n");

        System.out.println("===================================");
        System.out.println("        Aktivitas Mahasiswa");
        System.out.println("===================================");
        mahasiswa.bernafas();
        mahasiswa.makan();
        mahasiswa.tidur();
        System.out.println("===================================\n");
    }
}

