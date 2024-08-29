package TugasPraktikum;

public class MesinJahitDemo {
    public static void main(String[] args) {
        
        MesinJahit mesin1 = new MesinJahit();
        MesinJahit mesin2 = new MesinJahit();
        
        MesinJahitElektronik mesinElektronik1 = new MesinJahitElektronik();
        MesinJahitManual mesinManual1 = new MesinJahitManual();
        
        mesin1.setMerek("Singer");
        mesin1.setJumlahJarum(1);
        mesin1.setHarga(1500000);
        System.out.println("Informasi Mesin Jahit 1:");
        mesin1.cetakInformasi();
        mesin1.cetakHarga();
        
        mesin2.setMerek("Brother");
        mesin2.setJumlahJarum(2);
        mesin2.setHarga(2000000);
        System.out.println("\nInformasi Mesin Jahit 2:");
        mesin2.cetakInformasi();
        mesin2.cetakHarga();
    
        mesinManual1.setMerek("Singer");
        mesinManual1.setJumlahJarum(1);
        mesinManual1.setHarga(800000);
        mesinManual1.setPedal(true);
        mesinManual1.setRodaPengatur(true);
        System.out.println("\nInformasi Mesin Jahit Manual:");
        mesinManual1.cetakInformasi();

        mesinElektronik1.setMerek("Janome");
        mesinElektronik1.setJumlahJarum(3);
        mesinElektronik1.setHarga(3500000);
        mesinElektronik1.setJumlahModeJahit(15);
        mesinElektronik1.setOtomatis(true);
        System.out.println("\nInformasi Mesin Jahit Elektronik:");
        mesinElektronik1.cetakInformasi();
    }
}



