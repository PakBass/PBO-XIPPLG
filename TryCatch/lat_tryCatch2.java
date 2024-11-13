package TryCatch;

import java.util.Scanner;

public class lat_tryCatch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Input harga barang
            System.out.print("Masukkan harga barang: ");
            double hargaBarang = Double.parseDouble(scanner.nextLine());
            
            // Input persentase diskon
            System.out.print("Masukkan persentase diskon (misalnya 10 untuk 10%): ");
            double diskonPersen = Double.parseDouble(scanner.nextLine());
            
            // Menghitung diskon
            double diskon = (diskonPersen / 100) * hargaBarang;
            double hargaSetelahDiskon = hargaBarang - diskon;
            
            // Menampilkan hasil
            System.out.println("Harga barang: Rp " + hargaBarang);
            System.out.println("Diskon: Rp " + diskon);
            System.out.println("Harga setelah diskon: Rp " + hargaSetelahDiskon);
            
        } catch (NumberFormatException e) {
            // Menangani jika input bukan angka
            e.printStackTrace();
            System.out.println("Input tidak valid! Pastikan harga barang dan persentase diskon adalah angka.");
        } catch (Exception e) {
            // Menangani exception lainnya
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        } finally {
            // Menutup scanner
            scanner.close();
        }
    }
}
