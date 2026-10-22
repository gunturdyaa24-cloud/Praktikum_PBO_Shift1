package tugasp3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Buah {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Jumlah mangga: ");
        int mangga = Integer.parseInt(input.readLine());

        System.out.print("Jumlah tetangga: ");
        int tetangga = Integer.parseInt(input.readLine());

        System.out.print("Jambu per tetangga: ");
        int jambu = Integer.parseInt(input.readLine());

        System.out.print("Mangga busuk: ");
        int busuk = Integer.parseInt(input.readLine());

        int totalJambu = tetangga * jambu;
        int totalAwal = mangga + totalJambu;
        int totalAkhir = totalAwal - busuk;

        System.out.println("Total buah awal: " + totalAwal);
        System.out.println("Total buah dikembalikan: " + busuk);
        System.out.println("Total buah setelah pengembalian: "
                           + totalAkhir);
    }
}

