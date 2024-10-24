package UTS;

public class DemoPegawai {
    public static void main(String[] args) {
        // Membuat objek Pemegang Saham
        PemegangSaham pemegangSaham = new PemegangSaham();
        pemegangSaham.setNoIndukPegawai("001");
        pemegangSaham.setNama("Drogba");
        pemegangSaham.setGaji(100000);
        pemegangSaham.setTunjanganJabatan(50000);
        pemegangSaham.setDeviden(1000);
        pemegangSaham.setJumSaham(10);

        // Menampilkan data pemegang saham
        pemegangSaham.tampilDataPemegangSaham();
    }
}

