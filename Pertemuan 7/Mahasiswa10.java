import java.util.Scanner;

public class Mahasiswa10 {
    public static void main(String[] args) {
        Scanner sc10 = new Scanner(System.in);
        String nama, jenisKelamin, namaPerempuan = "";
        int i = 1, totalPerempuan = 0;
        
        for (int counter = 0; counter < 2; counter++ ) {
            System.out.print("Masukkan Nama Mahasiswa Ke- " + (counter + i) + ": " );
            nama = sc10.nextLine();
            System.out.print("Masukkan jenis kelamin (L/P) ke- " + (counter + i) + ": ");
            jenisKelamin = sc10.nextLine();

            if (jenisKelamin.equalsIgnoreCase("p")) {
            namaPerempuan += nama;
            totalPerempuan++;
            }
        }  

        System.out.printf("Nama Mahasiswa Perempuan    : %s \t \n", namaPerempuan);
        System.out.println("Total Mahasiswa Perempuan   : " + totalPerempuan);
    }
}