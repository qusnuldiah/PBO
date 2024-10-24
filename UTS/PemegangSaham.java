package UTS;

public class PemegangSaham extends Pegawai {
    private int deviden;
    private int jumSaham;

    public void setDeviden(int deviden) {
        this.deviden = deviden;
    }

    public int getDeviden() {
        return deviden;
    }

    public void setJumSaham(int jumSaham) {
        this.jumSaham = jumSaham;
    }

    public int getJumSaham() {
        return jumSaham;
    }

    // Menampilkan Data Pemegang Saham
    public void tampilDataPemegangSaham() {
        System.out.println("======== Data Pemegang Saham ========");
        tampilDataPokokPegawai();
        System.out.printf("%-20s: %d\n", "Deviden", getDeviden());
        System.out.printf("%-20s: %d\n", "Jumlah Saham", getJumSaham());
        System.out.printf("%-20s: %d\n", "Total Gaji", (getGaji() + getDeviden()));
    }
}

