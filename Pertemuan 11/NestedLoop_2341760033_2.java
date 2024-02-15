import java.util.Scanner;

public class NestedLoop_2341760033_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] temps = new int[2][7];
        double[] rataRata = new double[5];

        for (int i = 0; i < temps.length; i++) { 
            System.out.println("Kota ke-" + i);
            double sum = 0; 
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print("Hari ke-" + (j + 1) + ": "); 
                temps[i][j] = sc.nextInt(); 
                sum += temps[i][j];
            } 
            rataRata[i] = sum / temps[i].length;
            System.out.println(); 
           } 
        for (int i = 0; i < temps.length; i++) { 
            System.out.print("Kota ke-" + (i + 1) + ": "); 
            for (int j = 0; j < temps[0].length; j++) { 
                System.out.print(temps[i][j] + " "); 
            } 
            System.out.println("Rata-rata= " + rataRata[i]);
           }    
    }
}
