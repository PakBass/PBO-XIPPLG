package latihan_if;

import java.util.Scanner;

public class tes_lat {
    public static void main(String[] args) {
        String[] suplai = {"Pensil", "Penghapus", "Buku Tulis", "Spidol"};
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilihlah Angka 1-4 :");
        int pilihan = input.nextInt();


        if (pilihan >= 1 && pilihan <= suplai.length) {
            System.out.println("Kamu memlihih " + suplai[pilihan -1]);

        } else {
            System.out.println("Pilihan tidak tepat, silahkan pilih angka 1-4");
        }
        input.close();
    }
}
