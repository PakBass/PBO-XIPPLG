package Prosedur_Fungsi;
import java.util.Scanner;

public class KeretaApi {
    static int saldo;

    public static void inisialisasiSaldo(int saldoAwal){
        saldo = saldoAwal;
    }

    public static void tapIn(){
        if (saldo >= 10000) {
            System.out.println("Tap-In berhasil. Selamat menikmati perjalanan");
            saldo -= 3000; // tarif sekali jalan/tap-in
            System.out.println("Sisa saldo anda saat ini: Rp. "+saldo);
        } else {
            System.out.println("Saldo anda tidak cukup.");
            System.out.println("Saldo anda saat ini: Rp. "+saldo);
            System.out.println("Silahkan isi ulang kartu anda.");
            isiUlang();
        }
    }

    public static void isiUlang(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah top-up saldo anda: Rp. ");
        int topUp = input.nextInt();

        saldo += topUp;
        System.out.println("Saldo anda telah bertambah menjadi: Rp. "+saldo);
        tapIn();
    }
    
    public static void main(String[] args) {
        inisialisasiSaldo(20000);
        tapIn();
    }
}
