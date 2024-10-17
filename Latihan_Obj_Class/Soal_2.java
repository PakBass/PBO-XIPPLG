package Latihan_Obj_Class;

public class Soal_2 {
    public static void main(String[] args) {
        PersegiPanjang objHitung = new PersegiPanjang();

        objHitung.panjang = 23;
        objHitung.lebar = 5;

        System.out.println("Luas Persegi Panjang    : "+objHitung.hitungLuas()+ " cm");
        System.out.println("Keliling Persegi Panjang: "+objHitung.hitungKeliling()+ " cm");
    }
}
