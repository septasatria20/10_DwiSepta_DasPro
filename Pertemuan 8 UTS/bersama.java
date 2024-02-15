import java.util.Scanner;
public class bersama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int pilihan;
        char ulang;
        
    do {
      System.out.println("##       Mata Kuliah       ##");
      System.out.println("============================");
      System.out.println("1. Daspro");
      System.out.println("2. Matdas");
      System.out.println("3. KTI");
      System.out.println();
       
      System.out.print("Pilihan anda: ");
      pilihan = input.nextInt();
    
      switch(pilihan){
        case 1:
          System.out.println("Bu Triana");
          break;
        case 2:
          System.out.println("Bu Anisa");
          break;
        case 3:
          System.out.println("Bu Retno");
          break;
        default:
        System.out.println("Menu tidak tersedia");
        }

        System.out.println();
    
      System.out.print("Ingin memilih menu lain (y/t)? ");
      ulang = input.next().charAt(0);
       
      System.out.println();
    } while (ulang == 'y');
    System.out.println("Terima Kasih");
        }
    }


    
    

    
