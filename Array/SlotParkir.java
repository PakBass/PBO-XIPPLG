package Array;
import java.util.Scanner;
public class SlotParkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean []slootParkir = new boolean[10];

        slootParkir[1] = true;
        slootParkir[4] = true;
        slootParkir[8] = true;

        System.out.println("Slot Parkir : ");
        System.out.print("{");
        // for(int i = 0; i < slootParkir.length; i++) {
        for(boolean status : slootParkir) {
            System.out.print(" " +status+ " ");
        }
        System.out.print("}");
        System.out.println();

        //main proses
        // ?????????????????????????????????
        // ?????????????????????????????????
        // ?????????????????????????????????
        // ?????????????????????????????????
        // ?????????????????????????????????
        // ?????????????????????????????????
        // ?????????????????????????????????
    }
}
