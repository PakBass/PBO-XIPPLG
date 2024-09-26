package Prosedur_Fungsi;
import java.util.Scanner;

public class Pembahasan_Soal {

    public static int hitungBiaya(String jenisKendaraan, int lamaParkir, boolean isMember){
        int biaya = 0;
        if (jenisKendaraan.equalsIgnoreCase("mobil")) {
            biaya = 5000;
            lamaParkir--;
            biaya += lamaParkir * 3000;
        } else if (jenisKendaraan.equalsIgnoreCase("motor")) {
            biaya = 3000;
            lamaParkir--;
            biaya += lamaParkir * 2000;
        }
        if (isMember) {
            biaya = (int) (biaya * 0.9);
        }
        return biaya;
    }

    public static void tampilanUtama(String jenisKendaraan, int lamaParkir,int biaya, boolean isMember){
        System.out.println();
        System.out.println("Rincian Parkir");
        System.out.println("=================================");
        System.out.println("Jenis Kendaraan       : "+jenisKendaraan);
        System.out.println("Lama Parkir           : "+lamaParkir+ " jam");
        System.out.println("Status member/tidak   : "+isMember);
        System.out.println("=================================");
        System.out.println("Total Biaya           : Rp."+biaya);
        System.out.println("=================================");
        if (isMember) {
            System.out.println("Anda mendapat diskon 10%");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jenis kendaraan : ");
        String jenisKendaraan = input.nextLine();

        System.out.print("Lama parkir              : ");
        int lamaParkir = input.nextInt();

        System.out.print("Apakah member (ya/tidak) ? ");
        String userMember = input.next();
        boolean isMember = userMember.equalsIgnoreCase("ya");

        int biayaParkir = hitungBiaya(jenisKendaraan, lamaParkir, isMember);
        tampilanUtama(jenisKendaraan, lamaParkir, biayaParkir, isMember);

        input.close();
    }
}
