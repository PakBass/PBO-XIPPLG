package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

class Siswa {
    String nama, mataLomba, kelas;

    //constructor
    public Siswa(String nama, String mataLomba, String kelas){
        this.nama = nama;
        this.mataLomba = mataLomba;
        this.kelas = kelas;
    }

    public String getNama(){
        return nama;
    }
    public String getMataLomba(){
        return mataLomba;
    }
    public String getKelas(){
        return kelas;
    }
}

public class LombaPhbn {
    ArrayList<Siswa> listSiswa = new ArrayList<>();

    public void tambahSiswa(Siswa siswa) {
        listSiswa.add(siswa);
        System.out.println("Data siswa berhasil ditambahkan");
    }

    public void tampilkanData(){
        System.out.println("Daftar Peserta");
        System.out.println("---------------------------------------");
        System.out.println("| Nama Siswa      | Mata Lomba | Kelas  |");
        System.out.println("---------------------------------------");
        for (Siswa siswa : listSiswa) {
            System.out.printf("| %-15s | %-10s | %-9s |\n", siswa.getNama(), siswa.getMataLomba(), siswa.getKelas());
        }
    }
    public static void main(String[] args) {
        LombaPhbn lomba = new LombaPhbn();
        Scanner input = new Scanner(System.in);

        int pilih;
        do{

            System.out.println();
            System.out.println("-------------------------");
            System.out.println("Pilihan Menu");
            System.out.println("-------------------------");
            System.out.println("1. Tambah data peserta");
            System.out.println("2. Tampilkan semua data");
            System.out.println("3. Keluar program");
            System.out.println("-------------------------");
            System.out.print("Masukkan pilihan anda: ");
            pilih = input.nextInt();
            input.nextLine();
    
            switch (pilih) {
                case 1:
                        System.out.print("Masukkan nama siswa: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan mata lomba: ");
                        String mataLomba = input.nextLine();
                        System.out.print("Masukkan kelas     : ");
                        String kelas = input.nextLine();
                        Siswa dataBaru = new Siswa(nama, mataLomba, kelas);
                        lomba.tambahSiswa(dataBaru);
                    break;
                case 2 :
                        lomba.tampilkanData();
                    break;
            }
        } while (pilih != 3);
        System.out.println("Keluar program");
    }
}
