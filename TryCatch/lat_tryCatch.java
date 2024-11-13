package TryCatch;

public class lat_tryCatch {
    public static void main(String[] args) {
        int x = 10;

        System.out.println("Awal Program");

        // x = x / 0;
        // System.out.println(x);

         try {
            x = x / 0;
            System.out.println(x);
        }
        catch (Exception e){
            e.printStackTrace(); //untuk menampilkan pesan error
            System.out.println("error karena pembagian nol");
        }
        
        System.out.println("Akhir Program");
    }
}
