package Prosedur_Fungsi;

import java.util.Scanner;
public class Jalan_tol {
     static int saldo;

    public static void inisialisasiSaldo(int saldoAwal){
        saldo = saldoAwal;
    }

    public static void tapIn(){
        if (saldo >= 10000) {
            System.out.println("Tap-In berhasil!!, Sisa saldo: Rp. "+ (saldo - 10000));
            saldo -= 10000;
        } else {
            System.out.println("Saldo tidak cukup, silahkan isi ulang");
            topUp();
        }
    }

    public static void topUp(){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah top-up saldo anda: Rp. ");
        int isiUlang = input.nextInt();

        saldo += isiUlang;
        System.out.println("Saldo anda telah bertambah menjadi: Rp. "+saldo);
        tapIn();
    }

    public static void main(String[] args) {
        Scanner isi = new Scanner(System.in);
        System.out.print("Masukkan saldo awal anda: Rp. ");
        int saldoAwal = isi.nextInt();
        inisialisasiSaldo(saldoAwal);

        for(int i = 1; i <= 4; i++){
            System.out.println("Tap-In Gerbang tol ke - "+i);
            tapIn();
        }
        System.out.println("Perjalanan telah sampai di gerbang tol terakhir, sisa saldo anda: Rp. "+saldo);
    }
}
