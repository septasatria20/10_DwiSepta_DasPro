import java.util.Scanner;

public class HargaBayar10{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk;
        int halaman, harga, jumlah;
        double dis, total, bayar, jmlDis;
        System.out.println("Masukkan Merk Buku yang dibeli ");
        merk = input.nextLine();
        System.out.println("Jumlah Halaman Buku yang dibeli ");
        halaman = input.nextInt();
        System.out.println("Masukkan harga buku yang dibeli ");
        harga = input.nextInt();
        System.out.println("Masukkan Jumlah buku yang dibeli ");
        jumlah = input.nextInt();
        System.out.println("Masukkan Diskon Buku");
        dis = input.nextDouble();
        total=harga*jumlah;
        jmlDis=total*dis;
        bayar=total-jmlDis;
        System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
        System.out.println("Jumlah yang harus dibayar adalah " +bayar);

    }
}