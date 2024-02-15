public class Tugas410 {
    static int hitungPasanganMarmut(int bulan) {
        if (bulan <= 2) {
            return 1;
        } else {
            return hitungPasanganMarmut(bulan - 2) + hitungPasanganMarmut(bulan - 2);
        }
    }

    public static void main(String[] args) {
        int bulan = 12;

        int jumlahPasangan = hitungPasanganMarmut(bulan);

        System.out.println("Jumlah pasangan marmut setelah " + bulan + " bulan: " + jumlahPasangan);
    }
}
