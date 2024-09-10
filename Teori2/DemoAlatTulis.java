package Teori2;

public class DemoAlatTulis {
    public static void main(String[] args) {

        AlatTulis bolpoint = new AlatTulis();
        bolpoint.setNama("Bolpoint");
        bolpoint.setStok(10);
        bolpoint.setHargaSatuan(2000);

        AlatTulis pensil = new AlatTulis();
        pensil.setNama("Pensil");
        pensil.setStok(10);
        pensil.setHargaSatuan(1000);

        AlatTulis penghapus = new AlatTulis();
        penghapus.setNama("Penghapus");
        penghapus.setStok(10);
        penghapus.setHargaSatuan(500);

        // Display data
        System.out.println("=====================================================================");
        System.out.println("                        DETAIL BARANG");
        System.out.println("=====================================================================");
        System.out.println("Nama: " + bolpoint.getNama() + ", Stok: " + bolpoint.getStok() 
                + ", Harga Satuan: " + bolpoint.getHargaSatuan() + ", Harga Total: " + bolpoint.getHargaTotal());
        System.out.println("Nama: " + pensil.getNama() + ", Stok: " + pensil.getStok() 
                + ", Harga Satuan: " + pensil.getHargaSatuan() + ", Harga Total: " + pensil.getHargaTotal());
        System.out.println("Nama: " + penghapus.getNama() + ", Stok: " + penghapus.getStok() 
                + ", Harga Satuan: " + penghapus.getHargaSatuan() + ", Harga Total: " + penghapus.getHargaTotal());
        System.out.println("_____________________________________________________________________");

        // Hitung total harga
        int totalSemua = bolpoint.getHargaTotal() + pensil.getHargaTotal() + penghapus.getHargaTotal();
        System.out.println("Total Harga Semua Barang: Rp. " + totalSemua);
        System.out.println("_____________________________________________________________________");
    }
}