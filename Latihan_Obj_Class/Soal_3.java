package Latihan_Obj_Class;
import Latihan_Obj_Class_2.Data_Mhs;
import java.util.Scanner;

public class Soal_3 {
    public static void main(String[] args) {
        Data_Mhs data = new Data_Mhs();
        Scanner input = new Scanner(System.in);

        System.out.print("Inputkan nama mahasiswa    : ");
        data.nama = input.nextLine();
        System.out.print("Inputkan nim mahasiswa     : ");
        data.nim = input.nextLine();
        System.out.print("Inputkan jurusan mahasiswa : ");
        data.jurusan = input.nextLine();

        data.tampilkanData();
        input.close();
    }
}
