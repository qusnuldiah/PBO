package Praktikum3;

public class TestKoperasi {
    public static void main(String[] args) {
        Anggota anggota1 = new Anggota("111333444", "Donny", 5000000);

        System.out.println("Nomor KTP: "+anggota1.getNomorKTP());
        System.out.println("Nama Anggota: "+anggota1.getNama());
        System.out.println("Limit Pinjaman: "+anggota1.getLimitPiinjaman());

        System.out.println("\nMeminjam uang 10.000.000...");
        anggota1.pinjam(10000000);

        System.out.println("\nMembayar pinjaman 4.000.000...");
        anggota1.pinjam(4000000);
        System.out.println("Jumlah pinjaman saat ini: "+anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar pinjaman 1.000.000");
        anggota1.angsur(1000000);
        System.out.println("Jumlah pinjaman saat ini: "+anggota1.getJumlahPinjaman());

        System.out.println("\nMembayar pinjaman 3.000.000");
        anggota1.angsur(3000000);
        System.out.println("Jumlah pinjaman saat ini: "+anggota1.getJumlahPinjaman());
    }
}
