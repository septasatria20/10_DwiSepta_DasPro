public class Programku10 {
    public static void TampilHinggakei (int i) {
        for (int j = 1; j <= i; j++) { System.out.print(j);
        }
    }

    public static int Jumlah (int bill, int bil2) { 
        return (bill + bil2);
    }

    public static void TampilJumlah (int bill, int bil2) { 
        TampilHinggakei(Jumlah(bill, bil2));
    }

    public static void main (String[] args) {
        int temp = Jumlah (1, 1);
        TampilJumlah (temp, 5);
    }
}
