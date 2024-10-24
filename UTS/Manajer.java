package UTS;

public class Manajer extends Pegawai {
    private int tunjanganJabatan;

    public void setTunjanganJabatan(int tunjanganJabatan) {
        this.tunjanganJabatan = tunjanganJabatan;
    }

    public int getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    // Menampilkan Data Manajer
    public void tampilDataManajer() {
        System.out.println("======== Data Manajer ========");
        tampilDataPokokPegawai();
        System.out.printf("%-25s: %d\n", "Tunjangan Jabatan", getTunjanganJabatan());
        System.out.printf("%-25s: %d\n", "Total Gaji", (getGaji() + getTunjanganJabatan()));
    }
}


