package pertemuan4;

import java.util.Scanner;

public class soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Penjualan hari ini (Rp): ");
        double jual = in.nextDouble();

        double jasa, komisi;
        if (jual <= 2000000) {
            jasa = 100000;
            komisi = 0.10 * jual;
        } else if (jual <= 5000000) {
            jasa = 200000;
            komisi = 0.15 * jual;
        } else {
            jasa = 300000;
            komisi = 0.20 * jual;
        }

        System.out.println("Uang jasa : Rp" + jasa);
        System.out.println("Komisi    : Rp" + komisi);
        System.out.println("Pendapatan: Rp" + (jasa + komisi));
    }
}
