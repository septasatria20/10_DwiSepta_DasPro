
import java.util.Scanner;

public class ForKelipatan10_1 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int kelipatan;
        int jumlah = 0, counter = 0;
        double rerata = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc10.nextInt();
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;          
        }
        if (counter > 0){
            rerata = (double) jumlah / counter;
        }
    }
    System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
    System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    System.out.printf("Rata-rata bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, rerata);
            }
}
