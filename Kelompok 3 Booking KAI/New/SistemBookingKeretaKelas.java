import java.util.Scanner;

public class SistemBookingKeretaKelas {
    public static void main(String[] args) {
        // Inisialisasi array 2 dimensi untuk kelas kereta
        String[][] kelasKereta = {
                {"Ekonomi", "Rp. 250.000", "Kereta Matarmaja(233)", "Malang-Pasar Senen"},
                {"Eksekutif", "Rp. 550.000", "Kereta Jayabaya(107)", "Malang-Pasar Senen"},
                {"Ekonomi", "Rp. 250.000", "Kereta Matarmaja(234)", "Pasar Senen-Malang"},
                {"Eksekutif", "Rp. 550.000", "Kereta Jayabaya(108)", "Pasar Senen-Malang"},
                {"Ekonomi", "Rp. 200.000", "Kereta Kartanegara(133)", "Malang-Solo Balapan"},
                {"Eksekutif", "Rp. 455.000", "Kereta Gajayana(55)", "Malang-Solo Balapan"},
                {"Ekonomi", "Rp. 200.000", "Kereta Kartanegara(134)", "Solo Balapan-Malang"},
                {"Eksekutif", "Rp. 455.000", "Kereta Gajayana(56)", "Solo Balapan-Malang"}
        };

        // Menampilkan pilihan kelas kereta
        System.out.println("========================================================");
        System.out.println("      Pilihan Kelas Kereta untuk Berbagai Jurusan:      ");
        System.out.println("========================================================");
        for (int i = 0; i < kelasKereta.length; i++) {
            System.out.println((i + 1) + ". " + "(" +kelasKereta[i][3] + ") " + kelasKereta[i][2] + " " + kelasKereta[i][0] + " - Harga: " + kelasKereta[i][1]);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor kelas kereta yang dipilih: ");
        int pilihan = scanner.nextInt();

        if (pilihan >= 1 && pilihan <= kelasKereta.length) {
            String kelasDipilih = kelasKereta[pilihan - 1][0];
            String hargaDipilih = kelasKereta[pilihan - 1][1];
            String keretaDipilih = kelasKereta[pilihan - 1][2];
            String tujuanDipilih = kelasKereta[pilihan - 1][3];

            System.out.println("Anda memilih kelas " + kelasDipilih + " dengan harga " + hargaDipilih);
            System.out.println("Anda akan bepergian ke " + tujuanDipilih);
            System.out.println("Kereta yang Anda pilih: " + keretaDipilih);
        } else {
            System.out.println("Nomor kelas tidak valid. Silakan pilih nomor kelas yang benar.");
        }
    }
}
