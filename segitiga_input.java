import java.util.Scanner;

class segitiga_input {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);

        // Title program
        System.out.println("PROGRAM MENGHITUNG LUAS SEGITIGA");
        System.out.println("===================================");

        // Input data
        System.out.print("Inputkan Alas\t\t: ");
        float alas = inputan.nextInt();
        System.out.print("Inputkan Tinggi\t: ");
        float tinggi = inputan.nextInt();

        // proses
        float luas = (alas * tinggi)/2;

        // Output data
        System.out.println("Alas segitiga\t: "+alas+" cm");
        System.out.println("Tinggi segitiga\t: "+tinggi+" cm");
        System.out.println("Luas segitiga\t: "+luas+" cm");
    }
}