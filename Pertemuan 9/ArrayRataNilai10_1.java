import java.util.Scanner;

public class ArrayRataNilai10_1 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        int lulus = 0;
        int tidakLulus = 0;
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc10.nextInt();
        }
            for (int i = 0; i < nilaiMhs.length; i++) {
                total += nilaiMhs[i];
                if (nilaiMhs[i] > 70) {
                    System.out.println("Mahasiswa ke-" + i + " lulus!");
                    lulus++;
                    
                } else {
                    System.out.println("Mahasiswa ke-" + i + " Tidak lulus!");
                    tidakLulus++;
                }
            }
        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = " + rata2);
        System.out.println("Mahasiswa yang lulus : " + lulus);
        System.out.println("Mahasiswa yang tidak lulus : " + tidakLulus);
    }
}
