package Prosedur_Fungsi;
import java.util.Scanner;

public class Soal_1 {
    static int jumTiket;
    static String namaTim;
    static String tanggalTanding;

    public static void beliTiket(){
        Scanner input = new Scanner(System.in);
        String beliLagi;

        do {
            System.out.print("Masukkan jumlah tiket yang ingin dibeli: ");
            int jumlahTiketDibeli = input.nextInt();

            if (jumlahTiketDibeli <= jumTiket) {
                jumTiket -= jumlahTiketDibeli;
                System.out.println("Pembelian berhasil! Sisa tiket: " + jumTiket);
            } else {
                System.out.println("Maaf, tiket yang Anda minta tidak tersedia.");
            }

            System.out.print("Apakah Anda ingin membeli lagi? (y/n): ");
            beliLagi = input.next();
        } while (beliLagi.equalsIgnoreCase("y"));

        System.out.println("Kembali ke menu utama...");
    }

    public static void infoPertandingan(){
        System.out.println("Informasi Pertandingan:");
        System.out.println("Nama Tim: " + namaTim);
        System.out.println("Tanggal Pertandingan: " + tanggalTanding);
        System.out.println("Sisa Tiket: " + jumTiket);
    }

    public static void setDataPertandingan() {
        Scanner data = new Scanner(System.in);
        System.out.print("Masukkan nama tim: ");
        namaTim = data.nextLine();
        System.out.print("Masukkan tanggal pertandingan (DD-MM-YYYY): ");
        tanggalTanding = data.nextLine();
        System.out.print("Masukkan jumlah tiket tersedia: ");
        jumTiket = data.nextInt();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        setDataPertandingan();

        do {
            System.out.println("Selamat datang di sistem penjualan tiket bola!");
            System.out.println("1. Beli Tiket");
            System.out.println("2. Lihat Informasi Pertandingan");
            System.out.println("3. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    beliTiket();
                    break;
                case 2:
                    infoPertandingan();
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 3);
    }
}