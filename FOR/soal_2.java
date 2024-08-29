//2. Menghitung jumlah bilangan ganjil dari 1 hingga 100

package FOR;

public class soal_2 {
    public static void main(String[] args) {
        int a = 0;
        for(int i=1; i <= 100; i+=2){
            a += 1;
        }
        System.out.println("Jumlah angka bilangan ganjil 1 sd 100: "+a+ " angka");
    }
}