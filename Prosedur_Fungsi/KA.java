package Prosedur_Fungsi;
import java.util.Scanner;

public class KA {

    static int saldo;

    // Fungsi untuk inisialisasi saldo awal
    public static void inisialisasiSaldo(int saldoAwal) {
        saldo = saldoAwal;
    }

    // Fungsi untuk melakukan tap in
    public static void tapIn() {
        if (saldo >= 10000) {
            System.out.println("Tap in berhasil. Selamat menikmati perjalanan!");
            saldo -= 3000;
            System.out.println("Sisa saldo anda saat ini: Rp." +saldo);
        } else {
            System.out.println("Saldo tidak cukup.");
            System.out.println("Saldo anda saat ini : Rp. "+saldo);
            System.out.println("Silahkan isi ulang kartu Anda.");
            isiUlang();
        }
    }

    // Fungsi untuk mengisi ulang saldo
    public static void isiUlang() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah yang ingin diisi ulang: Rp. ");
        int jumlahIsiUlang = input.nextInt();
        saldo += jumlahIsiUlang;
        System.out.println("Saldo Anda telah bertambah menjadi Rp" + saldo);
    }

    public static void main(String[] args) {
        inisialisasiSaldo(5000); // Saldo awal Rp5.000
        tapIn();
        tapIn();
    }
}
