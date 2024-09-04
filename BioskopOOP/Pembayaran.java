package BioskopOOP;

public class Pembayaran {
    private double totalHarga;
    private double uangBayar;

    //konstruktor
    public Pembayaran(double totalHarga, double uangBayar){
        this.totalHarga = totalHarga;
        this.uangBayar = uangBayar;
    }

    public double hitungKembalian(){
        return uangBayar - totalHarga;
    }
}
