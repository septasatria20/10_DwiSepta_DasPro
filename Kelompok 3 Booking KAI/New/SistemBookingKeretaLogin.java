import java.util.Scanner;

public class SistemBookingKeretaLogin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String pilih;
        boolean isRun = true;
        String[] username = {"Margareta", "Septa", "Ney"};
        String[] password = {"garet123", "septa345", "ney567"};
        String[] newUsername = new String[100];
        String[] newPassword = new String[100];

        System.out.println("====================================");
        System.out.println("   Selamat Datang di KAI POLINEMA   ");
        System.out.println("====================================");
        System.out.println("Apakah anda memiliki akun? (y/t)");
        pilih = input.nextLine();

        boolean isNewUser = false;

        while (isRun) {
            if (pilih.equalsIgnoreCase("y")) {
                // Login
                System.out.print("Username: ");
                String user = input.nextLine();
                System.out.print("Password: ");
                String pw = input.nextLine();

                boolean isValid = false;

                for (int i = 0; i < username.length; i++) {
                    if (user.equalsIgnoreCase(username[i]) && pw.equals(password[i])) {
                        isValid = true;
                        System.out.println("        ***Anda berhasil masuk***");
                        isRun = false;
                        break;
                    }
                }

                if (!isValid) {
                    System.out.println("Username atau Password yang anda masukkan salah");
                }
            } else if (pilih.equalsIgnoreCase("t")) {
                // Pendaftaran 
                for (int j = 0; j < newUsername.length; j++) {
                    if (newUsername[j] == null) {
                        System.out.println("============================");
                        System.out.println("     Formulir Akun Baru     ");
                        System.out.println("============================");
                        System.out.println("Silahan daftarkan akun anda");
                        System.out.print("Masukkan Username: ");
                        String newUser = input.nextLine();
                        boolean usernameExists = false;

                        for (int i = 0; i < username.length; i++) {
                            if (newUser.equalsIgnoreCase(username[i])) {
                                usernameExists = true;
                                System.out.println("Username telah digunakan. Silakan coba lagi.");
                                break;
                            }
                        }

                        if (!usernameExists) {
                            System.out.print("Masukkan Password: ");
                            String newPw = input.nextLine();
                            newUsername[j] = newUser;
                            newPassword[j] = newPw;
                            System.out.println("Akun berhasil dibuat. Silakan login.");
                            isNewUser = true;  // Tandai bahwa pengguna baru berhasil mendaftar
                            break;
                        }
                    }
                }
                isRun = false;
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                pilih = input.nextLine();
            }
        }

        // Setelah loop while
        if (isNewUser) {
            System.out.println("        ***Anda berhasil masuk***");
        }
    }
}
