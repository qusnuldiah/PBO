package UTS;

public class DemoPegawai {
    public static void main(String[] args) {
        // Membuat objek Manajer
        Manajer manajer = new Manajer();
        manajer.setNoIndukPegawai("001");
        manajer.setNama("Drogba");
        manajer.setGaji(100000);
        manajer.setTunjanganJabatan(50000);
        
        // Menampilkan data manajer
        manajer.tampilDataManajer();
    }
}

