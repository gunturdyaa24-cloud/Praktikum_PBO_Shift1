package tugasp3;

import java.io.*;

public class Belanja {
    public static void main(String[] args) throws IOException {
        DataInputStream input =
            new DataInputStream(System.in);

        DataOutputStream output =
            new DataOutputStream(System.out);

        output.writeBytes("Nama: ");
        String nama = input.readLine();

        output.writeBytes("Total Belanja: ");
        double belanja = Double.parseDouble(input.readLine());

        output.writeBytes("Diskon (%): ");
        double persen = Double.parseDouble(input.readLine());

        double diskon = belanja * persen / 100;
        double total = belanja - diskon;

        output.writeBytes("Bayar: ");
        double bayar = Double.parseDouble(input.readLine());

        double kembalian = bayar - total;

        output.writeBytes("\nNama: " + nama + "\n");
        output.writeBytes("Total Belanja: " + belanja + "\n");
        output.writeBytes("Diskon: " + diskon + "\n");
        output.writeBytes("Total Setelah Diskon: " + total + "\n");
        output.writeBytes("Bayar: " + bayar + "\n");
        output.writeBytes("Kembalian: " + kembalian + "\n");
        output.flush();
    }
}
