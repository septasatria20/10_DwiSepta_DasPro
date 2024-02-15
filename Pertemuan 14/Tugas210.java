import java.util.Scanner;

public class Tugas210 {
    static int penjumlahanRekursif(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + penjumlahanRekursif(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = sc.nextInt();

        int hasil = penjumlahanRekursif(n);

        System.out.println("Penjumlahan dari 1 sampai " + n + " adalah: " + hasil);
    }
}
