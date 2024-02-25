import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan Nama: ");
        String nama = scanner.nextLine();

        System.out.println("Masukkan Jenis Kelamin (L/P): ");
        String jenisKelaminInput = scanner.nextLine();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "Laki-laki" : "Perempuan";

        System.out.println("Masukkan Tanggal Lahir (YYYY-MM-DD): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur
        LocalDate sekarang = LocalDate.now();
        int umur = Period.between(tanggalLahir, sekarang).getYears();

        System.out.println("=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}