package p5;

import java.util.Scanner;

public class no4 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int banyak, angka = 1, total = 0;

        System.out.print("Masukkan banyak angka: ");
        banyak = input.nextInt();

        for (int i = 1; i <= banyak; i++) {
            System.out.print(angka + " ");
            total += angka;
            angka += 2;
        }

        System.out.println();
        System.out.println("Total penjumlahan: " + total);
    }
}
