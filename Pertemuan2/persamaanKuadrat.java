
package tugasp2praktikum;

public class persamaanKuadrat {
    
    public static void main(String[] args) {
        int nilaiA = 2;
        int nilaiB = 10;
        int nilaiC = 5;

        int hasilB = nilaiB * nilaiB;
        int hasilAC = 4 * nilaiA * nilaiC;
        int hasilDiskriminan = hasilB - hasilAC;

        System.out.println("Nilai B kuadrat = " + hasilB);
        System.out.println("Nilai 4AC = " + hasilAC);
        System.out.println("Diskriminan = " + hasilDiskriminan);
    }
}

