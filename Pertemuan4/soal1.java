package pertemuan4;

import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        int n = in.nextInt();
        System.out.println(n + (n % 2 == 0 ? " adalah bilangan genap" : " adalah bilangan ganjil"));
    }
}
    
