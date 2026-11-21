package pertemuan7;

//1. Mekanisme kelas menjadi objek

//Kelas adalah cetak biru (blueprint), sedangkan objek adalah wujud nyatanya. Prosesnya:

//a. Kelas didefinisikan (atribut dan method).
//b. Objek dibuat dengan kata kunci new, sehingga memori dialokasikan.
//c. Constructor dipanggil untuk mengisi nilai awal.
//d. Alamat objek disimpan di variabel referensi.

class Mahasiswa {
    String nama;
    void sapa() { System.out.println("Halo, saya " + nama); }
}

public class Soal1 {
    public static void main(String[] args) {
        Mahasiswa m = new Mahasiswa();
        m.nama = "Budi";
        m.sapa();
    }
}
