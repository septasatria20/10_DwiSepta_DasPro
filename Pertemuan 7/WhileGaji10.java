import java.util.Scanner;

public class WhileGaji10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int jumlahKaryawan, jumlahJamLembur;
        String jabatan;
        double gajiLembur = 0, totalGajiLembur = 0;
        System.out.println("Masukkan jumlah karyawan : ");
        jumlahKaryawan= sc10.nextInt();
        int i = 0;

        while (i < jumlahKaryawan) {
            System.out.println("Pilihan jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan jabatan karyawan ke-" + (i+1) + " : ");
            jabatan = sc10.next();
            System.out.print("Masukkan jumlah jam lembur : ");
            jumlahJamLembur = sc10.nextInt();
            i++;

            if (jabatan.equalsIgnoreCase("direktur")) {
                continue;
            } else if (jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }
            else if (jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total gaji lembur : " +totalGajiLembur);
        }
    }
}
