package Array;
import java.util.Scanner;
public class Array_1 {
    public static void main(String[] args) {
        Scanner masuk=new Scanner(System.in);
        int nilai[] = new int[5];
        System.out.println("Masukkan 5 buah data nilai");
        for(int i=0;i<5;i++) {
            System.out.print("Data ke "+(i+1)+" : ");
            nilai[i]=masuk.nextInt();
        } 
        System.out.println("Data nilai yang dimasukkan");
        for(int i=0;i<5;i++) {
            System.out.print(nilai[i]+ " ");
        }
    }
}
