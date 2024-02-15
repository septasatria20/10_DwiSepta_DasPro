import java.util.Scanner;

public class UcapanTerimakasih10_1 {
    
    public static String penerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        return namaOrang;
    }

    public static void ucapanTerimakasih() {
        String nama = penerimaUcapan();
        System.out.println("Terimakasih " + nama + " atas segalanya"); 
    }

    public static void ucapanTambahan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Semoga lebih bahagia dengannya");
        String tambahan = sc.nextLine();
    }

    public static void main(String[] args) {
        ucapanTerimakasih();
        ucapanTambahan();
    }
}
