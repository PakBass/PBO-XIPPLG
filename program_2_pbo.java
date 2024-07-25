class segitiga {
    //Atribut
    private int alas;
    private int tinggi;

    //konstruktor
    public segitiga(int alas, int tinggi)
    {
        this.alas = alas;
        this.tinggi = tinggi;
    }
    //method untuk menghitung luas
    public float HitungLuas()
    {
        return (alas * tinggi)/2;
    }

    //method untuk mendapatkan alas
    public int getAlas()
    {
        return alas;
    }
    //method untuk mendapatkan tinggi
    public int getTinggi()
    {
        return tinggi;
    }
}
//Class Utama
public class program_2_pbo {
    public static void main(String[] args) {
        //membuat objek segitiga
        segitiga segitiga = new segitiga(10, 4);

        //menghitung luas segitiga
        float luas = segitiga.HitungLuas();

        //Output
        System.out.println("Alas segitiga   = "+segitiga.getAlas()+" cm");
        System.out.println("Tinggi segitiga = "+segitiga.getTinggi()+" cm");
        System.out.println("Luas Segitiga adalah = " +luas+" cm");
    }
}
