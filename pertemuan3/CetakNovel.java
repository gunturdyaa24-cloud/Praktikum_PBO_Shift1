package tugasp3;

import java.util.Scanner;

public class CetakNovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jumlah novel: ");
        int novel = input.nextInt();

        System.out.print("Jumlah lembar per novel: ");
        int lembar = input.nextInt();

        int totalLembar = novel * lembar;

        // Kecepatan mesin 1 lembar per detik
        int totalDetik = totalLembar;

        int hari = totalDetik / 86400;
        int sisa = totalDetik % 86400;

        int jam = sisa / 3600;
        sisa = sisa % 3600;

        int menit = sisa / 60;
        int detik = sisa % 60;

        System.out.println("Total lembar: " + totalLembar);
        System.out.println("Waktu pencetakan:");
        System.out.println("Hari: " + hari);
        System.out.println("Jam: " + jam);
        System.out.println("Menit: " + menit);
        System.out.println("Detik: " + detik);

        input.close();
    }
}

