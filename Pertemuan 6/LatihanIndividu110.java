import java.util.Scanner;

public class LatihanIndividu110 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int bil1, bil2, bil3;
        int bilBesar;

        System.out.println("Masukan Bilangan 1 : ");
        bil1 = sc10.nextInt();
        System.out.println("Masukan Bilangan 2 : ");
        bil2 = sc10.nextInt();
        System.out.println("Masukan Bilangan 3 : ");
        bil3 = sc10.nextInt();

        if (bil1 >= bil2) {
            if (bil1 >= bil3) {
                System.out.println("Bilangan terbesar: " + bil1);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        } else {
            if (bil2 >= bil3) {
                System.out.println("Bilangan terbesar: " + bil2);
            } else {
                System.out.println("Bilangan terbesar: " + bil3);
            }
        }

    }

}