import java.util.Scanner;

public class SistemBookingKeretaMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("=========================================");
            System.out.println("   Selamat datang di Menu KAI POLINEMA   ");
            System.out.println("=========================================");
            System.out.println("Pilih Menu dibawah ini (ketik angka)");
            System.out.println("1. Layanan Informasi Kereta");
            System.out.println("2. Menu Pemesanan Kereta");
            System.out.println("3. Bantuan (Call Center) KAI Polinema");
            System.out.println("0. Keluar");
            
            int menu = input.nextInt();

            switch (menu) {
                case 1:
                    informasiKereta();
                    break;

                case 2:
                    pesanKereta();
                    break;

                case 3:
                    bantuanCallCenter();
                    break;

                case 0:
                    isRunning = false;
                    System.out.println("Terima kasih telah menggunakan layanan KAI POLINEMA");
                    break;

                default:
                    System.out.println("Maaf, input yang Anda masukkan salah ");
            }
        }
    }

    // Fungsi untuk informasi kereta
    public static void informasiKereta() {
        Scanner input = new Scanner(System.in);
        String[] menuOptions = {
            "Tentang KAI POLINEMA",
            "Kereta Ekonomi",
            "Kereta Bisnis",
            "Kereta Eksekutif"
        };

        System.out.println("===================================================");
        System.out.println("  Anda telah masuk di Layanan Kereta KAI POLINEMA  ");
        System.out.println("===================================================");
        System.out.println("Informasi apa yang anda butuhkan? (ketik angka)");

        for (int i = 0; i < menuOptions.length; i++) {
            System.out.println((i + 1) + ". " + menuOptions[i]);
        }

        int infoChoice = input.nextInt();
        if (infoChoice >= 1 && infoChoice <= menuOptions.length) {
            System.out.println("Anda memilih: " + menuOptions[infoChoice - 1]);
            if (infoChoice == 1 && infoChoice <= menuOptions.length) {
                System.out.println("PT Kereta Api Indonesia (Persero) atau biasa disingkat menjadi KAI, ");
                System.out.println("adalah sebuah badan usaha milik negara Indonesia yang bergerak di bidang perkeretaapian");
            } else if (infoChoice == 2 && infoChoice <= menuOptions.length) {
                System.out.println("Kelas ekonomi adalah kelas paling terjangkau.");
                System.out.println("Penumpang di kelas ini memiliki kursi yang sederhana dan fasilitas dasar.");
            } else if (infoChoice == 3 && infoChoice <= menuOptions.length) {
                System.out.println("Kelas bisnis menawarkan kenyamanan lebih daripada ekonomi.");
                System.out.println("Penumpang biasanya diberikan kursi yang lebih besar dan lebih nyaman.");
            } else if (infoChoice == 4 && infoChoice <= menuOptions.length) {
                System.out.println("Kelas eksekutif adalah yang paling mewah.");
                System.out.println("Penumpang di kelas ini biasanya menikmati kursi yang sangat nyaman, ");
                System.out.println("ruang pribadi, layanan makanan yang lebih baik, dan fasilitas tambahan lainnya.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }

    // Fungsi untuk pemesanan kereta
    public static void pesanKereta() {
        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("   Anda telah masuk ke Layanan Pemesanan Kereta   ");
        System.out.println("==================================================");
        System.out.println("Selamat datang di Layanan Pemesanan Kereta");
        System.out.println("Silahkan input data anda");

        int jml_booking;
        double total = 0;
        String[] namaPenumpang = new String[100];
        long[] nomorNik = new long[100];
        long[] nomorTelp = new long[100];

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
        System.out.println(" ");
        System.out.println("========================================================");
        System.out.println("      Pilihan Kelas Kereta untuk Berbagai Jurusan:      ");
        System.out.println("========================================================");
            for (int j = 0; j < kelasKereta.length; j++) {
                System.out.println((j + 1) + ". " + "(" +kelasKereta[j][3] + ") " + kelasKereta[j][2] + " " + kelasKereta[j][0] + " - Harga: " + kelasKereta[j][1]);
            }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor kelas kereta yang dipilih: ");
        int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= kelasKereta.length) {
                String kelasDipilih = kelasKereta[pilihan - 1][0];
                String hargaDipilih = kelasKereta[pilihan - 1][1];
                String keretaDipilih = kelasKereta[pilihan - 1][2];
                String tujuanDipilih = kelasKereta[pilihan - 1][3];
                
                System.out.println(" ");
                System.out.println("Anda memilih kelas      : " + kelasDipilih);
                System.out.println("Tujuan anda             : " + tujuanDipilih);
                System.out.println("Kereta yang Anda pilih  : " + keretaDipilih);
                System.out.println("Harga                   : " + hargaDipilih);

                

            } else {
                System.out.println("Nomor kelas tidak valid. Silakan pilih nomor kelas yang benar.");
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
        int anak;
        System.out.print("Anak dibawah 4 tahun (tidak ada jawab 0) : ");
        anak = input.nextInt();
        System.out.println("Anda akan memasuki Menu Pemilihan Bangku...");
        System.out.println(" ");
            
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

        System.out.println("\nData Kursi Kereta yang tersedia : ");
        for (int i = 0; i < bangku.length; i++) {
            System.out.println("====================================================");
            System.out.println("              Data Kursi Kereta ke-" + (i+1) + ":");
            for (int j = 0; j < bangku[0].length; j++) {
                System.out.print(" | " + ((bangku[i][j] != null) ? bangku[i][j] : "Kosong"));
            }
            System.out.println(" |");
        }
        System.out.println("====================================================");   
        System.out.println(" ");

        while (true) {
            System.out.print("Masukkan nama penumpang  : ");
            nama = input.next();
            System.out.print("Masukkan baris bangku    : ");
            baris = input.nextInt();
            System.out.print("Masukkan kolom bangku    : ");
            kolom = input.nextInt();
            input.nextLine();

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
            next = input.nextLine();

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
        System.out.println(" ");
        System.out.print("Pastikan data anda sudah benar (y/t) : ");
        String pilih = input.next();
        System.out.println(" ");
        
            if (pilih.equalsIgnoreCase("y")) {
                System.out.println("Selamat tiket berhasil dipesan");
                System.out.println("Anda akan diarahkan kembali ke Menu...");
                System.out.println(" ");
            } else if (pilih.equalsIgnoreCase("t")) {
                System.out.println("Anda akan diarahkan kembali ke Menu...");
                System.out.println(" ");
            }
    }
        // Fungsi untuk bantuan call center
        public static void bantuanCallCenter() {
            System.out.println("=============================================");
            System.out.println("   Anda telah masuk di Layanan Call Center   ");
            System.out.println("=============================================");
            System.out.println("Kontak Call Center Kami : ");
            System.out.println("Telepon (Fast Respon) : 085233698778");
            System.out.println("WhatsApp : 085233698778");
            System.out.println("Email : septasatria20@gmail.com");
    }
}
