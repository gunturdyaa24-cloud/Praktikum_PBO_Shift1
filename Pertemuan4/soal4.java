package pertemuan4;

import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan tahun: ");
        int tahun = in.nextInt();
        boolean kabisat = (tahun % 400 == 0) || (tahun % 4 == 0 && tahun % 100 != 0);
        System.out.println(tahun + (kabisat ? " adalah tahun kabisat" : " bukan tahun kabisat"));
    }
}
