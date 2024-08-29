package latihan_if;

import java.util.Scanner;

public class BBM {
    public static void main(String[] args) {
        String jenis;
        Scanner beli = new Scanner(System.in);
        Boolean lanjut = true;

        while (lanjut) {
            double hargaPertamax = 14000;
            double hargaPertalite = 10000;
    
            System.out.println("SPBU PPLG");
            System.out.println("|1.Pertamax\t|");
            System.out.println("|2.Pertalite\t|");
            System.out.println("-----------------");
            System.out.print("Masukkan pilihan anda: ");
            int pilih = beli.nextInt();
            if (pilih == 1) {
                jenis = "Pertamax";
            } else {
                jenis = "Pertalite";
            }
    
            System.out.println("BBM yang ingin anda beli\t: "+jenis);
            System.out.print("Berapa liter\t\t\t: ");
            double jumlah = beli.nextDouble();
    
            double hargaTotal = 0;
            switch (pilih) {
                case 1:
                    hargaTotal = jumlah * hargaPertamax;
                    break;
                case 2:
                    hargaTotal = jumlah * hargaPertalite;
                    break;
                default:
                    System.out.println("Input tidak valid");
                    break;
            }
            double diskon = 0;
            double besarDiskon = 0;
            if (jumlah > 25) {
                diskon = 0.05;
                besarDiskon = hargaTotal * diskon;
                hargaTotal -= besarDiskon;
            }
            System.out.println("Rincian pembayaran");
            System.out.println("========================================");
            System.out.println("|1. Jenis BBM\t\t: "+jenis);
            System.out.println("|2. Jumlah BBM\t\t: "+jumlah+ " liter");
            System.out.println("|3. Jumlah diskon\t: Rp." +besarDiskon);
            System.out.println("|4. Total pembayaran\t: Rp."+hargaTotal);
            System.out.println("==========================================");
            System.out.println("Apakah anda ingin membeli lagi (y/n)? ");
            String jawab = beli.next();

            if (jawab.equalsIgnoreCase("n")) {
                lanjut = false;
                System.out.println("Terimakasih telah bertransaksi");
            }
        }
    }
}
