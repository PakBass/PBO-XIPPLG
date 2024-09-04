package FOR;
import java.util.Scanner;;

public class bioskop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean lagi = true;

        while (lagi) {
            System.out.println("Daftar Film");        
            System.out.println("1. Film A - Rp. 50.000");        
            System.out.println("2. Film B - Rp. 45.000");        
            System.out.println("3. Film C - Rp. 40.000");   
            System.out.println("=========================");
            System.out.print("Pilih Film A/B/C\t: ");
            int pilihFilim = input.nextInt();
    
            System.out.print("Jumlah Tiket\t: ");
            int jumlahTiket = input.nextInt();
    
            double hargaTiket = 0;
            switch (pilihFilim) {
                case 1:
                    hargaTiket = 50000;
                    break;
                case 2:
                    hargaTiket = 45000;
                    break;
                case 3:
                    hargaTiket = 40000;
                    break;
                default:
                    System.out.println("Pilihan film tidak ada");
                    break;
            }
            double totalHarga = jumlahTiket * hargaTiket;
            double diskon = 0;
            if (jumlahTiket > 3) {
                diskon = 0.1;
                totalHarga = totalHarga - diskon;
            }
    
            System.out.println("Total Harga\t: Rp. "+ totalHarga);
    
            System.out.print("Masukkan uang pembayaran: Rp. ");
            double uangBayar = input.nextDouble();
    
            double kembalian = uangBayar - totalHarga;
            if (kembalian >=0) {
                System.out.println("Uang kembalian\t: Rp. "+ kembalian);
            } else {
                System.out.println("Uang anda kurang");
            }
    
            System.out.println("Apakah anda ingin membeli tiket lagi (y/n) ?");
            String jawab = input.next();
            lagi = jawab.equalsIgnoreCase("y");
        }
        System.out.println("Terima kasih telah membeli tiket");
    }
}
