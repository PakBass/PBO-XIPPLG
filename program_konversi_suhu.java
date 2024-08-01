class KonversiSuhu {
    // Atribut/Deklarasi variable
    private int celcius;


    public KonversiSuhu(int celcius){
        this.celcius = celcius;
    }

    public float HitungKonversi(){
        return (9/5)+celcius+32;
    }

    public float getCelcius() {
        return celcius;
    }
}
// Main Program
public class program_konversi_suhu {
    public static void main(String[] args) {
        KonversiSuhu hitung = new KonversiSuhu(25);

        float fahrenhait = hitung.HitungKonversi();

        System.out.println("Suhu dalam Fahrenheit: " +fahrenhait+ " Fahrenhait");
    }
}
