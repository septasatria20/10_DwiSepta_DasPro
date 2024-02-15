import java.util.Scanner;

public class DoWhileCuti10_1 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        int jatahCuti, jumlahHari;
        String konfirmasi;
        System.out.print("Jatah cuti : ");
        jatahCuti = sc10.nextInt();

        do {
            System.out.print("Apakah anda ingin mengambil cuti (y/t)? ");
            konfirmasi = sc10.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.println("Jumlah hari : ");
                jumlahHari = sc10.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti : " + jatahCuti);
                } else {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                }
            }
            else {
                break;
            } 
        } while (jatahCuti > 0); 
    }
}
