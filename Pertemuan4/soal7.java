package pertemuan4;

import java.util.Scanner;

public class soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("1. Luas Persegi");
        System.out.println("2. Luas Segitiga");
        System.out.println("3. Luas Lingkaran");
        System.out.println("4. Luas Trapesium");
        System.out.println("5. Luas Layang-layang");
        System.out.print("Pilih menu (1-5): ");
        int pilih = in.nextInt();

        double luas;
        switch (pilih) {
            case 1:
                System.out.print("Sisi: ");
                double s = in.nextDouble();
                luas = s * s;
                break;
            case 2:
                System.out.print("Alas dan tinggi: ");
                luas = 0.5 * in.nextDouble() * in.nextDouble();
                break;
            case 3:
                System.out.print("Jari-jari: ");
                double r = in.nextDouble();
                luas = Math.PI * r * r;
                break;
            case 4:
                System.out.print("Sisi sejajar a, b, dan tinggi: ");
                luas = 0.5 * (in.nextDouble() + in.nextDouble()) * in.nextDouble();
                break;
            case 5:
                System.out.print("Diagonal 1 dan diagonal 2: ");
                luas = 0.5 * in.nextDouble() * in.nextDouble();
                break;
            default:
                System.out.println("Menu tidak valid");
                return;
        }
        System.out.println("Luas = " + luas);
    }
}
