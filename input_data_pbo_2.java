import java.util.Scanner;
public class input_data_pbo_2 {
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        // input data
        System.out.print("Masukkan nama anda : ");
        String nama = masukkan.nextLine();

        // Membuat objek User
        Data user = new Data(nama);

        // Menampilkan Output program
        user.show();
    }
}
