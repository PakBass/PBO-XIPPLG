package BioskopOOP;

public class Tiket {
    private int jumlah;
    private Film film;

    //konstruktor
    public Tiket(Film film, int jumlah) {
        this.film = film;
        this.jumlah = jumlah;
    }

    public double hitungTotalHarga() {
        double total = film.getHarga() * jumlah;
        return total;
    }
}
