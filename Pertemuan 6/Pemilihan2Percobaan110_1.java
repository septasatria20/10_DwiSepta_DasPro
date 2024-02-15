import java.util.Scanner;

public class Pemilihan2Percobaan110_1 {
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        System.out.println("Masukkan Tahun : ");
        int tahun = input10.nextInt();
        if ((tahun % 4) == 0) {
            System.out.println("Bukan Tahun Kabisat");
        } else
        System.out.println("Tahun Kabisat");
    }
}