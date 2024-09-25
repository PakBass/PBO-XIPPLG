package Prosedur_Fungsi;
import java.util.Scanner;

public class Review {
    public static int LuasPersegi(int s){
        int L = s * s;
        return L;
    }
 
    public static int KelilingPersegi(int s){
        int K = 4 * s;
        return K;
    }

    //Prosedur
    public static void TampilkanLuas(int s){
        System.out.println("L = "+s+" x "+s);
        System.out.println("L = "+LuasPersegi(s));
    }

    public static void TampilkanKeliling(int s){
        System.out.println("K = 4 x "+s);
        System.out.println("K = "+KelilingPersegi(s));
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("1. Menghitung Luas Persegi");
        System.out.println("2. Menghitung Keliling Persegi");
        System.out.println("==============================");
        System.out.print("Masukkan pilihan anda = ");
        int pilih = input.nextInt();
        switch (pilih) {
            case 1:
                System.out.print("Inputkan sisi persegi = ");
                int s = input.nextInt();
                TampilkanLuas(s);
                break;
            case 2:
                System.out.print("Inputkan sisi persegi = ");
                int sk  = input.nextInt();
                TampilkanKeliling(sk);
                break;
            default:
                System.out.println("Tidak ada pilihan");
                break;
        }
       input.close();
    }
}
