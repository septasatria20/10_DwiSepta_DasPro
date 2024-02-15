import java.util.Scanner;

public class DeretBil10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int total = 0;
        int i = 25;

         while (i >= 1) {
            total += i;
            System.out.println("Angka ke-" + i);
            i--;
        }
    }
}
