import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Menampilkan judul program
        System.out.println("=======================================");
        System.out.println("   Java Version Control Practicee");
        System.out.println("=======================================");

        // Menampilkan pesan pembuka
        System.out.println("Halo! Program ini dibuat untuk latihan Git dan Java.");
        System.out.print("Masukkan nama kamu: ");

        // Mengambil input nama dari pengguna
        String nama = input.nextLine();

        // Menampilkan pesan personalisasi
        System.out.println("\nHalo, " + nama + "!");
        System.out.println("Selamat datang di latihan version control menggunakan Git.");
        System.out.println("Program ini menunjukkan bagaimana perubahan kode dapat dikontrol dan dikelola.");

        // Menjelaskan tahapan dasar version control
        System.out.println("\nLangkah-langkah umum dalam version control:");
        System.out.println("1. Menulis kode program di editor (seperti IntelliJ IDEA atau VS Code).");
        System.out.println("2. Menyimpan dan melakukan commit terhadap perubahan kode.");
        System.out.println("3. Mendorong (push) hasil commit ke repositori GitHub.");
        System.out.println("4. Mengelola perubahan kode melalui branch dan merge jika dibutuhkan.");

        // Menutup Scanner
        input.close();

        System.out.println("\nTerima kasih telah berlatih dengan JavaVersionControlPractice!");
        System.out.println("=======================================");
    }
}