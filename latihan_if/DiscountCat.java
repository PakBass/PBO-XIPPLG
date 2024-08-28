package latihan_if;

import java.util.Scanner;

public class DiscountCat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah cat yang dibeli (liter): ");
        int jumlahLiter = input.nextInt();
        System.out.print("Masukkan merk cat (A, B, dan C)\t: ");
        char merkCat = input.next().charAt(0);

        double hargaPerLiter = 0;
        switch (merkCat) {
            case 'A':
                hargaPerLiter = 50000;
                break;
            case 'B':
                hargaPerLiter = 45000;
                break;
            case 'C':
                hargaPerLiter = 40000;
                break;
            default:
                System.out.println("Tidak ada merk cat yang lain");
                break;
        }
        // if (merkCat == 'A') {
        //     hargaPerLiter = 50000;
        // } else if(merkCat == 'B') {
        //     hargaPerLiter = 45000;
        // } else if (merkCat == 'C') {
        //     hargaPerLiter = 40000;
        // } else {
        //     System.out.println("Merk cat tidak ditemukan");
        // }

        double hargaTotal = jumlahLiter * hargaPerLiter;
        double diskon = 0;

        if (jumlahLiter > 10) {
            diskon += 10;
        }
        if (merkCat == 'A' && jumlahLiter > 5) {
            diskon += 5;
        } else if (merkCat == 'B' && jumlahLiter > 8) {
            diskon += 3;
        }

        double hargaSetelahDiskon = hargaTotal - (hargaTotal * diskon/100);
        System.out.println("Total harga sebelum diskon: Rp. " +hargaTotal);
        System.out.println("Besar diskon\t\t: " + diskon + "%");
        System.out.println("Total harga setelah diskon: Rp. " +hargaSetelahDiskon);
    }
}
