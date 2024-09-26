package Praktikum4;

public class KonserDemo {
    public static void main(String[] args) {
        Konser konser = new Konser("Konser IU", "GBK", "2024-10-15");

        // Menambahkan tiket ke konser
        Tiket tiket1 = new Tiket("001", 2500000);
        Tiket tiket2 = new Tiket("002", 4500000);
        konser.addTiket(tiket1);
        konser.addTiket(tiket2);

        // Menambahkan pemesan
        Pemesan pemesan1 = new Pemesan("Qusnul");
        Pemesan pemesan2 = new Pemesan("Diah");

        pemesan1.pesanTiket(tiket1);
        pemesan2.pesanTiket(tiket2);

        konser.showTiketTersedia();

        // Menambahkan pemesan ke daftar konser
        konser.addPemesan(pemesan1);
        konser.addPemesan(pemesan2);

        konser.showPemesan();
    }
}

