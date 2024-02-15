import java.util.Scanner;

public class Toko10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int jumlah, konfirmasi, harga, diskon;
        String nama, produk, konfirmasi2;
        double  subTotal;
        System.out.println("Program Toko");
        System.out.println("Masukkan nama anda : ");
        nama = sc10.nextLine();

        do{
            System.out.println("Masukkan Produk yang anda beli : ");
            produk = sc10.nextLine();
            System.out.println("Masukkan jumlah produk : ");
            jumlah = sc10.nextInt();
            System.out.println("Masukkan harga : ");
            harga = sc10.nextInt();
            System.out.println("Masukkan Diskon (%)");
            diskon = sc10.nextInt();
            System.out.println("Apakah anda akan menambahkan produk? (1/2)");
            System.out.println("1. Ya");
            System.out.println("2. Tidak");
            konfirmasi = sc10.nextInt(); 
            
            } while(konfirmasi > 1);

            System.out.println("Apakah memiliki member? (y/t)");
            konfirmasi2 = sc10.nextLine();
                if (konfirmasi2.equalsIgnoreCase("y")){
                     //total pembelian
                    System.out.println("----------Total Pembelian----------");
                    System.out.println("Nama pelanggan : " + nama);
                    System.out.println("Tipe : member");
                    System.out.println("Total item barang yang dibeli : " + jumlah);
                    System.out.println("SubTotal : ");
                    System.out.println("Total Diskon : ");
                } else
                 //total pembelian
                    System.out.println("----------Total Pembelian----------");
                    System.out.println("Nama pelanggan : " + nama);
                    System.out.println("Tipe : bukan member");
                    System.out.println("Total item barang yang dibeli : " + jumlah);
                    System.out.println("SubTotal : ");
                    System.out.println("Total Diskon : ");
                   

        

    }
}
