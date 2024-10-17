package Praktikum7;

public class Manusia {
    public void bernafas() {
        System.out.println("Manusia sedang bernafas.");
    }

    public void makan() {
        System.out.println("Manusia sedang makan.");
    }
}

// Subclass Dosen overriding makan
class Dosen extends Manusia {
    public void makan() {
        System.out.println("Dosen sedang makan sambil bekerja.");
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur.");
    }
}

// Subclass Mahasiswa overriding makan
class Mahasiswa extends Manusia {
    public void makan() {
        System.out.println("Mahasiswa sedang makan mie instan.");
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur.");
    }
}
