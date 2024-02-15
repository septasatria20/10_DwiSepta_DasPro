import java.util.Scanner;

public class LatihanIndividu2_2{
    public static void main(String[] args) {
        Scanner input10 = new Scanner(System.in);
        String jenisBuku;
        int jmlBuku, harga, hargaAkhir;
        double diskon = 0;
        System.out.println("Masukkan jenis buku yang dibeli (kamus/novel/manga) : ");
        jenisBuku = input10.nextLine();
        System.out.println("Masukkan harga buku yang dibeli : ");
        harga = input10.nextInt();
        System.out.println("Masukkan jumlah buku yang dibeli : ");
        jmlBuku = input10.nextInt();

        if (jenisBuku.equalsIgnoreCase("kamus")) {
            if (jmlBuku >= 0){
                diskon = 0.1;}
            else if (jmlBuku >= 2){
                diskon = 0.1 + 0.02;
            System.out.println("Harga buku : " + harga);
            System.out.println("Diskon yang didapat adalah : " + diskon);}
            else {
            diskon = 0.0;}
            hargaAkhir = (int) (harga - (harga * diskon));
            System.out.println("Jumlah yang dibayarkan adalah : " + hargaAkhir);
        }

        else if (jenisBuku.equalsIgnoreCase("manga")) {
            if (jmlBuku >= 0){
                diskon = 0.0;}
            else if (jmlBuku >= 3){
                diskon = 0.05;
            System.out.println("Harga buku : " + harga);
            System.out.println("Diskon yang didapat adalah : " + diskon);}
            else {
            diskon = 0.0;}
            hargaAkhir = (int) (harga - (harga * diskon));
            System.out.println("Jumlah yang dibayarkan adalah : " + hargaAkhir);
        }

        else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jmlBuku >= 0){
                diskon = 0.07;}
            else if (jmlBuku >= 3){
                diskon = 0.07 + 0.02;}
            else if (jmlBuku <= 3){
                diskon = 0.07 + 0.1;}
            System.out.println("Harga buku : " + harga);
            System.out.println("Diskon yang didapat adalah : " + diskon);
        }else  {
            diskon = 0.0;}
            hargaAkhir = (int) (harga - (harga * diskon));
            System.out.println("Jumlah yang dibayarkan adalah : " + hargaAkhir);      
    }
}