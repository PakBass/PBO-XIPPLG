package Prosedur_Fungsi;
import java.util.Scanner;

public class Soal_fungsiProcedure {
    public static int hitungBiaya(String jenisKendaraan, int lamaParkir, boolean isMember) {
        int biaya = 0;
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            biaya += 5000;
            lamaParkir--;
            biaya += lamaParkir * 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            biaya += 3000;
            lamaParkir--;
            biaya += lamaParkir * 2000;
        }

        if (isMember) {
            biaya = (int) (biaya * 0.9); // Diskon 10%
        }
        return biaya;
    }

    public static void tampilkanHasil(String jenisKendaraan, int lamaParkir, int biayaParkir, boolean isMember) {
        System.out.println("Rincian Parkir:");
        System.out.println("========================================");
        System.out.println("Jenis Kendaraan  : " + jenisKendaraan);
        System.out.println("Lama Parkir      : " + lamaParkir + " jam");
        System.out.println("Total Biaya      : Rp " + biayaParkir);
        if (isMember) {
            System.out.println("(Anda mendapatkan diskon 10% sebagai member)");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Jenis kendaraan (mobil/motor): ");
        String jenisKendaraan = input.nextLine();

        System.out.print("Lama parkir (jam): ");
        int lamaParkir = input.nextInt();

        System.out.print("Apakah member? (ya/tidak): ");
        String userMember = input.next();
        boolean isMember = userMember.equalsIgnoreCase("ya");

        int biayaParkir = hitungBiaya(jenisKendaraan, lamaParkir, isMember);
        tampilkanHasil(jenisKendaraan, lamaParkir, biayaParkir, isMember);
    }
}
