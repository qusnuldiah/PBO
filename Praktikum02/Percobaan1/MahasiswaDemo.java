package Percobaan1;

public class MahasiswaDemo {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nim = "023432";
        m1.nama = "Yansy Ayuningtyas";
        m1.alamat = "Nias, Sumatera Utara";
        m1.kelas = "2A";
        m1.displayBiodata();

        // Instansiasi objek mahasiswa baru
        Mahasiswa m2 = new Mahasiswa();
        m2.nim = "023433";
        m2.nama = "Qusnul Diah";
        m2.alamat = "Bojonegoro, Jawa Timur";
        m2.kelas = "2A";
        m2.displayBiodata();

        Mahasiswa m3 = new Mahasiswa();
        m3.nim = "023434";
        m3.nama = "Amanda";
        m3.alamat = "Surabaya, Jawa Timur";
        m3.kelas = "2B";
        m3.displayBiodata();
    }
}
