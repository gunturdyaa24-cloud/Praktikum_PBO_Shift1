package pertemuan7;

class Civitas {
    String nama, status;
    Civitas(String nama, String status) {
        this.nama = nama;
        this.status = status;
    }
    void tampil() {
        System.out.println("Nama: " + nama + " | Status: " + status);
    }
}

class Dosen extends Civitas {
    Dosen(String nama) { super(nama, "Dosen Fakultas Teknik"); }
}
class Mahasiswa extends Civitas {
    Mahasiswa(String nama) { super(nama, "Mahasiswa Fakultas Teknik"); }
}
class Staff extends Civitas {
    Staff(String nama) { super(nama, "Staff Fakultas Teknik"); }
}

public class Soal6 {
    public static void main(String[] args) {
        new Dosen("Pak Andi").tampil();
        new Mahasiswa("Siti").tampil();
        new Staff("Rudi").tampil();
    }
}