package tugasp3;


import java.util.Scanner;

public class GajiPegawai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nip, nama, alamat, jabatan;
        double gajiPokok, tunjanganJabatan;
        double tunjanganIstri, tunjanganAnak;
        double totalGaji, pajak, gajiBersih;

        System.out.print("Nomor Induk Karyawan: ");
        nip = input.nextLine();

        System.out.print("Nama Karyawan: ");
        nama = input.nextLine();

        System.out.print("Alamat: ");
        alamat = input.nextLine();

        System.out.print("Jabatan: ");
        jabatan = input.nextLine();

        System.out.print("Gaji Pokok: ");
        gajiPokok = input.nextDouble();

        System.out.print("Tunjangan Jabatan: ");
        tunjanganJabatan = input.nextDouble();

        System.out.print("Tunjangan Istri: ");
        tunjanganIstri = input.nextDouble();

        System.out.print("Tunjangan Anak: ");
        tunjanganAnak = input.nextDouble();

        totalGaji = gajiPokok + tunjanganJabatan
                  + tunjanganIstri + tunjanganAnak;

        pajak = 0.10 * totalGaji;
        gajiBersih = totalGaji - pajak;

        System.out.println("\n=== DATA PEGAWAI ===");
        System.out.println("NIP: " + nip);
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Total Gaji: " + totalGaji);
        System.out.println("Pajak: " + pajak);
        System.out.println("Gaji Bersih: " + gajiBersih);

        input.close();
    }
}

