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

    //getter
    public String getNama(){
        return nama;
    }
    public String getMataLomba(){
        return mataLomba;
    }
    public String getKelas(){
        return kelas;
    }

    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    public void setMataLomba(String mataLomba){
        this.mataLomba = mataLomba;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
}

public class LombaPhbn {
    ArrayList<Siswa> listSiswa = new ArrayList<>();

    public void tambahSiswa(Siswa siswa) {
        listSiswa.add(siswa);
        System.out.println("Data siswa berhasil ditambahkan");
    }

    public void tampilkanData(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Daftar Peserta PHBN 2024");
        System.out.println("---------------------------------------");
        System.out.println("| Nama Siswa      | Mata Lomba | Kelas  |");
        System.out.println("---------------------------------------");
        for (Siswa siswa : listSiswa) {
            System.out.printf("| %-15s | %-10s | %-9s |\n", siswa.getNama(), siswa.getMataLomba(), siswa.getKelas());
        }
    }
    public void updateData(String nama){
        Scanner input = new Scanner(System.in);
        boolean cariData = false;

        for (Siswa siswa : listSiswa) {
            if (siswa.getNama().equalsIgnoreCase(nama)) {
                System.out.print("Masukkan nama baru (kosongkan jika tidak ingin mengubah): ");
                String namaBaru = input.nextLine();
                if (!namaBaru.isEmpty()) {
                    siswa.setNama(namaBaru);
                }
                System.out.print("Masukkan mata lomba baru (kosongkan jika tidak ingin mengubah): ");
                String mataLombaBaru = input.nextLine();
                if (!mataLombaBaru.isEmpty()) {
                    siswa.setMataLomba(mataLombaBaru);
                }
                System.out.print("Masukkan kelas baru (kosongkan jika tidak ingin mengubah): ");
                String kelasBaru = input.nextLine();
                if (!kelasBaru.isEmpty()) {
                    siswa.setKelas(kelasBaru);
                }
                System.out.println("Data siswa berhasil di update!");
                cariData = true;
                break;
            }
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
            System.out.println("3. Ubah data");
            System.out.println("4. Hapus data");
            System.out.println("5. Keluar program");
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
                case 3 :
                        System.out.print("Masukkan nama siswa yang  ingin di ubah: ");
                        String namaUpdate = input.nextLine();
                        lomba.updateData(namaUpdate);
                        break;
            }
        } while (pilih != 5);
        System.out.println("Keluar program");
    }
}
