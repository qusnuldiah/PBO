package UTS;

public class Pegawai {
    private String noIndukPegawai;
    private String nama;
    public int gaji;

    public void setNoIndukPegawai(String noIndukPegawai) {
        this.noIndukPegawai = noIndukPegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoIndukPegawai() {
        return noIndukPegawai;
    }

    public String getNama() {
        return nama;
    }

    public void setGaji(int gaji) {
        this.gaji = gaji;
    }

    public int getGaji() {
        return gaji;
    }

    // Menampilkan Data Pokok Pegawai
    public void tampilDataPokokPegawai() {
        System.out.printf("%-20s: %s\n", "No Induk", getNoIndukPegawai());
        System.out.printf("%-20s: %s\n", "Nama", getNama());
        System.out.printf("%-20s: %d\n", "Gaji Pokok", getGaji());
    }
}
