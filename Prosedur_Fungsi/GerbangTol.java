package Prosedur_Fungsi;
import java.util.Scanner;

public class GerbangTol {
    static int saldo;

    public static void inisialisasiSaldo(int saldoAwal){
        saldo = saldoAwal;
    }

    // Fungsi untuk proses tap-in di gerbang tol
    public static void tapIn(String gerbangAwal, String gerbangAkhir, String arahPerjalanan){
        int tarif = hitungTarif(gerbangAwal, gerbangAkhir, arahPerjalanan);

        if (saldo >= tarif) {
            saldo -= tarif;
            System.out.println("Tap-In berhasil!!, Tarif perjalanan: Rp. "+tarif);
            System.out.println("Sisa saldo anda: Rp. "+saldo);
        } else {
            System.out.println("Saldo anda tidak cukup.");
            System.out.println("Tarif perjalanan dari gerbang tol "+gerbangAwal+ " menuju gerbang tol "+gerbangAkhir+" sebesar : Rp. "+tarif);
            System.out.println("Saldo anda saat ini: Rp. "+saldo);
            topUp();
            tapIn(gerbangAwal, gerbangAkhir, arahPerjalanan);  // Coba tap-in lagi setelah isi ulang
        }
    }

    // Fungsi untuk menghitung tarif berdasarkan gerbang awal, gerbang akhir, dan arah perjalanan
    public static int hitungTarif(String gerbangAwal, String gerbangAkhir, String arahPerjalanan){
        int tarif = 0;

        if (arahPerjalanan.equalsIgnoreCase("Balikpapan")) {
            if (gerbangAwal.equalsIgnoreCase("Manggar")) {
                if (gerbangAkhir.equalsIgnoreCase("Palaran")) {
                    tarif = 28000;
                } else if (gerbangAkhir.equalsIgnoreCase("Mahkota")) {
                    tarif = 35000;
                }
            } else if (gerbangAwal.equalsIgnoreCase("Kilo13")) {
                if (gerbangAkhir.equalsIgnoreCase("Palaran")) {
                    tarif = 20000;
                } else if (gerbangAkhir.equalsIgnoreCase("Mahkota")) {
                    tarif = 28000;
                }
            }
        } else if (arahPerjalanan.equalsIgnoreCase("Samarinda")) {
            if (gerbangAwal.equalsIgnoreCase("Palaran")) {
                if (gerbangAkhir.equalsIgnoreCase("Manggar")) {
                    tarif = 28000;
                } else if (gerbangAkhir.equalsIgnoreCase("Kilo13")) {
                    tarif = 20000;
                }
            } else if (gerbangAwal.equalsIgnoreCase("Mahkota")) {
                if (gerbangAkhir.equalsIgnoreCase("Manggar")) {
                    tarif = 35000;
                } else if (gerbangAkhir.equalsIgnoreCase("Kilo13")) {
                    tarif = 28000;
                }
            }
        }

        return tarif;
    }

    // Fungsi untuk top-up saldo
    public static void topUp(){
        Scanner isi = new Scanner(System.in);

        System.out.println("Silahkan Top-up saldo untuk kartu tol anda.");
        System.out.println("==================================================");
        System.out.print("Isi nominal saldo top-up: Rp. ");
        int isiUlang = isi.nextInt();
        saldo += isiUlang;
        System.out.println("==================================================");
        System.out.println("Saldo anda sekarang: Rp. "+saldo);
        isi.close();
    }

    // Fungsi utama program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan saldo awal anda: Rp. ");
        int saldoAwal = input.nextInt();
        inisialisasiSaldo(saldoAwal);

        System.out.print("Pilih kota asal ( Dari Balikpapan / Dari Samarinda): ");
        String arahPerjalanan = input.next();

        if (arahPerjalanan.equalsIgnoreCase("Balikpapan")) {
            System.out.print("Pilih gerbang tol awal (Manggar/Kilo 13): ");
        } else if (arahPerjalanan.equalsIgnoreCase("Samarinda")) {
            System.out.print("Pilih gerbang tol awal (Palaran/Mahkota): ");
        }
        String gerbangAwal = input.next();

        if (arahPerjalanan.equalsIgnoreCase("Balikpapan")) {
            System.out.print("Pilih gerbang tol akhir (Palaran/Mahkota): ");
        } else if (arahPerjalanan.equalsIgnoreCase("Samarinda")) {
            System.out.print("Pilih gerbang tol akhir (Manggar/Kilo13): ");
        }
        String gerbangAkhir = input.next();

        tapIn(gerbangAwal, gerbangAkhir, arahPerjalanan);
        System.out.println("=================================================");
        System.out.println("Program selesai");

        input.close();
    }
}
