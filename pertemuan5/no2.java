package p5;

import java.util.Scanner;

public class no2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int banyak, angka, total = 0;
        double rataRata;

        System.out.print("Masukkan banyak bilangan: ");
        banyak = input.nextInt();

        for (int i = 1; i <= banyak; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextInt();

            total += angka;
        }

        rataRata = (double) total / banyak;

        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);
    }
}
