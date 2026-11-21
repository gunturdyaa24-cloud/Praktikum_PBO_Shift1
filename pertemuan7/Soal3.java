package pertemuan7;

import java.util.Scanner;

public class Soal3 {
    static int hitung(int bulan, int tanggal) {
        return bulan * 100 + tanggal;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Bulan lahir (1-12): ");
        int bulan = in.nextInt();
        System.out.print("Tanggal lahir: ");
        int tgl = in.nextInt();
        System.out.println("Hasil akhir = " + hitung(bulan, tgl));
    }
}
