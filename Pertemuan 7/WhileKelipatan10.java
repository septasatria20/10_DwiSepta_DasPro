import java.util.Scanner;

public class WhileKelipatan10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int kelipatan;
        int jumlah = 0, counter = 0;
        double rerata = 0;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = sc10.nextInt();
        int i = 1;
        while (i <= 50){
            if (i % kelipatan == 0){
                jumlah += i;
                counter++;
            }
            i++;
        }
    }
}
