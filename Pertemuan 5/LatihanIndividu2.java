import java.util.Scanner;

public class LatihanIndividu2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int username = 123123;
        int password = 000000;
        System.out.println("Masukkan Username dan Password...");
        System.out.print("Username    : ");
        int user = input.nextInt();
        System.out.print("Password    : ");
        int pw = input.nextInt();
        if (user == username && pw == password){
            System.out.println("Anda berhasil masuk:)");
        }else{
            System.out.println("Username atau Password yang anda masukkan salah");
        }
    }
}