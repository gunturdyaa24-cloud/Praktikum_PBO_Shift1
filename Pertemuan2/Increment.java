
package tugasp2praktikum;

    
public class Increment {
    public static void main(String[] args) {
        int nilai = 5;

        System.out.println("Nilai awal: " + nilai);

        int preIncrement = ++nilai;
        System.out.println("Pre-increment (++nilai): " + preIncrement);

        int postIncrement = nilai++;
        System.out.println("Post-increment (nilai++): " + postIncrement);

        System.out.println("Nilai akhir: " + nilai);
    }
}

    

