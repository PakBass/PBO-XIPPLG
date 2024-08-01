import java.util.Scanner;

class Data {
    private String nama;

    // Konstruktor untuk inisialisasi nama
    public Data(String nama){
        this.nama = nama;
    }

    // Getter untuk mendapatkan nama
    public String getNama(){
        return nama;
    }

    // Setter untuk mengubah nama
    public void setNama(String nama){
        this.nama = nama;
    }

    // Tampilan output program
    public void show(){
        System.out.println("Selamat pagi "+nama);
    }
}
// Program Utama
public class input_data_pbo {
    @SuppressWarnings("resource")
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
