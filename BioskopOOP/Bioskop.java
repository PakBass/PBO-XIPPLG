package BioskopOOP;
import java.util.*;

public class Bioskop {
    private List<Film> daftarFilm = new ArrayList<>();

    public void tambahFilm(Film film) {
        daftarFilm.add(film);
    }

    public void tampilkanDaftarFilm() {
        System.out.println("Daftar Film");
        for(Film film : daftarFilm){
            System.out.println(film.getId() + ". " + film.getJudul() + " - " +film.getHarga());
        }
    }
    public void prosesPembelian() {
        Scanner input = new Scanner(System.in);
        boolean lagi = true;
        while(lagi) {
            tampilkanDaftarFilm();
    
            System.out.print("Pilih ID Film 1/2/3\t: ");
            int idFilm = input.nextInt();
    
            System.out.print("Masukkan jumlah tiket: ");
            int jumlahTiket = input.nextInt();
    
            Film pilih = null;
    
            for(Film film : daftarFilm) {
                if(film.getId() == idFilm) {
                    pilih = film;
                    break;
                }
            }
            if(pilih == null){
                System.out.println("film tidak ditemukan.");
            }
    
            //Membuat Objek Tiket
            Tiket tiket = new Tiket(pilih, jumlahTiket);
    
            //Hitung Total HArga
            double totalHarga = tiket.hitungTotalHarga();
            System.out.println("Total harga\t: Rp. "+ totalHarga);
    
            //Pembayaran
            System.out.print("Masukkan uang pembayaran: Rp. ");
            double uangBayar = input.nextDouble();
    
            //Kembalian
            Pembayaran pembayaran = new Pembayaran(totalHarga, uangBayar);
            double kembalian = pembayaran.hitungKembalian();
    
            if(kembalian < 0){
                System.out.println("Uang anda tidak cukup");
            } else {
                System.out.println("Pembayaran Berhasil. Kembalian: Rp. "+ kembalian);
            }
            System.out.print("Apakah anda ingin membeli tiket lagi (y/n) ? ");
            String jawab = input.next();
            lagi = jawab.equalsIgnoreCase("y");
        }
        input.close();
    }
    public static void main(String[] args) {
        Bioskop bioskop = new Bioskop();
            bioskop.tambahFilm(new Film(1, "Film A", 50000));
            bioskop.tambahFilm(new Film(2, "Film B", 45000));
            bioskop.tambahFilm(new Film(3, "Film C", 40000));
    
            //Proses pembelian tiket
            bioskop.prosesPembelian();
    }
}
