package tugasp2praktikum;

public class pythagorasKeliling {
    public static void main(String[] args) {
        double a = 6;
        double b = 8;
        
        double c = Math.sqrt((a * a) + (b * b));
        double keliling = a + b + c;
        
        System.out.println("Nilai c (Sisi Miring) = " + c);
        System.out.println("Keliling Segitiga = " + keliling);
    }
}
