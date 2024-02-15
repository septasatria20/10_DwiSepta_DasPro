import java.util.Scanner;

public class SistemBookingKeretaBangku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;
        String[][] bangku = new String[30][5];
        System.out.println("===============================================");
        System.out.println("    Selamat datang di Menu Pemilihan Bangku    ");
        System.out.println("===============================================");

        // Isi beberapa kursi agar tidak kosong
        bangku[0][0] = "Alfin";
        bangku[0][1] = "Afril";
        bangku[0][2] = "Rakhmadani";
        bangku[0][3] = "Afiq";
        bangku[1][0] = "Faza";
        bangku[1][1] = "Reza";
        bangku[1][2] = "Surya";
        bangku[2][1] = "Nopal";
        bangku[4][3] = "Bayu";
        bangku[5][0] = "Firman";
        bangku[5][2] = "Iga";
        bangku[9][3] = "Jokowi";
        bangku[9][1] = "Megawati";
        bangku[10][1] = "Prabowo";
        bangku[10][2] = "Ganjar";
        bangku[10][3] = "Anies";
        bangku[11][1] = "Gibran";
        bangku[11][2] = "Mahfud";
        bangku[11][3] = "Imin";


        while (true) {
            System.out.print("Masukkan nama penumpang  : ");
            nama = sc.next();
            System.out.print("Masukkan baris bangku    : ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom bangku    : ");
            kolom = sc.nextInt();
            sc.nextLine();

            if (baris >= 1 && baris <= bangku.length && kolom >= 1 && kolom <= bangku[0].length) {
                // Pengecekan apakah kursi sudah terisi
                if (bangku[baris-1][kolom-1] == null) {
                    bangku[baris-1][kolom-1] = nama;
                    System.out.println("Penumpang " + nama + " ditempatkan pada kursi " + baris + ", " + kolom);
                } else {
                    System.out.println("Maaf, kursi tersebut sudah terisi. Silakan pilih kursi lain.");
                }
            } else {
                System.out.println("Posisi baris atau kolom tidak valid.");
            }

            System.out.print("Input penumpang lainnya? (y/n) : ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }

        System.out.println("\nData Kursi Kereta:");
        for (int i = 0; i < bangku.length; i++) {
            System.out.println("====================================================");
            System.out.println("              Data Kursi Kereta ke-" + (i+1) + ":");
            for (int j = 0; j < bangku[0].length; j++) {
                System.out.print(" | " + ((bangku[i][j] != null) ? bangku[i][j] : "Kosong"));
            }
            System.out.println(" |");
        }
        System.out.println("====================================================");
    }
}
