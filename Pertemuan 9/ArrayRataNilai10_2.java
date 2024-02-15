import java.net.SocketTimeoutException;
import java.util.Scanner;

public class ArrayRataNilai10_2 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int[] nilaiMhs = new int[5];
        int jumlah;
        int lulus = 0;
        int tidakLulus = 0;
        double totalLulus = 0;
        double totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;
        System.out.print("Masukkan jumlah mahasiswa : ");
        jumlah = sc10.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc10.nextInt();
        }
            for (int i = 0; i < nilaiMhs.length; i++) {
                if (nilaiMhs[i] > 70) {
                    System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                    totalLulus += nilaiMhs[i];
                    lulus++;
                    
                } else {
                    System.out.println("Mahasiswa ke-" + (i+1) + " Tidak lulus!");
                    totalTdkLulus += nilaiMhs[i];
                    tidakLulus++;
                }
            }
        rataLulus = totalLulus/lulus;
        rataTdkLulus = totalTdkLulus/tidakLulus;
        System.out.println("Rata-rata nilai Lulus= " + rataLulus );
        System.out.println("Rata-rata nilai Tidak Lulus= " + rataTdkLulus );
        System.out.println("Mahasiswa yang lulus : " + lulus);
        System.out.println("Mahasiswa yang tidak lulus : " + tidakLulus);
    }
}
