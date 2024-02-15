import java.util.Scanner;

public class Sorting10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] badminton = new String[5];
        String[] tenismeja = new String[5];
        String[] basket = new String[5];
        String[] voly = new String[5];
        String temp;

        System.out.println("Atlet Badminton:");
        for (int i = 0; i < badminton.length; i++){
            System.out.print("Masukkan Nama Atlet ke-"+ (i+1) +": ");
            badminton[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Atlet Tenis Meja:");
        for (int i = 0; i < tenismeja.length; i++){
            System.out.print("Masukkan Nama Atlet ke-"+ (i+1) +": ");
            tenismeja[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Atlet Basket:");
        for (int i = 0; i < basket.length; i++){
            System.out.print("Masukkan Nama Atlet ke-"+ (i+1) +": ");
            basket[i] = sc.nextLine();
        }
        System.out.println();
        System.out.println("Atlet Bola Voly:");
        for (int i = 0; i < voly.length; i++){
            System.out.print("Masukkan Nama Atlet ke-"+ (i+1) +": ");
            voly[i] = sc.nextLine();
        }
        System.out.println();

        System.out.println("Data Nama Atlet Badminton:");
        for (int j = 0; j < badminton.length; j++) {
            for (int i = j + 1; i < badminton.length; i++) {
               if (badminton[i].compareTo(badminton[j]) < 0) {
                    temp = badminton[j];
                    badminton[j] = badminton[i];
                    badminton[i] = temp;
               }
            }
            System.out.println(badminton[j]);
        }
        System.out.println();
        System.out.println("Data Nama Atlet Tenis Meja:");
        for (int j = 0; j < tenismeja.length; j++) {
            for (int i = j + 1; i < tenismeja.length; i++) {
               if (tenismeja[i].compareTo(tenismeja[j]) < 0) {
                    temp = tenismeja[j];
                    tenismeja[j] = tenismeja[i];
                    tenismeja[i] = temp;
               }
            }
            System.out.println(tenismeja[j]);
        }
        System.out.println();
        System.out.println("Data Nama Atlet Basket:");
        for (int j = 0; j < basket.length; j++) {
            for (int i = j + 1; i < basket.length; i++) {
               if (basket[i].compareTo(basket[j]) < 0) {
                    temp = basket[j];
                    basket[j] = basket[i];
                    basket[i] = temp;
               }
            }
            System.out.println(basket[j]);
        }
        System.out.println();
        System.out.println("Data Nama Atlet Bola Voly:");
        for (int j = 0; j < voly.length; j++) {
            for (int i = j + 1; i < voly.length; i++) {
               if (voly[i].compareTo(voly[j]) < 0) {
                    temp = voly[j];
                    voly[j] = voly[i];
                    voly[i] = temp;
               }
            }
            System.out.println(voly[j]);
        }
    }
}
