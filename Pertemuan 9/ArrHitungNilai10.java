import java.util.Scanner;

public class ArrHitungNilai10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner (System.in);

        int [] nilai = new int [10];
        double rataRata;
        int jmlNilai = 0;
        int max,min;
        double total = 0;
        
        System.out.print("Masukkan Banyaknya Nilai : ");
        jmlNilai = sc10.nextInt();

        for (int i = 0; i < jmlNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilai[i] = sc10.nextInt();
            total += nilai[i];
        }

        max = nilai[0];
        min = nilai[0];
        for (int i = 0; i < jmlNilai; i++){
            if(nilai[i] > max){
            max = nilai[i];
            } else if (nilai[i] < min) {
            min = nilai[i];
            }
        }

        rataRata = total / jmlNilai;
        System.out.println("Rata-rata nilai adalah : " + rataRata);
        System.out.println("Nilai tertinggi adalah : " + max);
        System.out.println("Nilai terendah adalah : " + min);
    }
}