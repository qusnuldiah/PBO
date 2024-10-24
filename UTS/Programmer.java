package UTS;

public class Programmer extends Pegawai {
    private int bonus;

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    // Menampilkan Data Programmer
    public void tampilDataProgrammer() {
        System.out.println("======== Data Programmer ========");
        tampilDataPokokPegawai();
        System.out.printf("%-20s: %d\n", "Bonus", getBonus());
        System.out.printf("%-20s: %d\n", "Total Gaji", (getGaji() + getBonus()));
    }
}

