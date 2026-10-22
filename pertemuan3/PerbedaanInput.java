package tugasp3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class PerbedaanInput {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan umur (Scanner): ");
        int umur1 = sc.nextInt();

        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Masukkan nama (BufferedReader): ");
        String nama = br.readLine();

        System.out.println("Umur: " + umur1);
        System.out.println("Nama: " + nama);

        sc.close();
        br.close();
    }
}

