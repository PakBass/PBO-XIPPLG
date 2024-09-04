package BioskopOOP;

public class Film {
    private int id;
    private String judul;
    private double harga;

    //konstruktor
    public Film(int id, String judul, double harga) {
        this.id = id;
        this.judul = judul;
        this.harga = harga;
    }

    public int getId() {
        return id;
    }

    public String getJudul() {
        return judul;
    }

    public double getHarga() {
        return harga;
    }
}
