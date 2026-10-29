package pertemuan4;

import java.util.Scanner;

public class soal6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Punya kartu member? (y/n): ");
        boolean member = in.next().equalsIgnoreCase("y");
        System.out.print("Total belanja (Rp): ");
        double total = in.nextDouble();
        System.out.print("Uang dibayarkan (Rp): ");
        double uang = in.nextDouble();

        double diskon = 0;
        if (member) {
            if (total > 500000) diskon = 50000;
            else if (total > 100000) diskon = 15000;
        } else {
            if (total > 100000) diskon = 10000;
        }

        double bayar = total - diskon;
        System.out.println("Diskon      : Rp" + diskon);
        System.out.println("Harus bayar : Rp" + bayar);
        if (uang >= bayar)
            System.out.println("Kembalian   : Rp" + (uang - bayar));
        else
            System.out.println("Uang kurang Rp" + (bayar - uang));
    }
}
