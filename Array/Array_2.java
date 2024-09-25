package Array;

public class Array_2 {
    public static void main(String[] args) {
        String buah[] = {
            "Apel",
            "Pisang",
            "Anggur",
            "Mangga"
        };
        //Output semua data dalam Array
        System.out.println();
        for(int i=0; i<buah.length;i++){
            System.out.println(i+1 +"."+buah[i]);
        }
    }
}
