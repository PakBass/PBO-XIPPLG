package Prosedur_Fungsi;
import java.util.Scanner;;

public class Diskon {
    public static double hDiskon(double harga, double diskon){
        double hargaJadi = harga - Potongan(harga, diskon);;
        return hargaJadi;
    }

    public static double Potongan(double harga, double diskon){
        double potonganHarga = harga * (diskon/100);
        return potonganHarga;
    }

    public static void TampilkanDiskon(double harga, double diskon){
        System.out.println("Harga Barang : Rp."+harga);
        System.out.println("Diskon       : "+diskon+" %");
        System.out.println("Potongan     : Rp."+Potongan(harga, diskon));
        System.out.println("==============================");
        System.out.println("Total bayar : Rp."+hDiskon(harga, diskon));
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double harga, diskon;

        System.out.print("Inputkan Harga : Rp.");
        harga = input.nextDouble();

        if ((harga >= 100000) && (harga < 150000)) {
            diskon = 10;
        } else if (harga >= 150000) {
            diskon = 15;
        } else {
            diskon = 0;
        }
        
        TampilkanDiskon(harga, diskon);
    }
}
