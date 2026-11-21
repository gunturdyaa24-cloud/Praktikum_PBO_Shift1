package pertemuan7;

public class Soal5 {
    static int faktorial(int n) {
        if (n <= 1) return 1;
        return n * faktorial(n - 1);
    }
    public static void main(String[] args) {
        System.out.println("5! = " + faktorial(5));
    }
}
