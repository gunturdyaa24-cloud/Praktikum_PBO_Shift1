package pertemuan4;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("NIK: ");
        String nik = in.nextLine();
        
        System.out.print("Nama: ");
        String nama = in.nextLine();
        
        System.out.print("Kode golongan (1-4): ");
        int kode = in.nextInt();
        int anak = 0;
        if (kode == 4) {
            System.out.print("Jumlah anak: ");
            anak = in.nextInt();
        }
 
        double gajiPokok;
        String status;
        switch (kode) {
            case 1: gajiPokok = 1200000; status = "Menikah"; break;
            case 2: gajiPokok = 1500000; status = "Belum menikah"; break;
            case 3: gajiPokok = 1750000; status = "Cerai"; break;
            case 4: gajiPokok = 2000000; status = "Menikah dan punya anak"; break;
            default:
                System.out.println("Kode golongan tidak valid");
                return;
        }
 
        double tunjPasangan = (kode == 1 || kode == 4) ? 0.10 * gajiPokok : 0; // 10% gaji pokok
        double tunjAnak = 0.05 * gajiPokok * anak;                            // 5% gaji pokok x jumlah anak
        double tunjangan = tunjPasangan + tunjAnak;
        double gajiBersih = gajiPokok + tunjangan;
 
        System.out.println("\nNIK              : " + nik);
        System.out.println("Nama             : " + nama);
        System.out.println("Status           : " + status);
        System.out.println("Gaji pokok       : Rp" + gajiPokok);
        System.out.println("Tunjangan pasangan: Rp" + tunjPasangan);
        System.out.println("Tunjangan anak   : Rp" + tunjAnak);
        System.out.println("Total tunjangan  : Rp" + tunjangan);
        System.out.println("Gaji bersih      : Rp" + gajiBersih);
    }
}
