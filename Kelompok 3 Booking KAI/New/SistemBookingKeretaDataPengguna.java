import java.util.Scanner;

public class SistemBookingKeretaDataPengguna {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jml_booking;
        double total = 0;
        String[] namaPenumpang = new String[100];
        long[] nomorNik = new long[100];
        long[] nomorTelp = new long[100];

        System.out.println("================================================");
        System.out.println("   Selamat datang di Layanan Pemesanan Kereta   ");
        System.out.println("================================================");
        System.out.println("Silahkan input data anda");

        System.out.print("Masukkan jumlah penumpang : ");
        jml_booking = input.nextInt();

        for (int i = 0; i < jml_booking; i++) {
            Scanner str = new Scanner(System.in);
            System.out.print("Nama penumpang ke-" + (i + 1) + ": ");
            namaPenumpang[i] = str.nextLine();
            System.out.print("Nomor Induk Kependudukan (NIK) ke-" + (i + 1) + ": ");
            nomorNik[i] = input.nextLong();
            System.out.print("Nomor telepon ke-" + (i + 1) + ": ");
            nomorTelp[i] = input.nextLong();
        }

        System.out.println("\n--------- Data Pemesanan Tiket ---------");
        for (int i = 0; i < jml_booking; i++) {
            System.out.println("========================================");
            System.out.println("          Tiket Penumpang ke-" + (i + 1));
            System.out.println("Nama penumpang : " + namaPenumpang[i]);
            System.out.println("Nomor NIK      : " + nomorNik[i]);
            System.out.println("Nomor telepon  : " + nomorTelp[i]);
            System.out.println("========================================");
        }
    }
}
