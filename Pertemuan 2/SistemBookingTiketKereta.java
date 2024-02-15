import java.util.Scanner;

public class SistemBookingTiketKereta{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner str = new Scanner(System.in);

        int jml_hari_booking, jml_booking;
        double total;
        String asal, tujuan, multi_pengguna = "";
        String pilih_kursi = "";
        double diskon, harga_tiket, presentase_diskon = 0.20;

        System.out.println("Nama penumpang: ");
        multi_pengguna = str.nextLine();
        System.out.println("Stasiun asal: ");
        asal = str.nextLine();
        System.out.println("Stasiun tujuan: ");
        tujuan = str.nextLine();
        System.out.println("Masukkan jumlah hari booking: ");
        jml_hari_booking =input.nextInt();
        System.out.println("Masukkan jumlah booking: ");
        jml_booking = input.nextInt();
        System.out.println("Pilih kursi: ");
        pilih_kursi = str.nextLine();
        System.out.println("Harga tiket: ");
        harga_tiket =input.nextInt();
        
        diskon = harga_tiket*presentase_diskon;
        total = (jml_booking * harga_tiket) - diskon;
        
        System.out.println("Nama penumpang: " + multi_pengguna);
        System.out.println("Stasiun asal: " + asal);
        System.out.println("Stasiun tujuan: " + tujuan);
        System.out.println("Kursi: " + pilih_kursi);
        System.out.println("Diskon: " + diskon);
        System.out.println("Total: " + total);
    }
}
