package Latihan_Obj_Class;

class Mobil {
    String merk, model;
    int tahun;

    void tampilkanInfo(){
        System.out.println("Merk Mobil  : "+merk);
        System.out.println("Model Mobil : "+model);
        System.out.println("Tahun Mobil : "+tahun);
    }
}

public class Soal_1 {
    public static void main(String[] args) {
        Mobil data = new Mobil();

        data.merk = "Toyota Yaris";
        data.model = "City Car";
        data.tahun = 2018;
        data.tampilkanInfo();

    }
}
