package ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

public class Lat_2 {
    public static void main(String[] args) {
        LinkedList<String> motor = new LinkedList<>();
        Scanner input_motor = new Scanner(System.in);

        System.out.print("Masukkan Jumlah motor: ");
        int jum = input_motor.nextInt();
        input_motor.nextLine();

        for(int m = 0; m < jum; m++){
            System.out.print("Masukkan data motor ke "+(m+1)+ ": ");
            motor.add(input_motor.nextLine());
        }

        motor.removeFirst();
        
        int x = 0;
        //foreach
        for(String i : motor){
            System.out.println("index ke "+(x+1)+" : "+i);
            x++;
        }
        System.out.println("Jumlah index : "+motor.size());
    }
}
