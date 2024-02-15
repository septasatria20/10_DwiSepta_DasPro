import java.util.Scanner;

public class JmlDeret10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int i = 1;
        System.out.println("Deret bilangan 1-50 kecuali kelipatan 3 : ");

        for (i = 1; i <= 50; i++) {

            if (i % 3 != 0) {
                System.out.println(i);
            }
        }
        
    }
}