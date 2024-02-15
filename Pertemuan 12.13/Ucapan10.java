import java.util.Scanner;

public class Ucapan10 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }
    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Terimakasih " + nama + " atas segalanya"); 
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
    }
}