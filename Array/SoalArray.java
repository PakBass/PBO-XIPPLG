package Array;

// public class Koperasi {
    
// }
import java.util.Scanner;;

public class SoalArray {
    static String[] namaBarang = {"Buku", "Pensil", "Snack"};
    static int[] hargaBarang = {10000, 3000, 5000};
    static int[] stokBarang = {20, 15, 30};

    public static void tampilkanBarang() {
        System.out.println("Daftar barang dikoperasi: ");
        for(int i = 0; i < namaBarang.length; i++) {
            System.out.println((i+1) +" . "+ namaBarang[i] + "\tHarga\t: Rp. " + hargaBarang[i] + "\tStok: " + stokBarang[i]);
        }
    }
    public static void beliBarang() {
        Scanner beli = new Scanner(System.in);

        System.out.print("Masukkan Nomor barang yang ingin dibeli: ");
        int pilih = beli.nextInt() - 1;
        System.out.print("Masukkan jumlah barang yang ingin dibeli: ");
        int jumlah = beli.nextInt();


        if (pilih >= 0 && pilih < namaBarang.length) {
            if (stokBarang[pilih] >= jumlah) {
                int totalHarga = hargaBarang[pilih] * jumlah;
                stokBarang[pilih] -= jumlah;
                System.out.println("Pembelian berhasil, anda membeli " + jumlah + " = " + namaBarang[pilih] + " Total: Rp. " +totalHarga);
            } else {
                System.out.println("Stok barang habis");
            }
        } else {
            System.out.println("Barang tidak tersedia");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih;

        do {
            System.err.println("\nKoperasi Sekolah");
            System.err.println("=============================");
            System.err.println("1. Tampilkan Barang");
            System.err.println("2. Beli Barang");
            System.err.println("3. Keluar");
            System.err.println("=============================");
            System.err.print("Pilih menu\t: ");
            pilih = input.nextInt();

            switch (pilih) {
                case 1:
                    tampilkanBarang();
                    break;
                case 2:
                    beliBarang();
                    break;
                case 3:
                    System.out.println("Keluar dari program");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }

        } while (pilih != 3);
    }
}
