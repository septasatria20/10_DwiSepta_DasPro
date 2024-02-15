import java.util.Scanner;
public class LinearSearch10_2 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner (System.in);

        int [] nilaiKey = new int [10];
        int jmlKey = 0;
        int hasil = 0;
        int cari = 0;
        

        System.out.print("Masukkan jumlah elemen array : ");
        jmlKey = sc10.nextInt();

        for (int i = 0; i < jmlKey; i++) {
            System.out.print("Masukkan elemen array ke-"+(i)+" : ");
            nilaiKey[i] = sc10.nextInt();
        }

        System.out.print("Masukkan key yang ingin dicari : ");
        cari = sc10.nextInt();
        for (int i = 0; i < jmlKey; i++){
            if (nilaiKey[i] == cari){
                hasil = i;
                System.out.println("Key ada di posisi ke- " +i);
                break;
            } else {
                System.out.println("Key tidak ditemukan");
            }
        }
    }
}