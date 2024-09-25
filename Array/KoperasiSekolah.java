package Array;

import java.util.Scanner;

public class KoperasiSekolah {
    // Menyimpan data barang menggunakan array
    static String[] namaBarang = {"Buku", "Pensil", "Snack"};
    static int[] hargaBarang = {10000, 3000, 5000};
    static int[] stokBarang = {20, 50, 30};

    public static void tampilkanBarang() {
        System.out.println("Daftar Barang di Koperasi:");
        for (int i = 0; i < namaBarang.length; i++) {
            System.out.println((i + 1) + ". " + namaBarang[i] + " | Harga: Rp " + hargaBarang[i] + " | Stok: " + stokBarang[i]);
        }
    }

    public static void beliBarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor barang yang ingin dibeli: ");
        int pilihan = scanner.nextInt() - 1;
        System.out.print("Masukkan jumlah yang ingin dibeli: ");
        int jumlah = scanner.nextInt();

        // Cek apakah barang tersedia dan stok mencukupi
        if (pilihan >= 0 && pilihan < namaBarang.length) {
            if (stokBarang[pilihan] >= jumlah) {
                int totalHarga = hargaBarang[pilihan] * jumlah;
                stokBarang[pilihan] -= jumlah; // Kurangi stok
                System.out.println("Anda berhasil membeli " + jumlah + " " + namaBarang[pilihan] + ". Total: Rp " + totalHarga);
            } else {
                System.out.println("Stok tidak mencukupi.");
            }
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public static void tambahBarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nama barang baru: ");
        String namaBaru = scanner.nextLine();
        System.out.print("Masukkan harga barang: ");
        int hargaBaru = scanner.nextInt();
        System.out.print("Masukkan stok barang: ");
        int stokBaru = scanner.nextInt();

        // Tambahkan barang baru ke array (array tidak bisa diubah ukurannya, jadi kita harus buat array baru)
        String[] tempNama = new String[namaBarang.length + 1];
        int[] tempHarga = new int[hargaBarang.length + 1];
        int[] tempStok = new int[stokBarang.length + 1];

        for (int i = 0; i < namaBarang.length; i++) {
            tempNama[i] = namaBarang[i];
            tempHarga[i] = hargaBarang[i];
            tempStok[i] = stokBarang[i];
        }

        // Tambahkan barang baru di posisi terakhir
        tempNama[tempNama.length - 1] = namaBaru;
        tempHarga[tempHarga.length - 1] = hargaBaru;
        tempStok[tempStok.length - 1] = stokBaru;

        // Ganti array lama dengan array baru
        namaBarang = tempNama;
        hargaBarang = tempHarga;
        stokBarang = tempStok;

        System.out.println("Barang baru berhasil ditambahkan.");
    }

    public static void hapusBarang() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nomor barang yang ingin dihapus: ");
        int pilihan = scanner.nextInt() - 1;

        if (pilihan >= 0 && pilihan < namaBarang.length) {
            // Hapus barang dari array (membuat array baru tanpa barang yang dihapus)
            String[] tempNama = new String[namaBarang.length - 1];
            int[] tempHarga = new int[hargaBarang.length - 1];
            int[] tempStok = new int[stokBarang.length - 1];

            for (int i = 0, j = 0; i < namaBarang.length; i++) {
                if (i != pilihan) {
                    tempNama[j] = namaBarang[i];
                    tempHarga[j] = hargaBarang[i];
                    tempStok[j] = stokBarang[i];
                    j++;
                }
            }

            // Ganti array lama dengan array baru
            namaBarang = tempNama;
            hargaBarang = tempHarga;
            stokBarang = tempStok;

            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Barang tidak ditemukan.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Koperasi Sekolah ===");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli Barang");
            System.out.println("3. Tambah Barang (Penjual)");
            System.out.println("4. Hapus Barang (Penjual)");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanBarang();
                    break;
                case 2:
                    beliBarang();
                    break;
                case 3:
                    tambahBarang();
                    break;
                case 4:
                    hapusBarang();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
        } while (pilihan != 5);
    }
}