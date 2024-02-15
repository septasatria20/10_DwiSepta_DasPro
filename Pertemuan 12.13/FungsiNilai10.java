import java.util.Scanner;

public class FungsiNilai10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] nilaiTugas = new int[5][7];

        inputData(nilaiTugas);
        tampilkanNilai(nilaiTugas);

        int hariTertinggi = cariHariTertinggi(nilaiTugas);
        System.out.println("Hari dengan nilai tertinggi adalah hari ke-" + (hariTertinggi + 1));

        tampilkanMahasiswaTertinggi(nilaiTugas, hariTertinggi);
    }

    public static void inputData(int[][] nilaiTugas) {
        Scanner input = new Scanner(System.in);

        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

        for (int i = 0; i < nilaiTugas.length; i++) {
            System.out.println("Input nilai tugas untuk mahasiswa " + mahasiswa[i] + ":");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.print("Minggu " + (j + 1) + ": ");
                nilaiTugas[i][j] = input.nextInt();
            }
        }
    }

    public static void tampilkanNilai(int[][] nilaiTugas) {
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

        for (int i = 0; i < mahasiswa.length; i++) {
            System.out.println("Nilai tugas " + mahasiswa[i] + ":");
            for (int j = 0; j < nilaiTugas[i].length; j++) {
                System.out.println("  Minggu " + (j + 1) + ": " + nilaiTugas[i][j]);
            }
            System.out.println();
        }
    }

    public static int cariHariTertinggi(int[][] nilaiTugas) {
        int hariTertinggi = 0;
        int nilaiTertinggi = nilaiTugas[0][0];

        for (int j = 1; j < nilaiTugas[0].length; j++) {
            for (int i = 0; i < nilaiTugas.length; i++) {
                if (nilaiTugas[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiTugas[i][j];
                    hariTertinggi = j;
                }
            }
        }

        return hariTertinggi;
    }

    public static void tampilkanMahasiswaTertinggi(int[][] nilaiTugas, int hariTertinggi) {
        String[] mahasiswa = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};

        int mahasiswaTertinggi = 0;
        int nilaiTertinggi = nilaiTugas[0][hariTertinggi];

        for (int i = 1; i < nilaiTugas.length; i++) {
            if (nilaiTugas[i][hariTertinggi] > nilaiTugas[mahasiswaTertinggi][hariTertinggi]) {
                mahasiswaTertinggi = i;
                nilaiTertinggi = nilaiTugas[i][hariTertinggi];
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi: " + mahasiswa[mahasiswaTertinggi]);
        System.out.println("Nilai tertinggi pada minggu ke-" + (hariTertinggi + 1) + ": " + nilaiTertinggi);
    }
}
