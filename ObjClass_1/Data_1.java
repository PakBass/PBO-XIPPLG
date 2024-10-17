package ObjClass_1;

import ObjClass_2.Mapel;

class Nilai {
    String nama = "Jhon", 
    ttl = "Balikpapan, 20 Maret 2000",
    alamat = "Jl. S. Parman",
    sekolah = "SMK Airlangga";
}

public class Data_1 {
    public static void main(String[] args) {

        Nilai hasil = new Nilai();
        Jurusan objProdi = new Jurusan();
        Mapel objMapel = new Mapel();

        System.out.println(hasil.nama);
        System.out.println(hasil.ttl);
        System.out.println(hasil.alamat);
        System.out.println(hasil.sekolah);
        System.out.println("Program Studi: "+objProdi.prodi);
        System.out.println("Mata Pelajaran: "+objMapel.mp);
    }
}
