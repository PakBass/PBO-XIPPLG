import java.util.Scanner;

public class input_data {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner masukkan = new Scanner(System.in);

        System.out.println("Masukkan nama anda : ");
        String nama = masukkan.nextLine();
        System.out.println("Selamat pagi " +nama);
    }
}
