import java.util.Scanner ;

public class genap {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int potAkademik, bahasaInggris, wawancara;
        double nilaiAkhir, nilaiAkhirPA, nilaiAkhirBI, nilaiAkhirW;
        
        System.out.print("Masukkan Nilai Potensi Akademik : ");
        potAkademik = sc10.nextInt();
        nilaiAkhirPA = (potAkademik - (0.5 * potAkademik));
        System.out.println("Nilai Tes Potensi Akademik : " + nilaiAkhirPA);

        System.out.print("Masukkan Nilai Bahasa Inggris : ");
        bahasaInggris = sc10.nextInt();
        nilaiAkhirBI = (bahasaInggris - (0.3 * bahasaInggris));
        System.out.println("Nilai Tes Potensi Akademik : " + nilaiAkhirBI);

        System.out.print("Masukkan Nilai Wawancara : ");
        wawancara = sc10.nextInt();
        nilaiAkhirW = (wawancara - (0.2 * wawancara));
        System.out.println("Nilai Tes Potensi Akademik : " + nilaiAkhirW);

       nilaiAkhir = (nilaiAkhirPA + nilaiAkhirBI + nilaiAkhirW);
       System.out.println("Nilai Akhir anda adalah : " + nilaiAkhir);
    }
}