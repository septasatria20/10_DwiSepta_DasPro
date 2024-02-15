import java.util.Scanner;

public class Kubus10 {
    public static int hitungLuasPermukaan(int sisi) {
        int luas = 6 * sisi * sisi;
        return luas;
    }

    public static int hitungVolume(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sisi;

        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = input.nextInt();

        int luasPermukaan = hitungLuasPermukaan(sisi);
        System.out.println("Luas permukaan kubus adalah " + luasPermukaan);

        int volume = hitungVolume(sisi);
        System.out.println("Volume kubus adalah " + volume);
    }
}
