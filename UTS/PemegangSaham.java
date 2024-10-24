package UTS;

public class PemegangSaham extends Manajer {
    public int deviden;
    public int jumSaham;

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
        System.out.printf("%-25s: %d\n", "Tunjangan Jabatan", getTunjanganJabatan());
        int totalGajiDenganTunjangan = getGaji() + getTunjanganJabatan();
        System.out.printf("%-25s: %d\n", "Total Gaji", totalGajiDenganTunjangan);
        System.out.printf("%-25s: %d\n", "Deviden", getDeviden());
        System.out.printf("%-25s: %d\n", "Jumlah Saham", getJumSaham());
        int totalGajiDenganDeviden = totalGajiDenganTunjangan + getDeviden();
        System.out.printf("%-25s: %d\n", "Total Gaji dengan Deviden", totalGajiDenganDeviden);
    }
}

