package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

class Alat {
    String kodeAlat, namaAlat, merkAlat, unitAlat, kondisiAlat;

    public Alat (String kodeAlat, String namaAlat, String merkAlat, String unitAlat, String kondisiAlat) {
        this.kodeAlat = kodeAlat;
        this.namaAlat = namaAlat;
        this.merkAlat = merkAlat;
        this.unitAlat = unitAlat;
        this.kondisiAlat = kondisiAlat;
    }

    //getter
    public String getKodeAlat(){
        return kodeAlat;
    }
    public String getNamaAlat(){
        return namaAlat;
    }
    public String getMerkAlat(){
        return merkAlat;
    }
    public String getUnitAlat(){
        return unitAlat;
    }
    public String getKondisiAlat(){
        return kondisiAlat;
    }
    //setter
    public void setKodeAlat(String kodeAlat){
        this.kodeAlat = kodeAlat;
    }
    public void setNamaAlat(String namaAlat){
        this.namaAlat = namaAlat;
    }
    public void setMerkAlat(String merkAlat){
        this.merkAlat = merkAlat;
    }
    public void setUnitAlat(String unitAlat){
        this.unitAlat = unitAlat;
    }
    public void setKondisiAlat(String kondisiAlat){
        this.kondisiAlat = kondisiAlat;
    }
    
}

public class Inventaris {
    ArrayList<Alat> listAlat = new ArrayList<>();

    public void tambahDataAlat(Alat alat) {
        listAlat.add(alat);
        System.out.println("Data alat baru berhasil ditambahkan.");
    }
    public void tampilkanDataAlat(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println("Daftar inventaris Lab RPL SMK Airlangga");
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("| Kode Alat    | Nama Alat         | Merk Alat  | Jumlah Unit  | Kondisi Alat |");
        System.out.println("---------------------------------------------------------------------------------");
        if (listAlat.isEmpty()) {
            System.out.println("Tidak ada data inventaris.");
        } else {
            for (Alat alat : listAlat) {
                System.out.printf("| %-12s | %-17s | %-10s | %-12s | %-12s |\n", 
                alat.getKodeAlat(), 
                alat.getNamaAlat(), 
                alat.getMerkAlat(), 
                alat.getUnitAlat(),
                alat.getKondisiAlat());
            }
        }
    }
    public boolean updateDataAlat(String kodeAlat) {
        Scanner input = new Scanner(System.in);

        for (Alat alat : listAlat) {
            if (alat.getKodeAlat().equalsIgnoreCase(kodeAlat)) {
                System.out.print("Update nama (kosongkan jika tidak ingin mengubah): ");
                String namaBaru = input.nextLine();
                if (!namaBaru.isEmpty()) {
                    alat.setNamaAlat(namaBaru);
                }
                System.out.print("Update merk (kosongkan jika tidak ingin mengubah): ");
                String merkBaru = input.nextLine();
                if (!merkBaru.isEmpty()) {
                    alat.setMerkAlat(merkBaru);
                }
                System.out.print("Update jumlah unit (kosongkan jika tidak ingin mengubah): ");
                String unitBaru = input.nextLine();
                if (!unitBaru.isEmpty()) {
                    alat.setUnitAlat(unitBaru);
                }
                System.out.print("Update kondisi alat terkini (kosongkan jika tidak ingin mengubah): ");
                String kondisiBaru = input.nextLine();
                if (!kondisiBaru.isEmpty()) {
                    alat.setKondisiAlat(kondisiBaru);
                }
                System.out.println("Data alat berhasil di update!");
                return true;
            }
        }
        return false;
    }
    public void hapusDataAlat(String kodeAlat){
        boolean cariAlat = false;
        for (Alat alat : listAlat) {
            if (alat.getKodeAlat().equalsIgnoreCase(kodeAlat)) {
                listAlat.remove(alat);
                System.out.print("Data alat berhasil dihapus");
                cariAlat = true;
                break;
            } else  if (!cariAlat) {
                System.out.println("Data alat tidak ada!!");
            }
        }
    }
    public static void main(String[] args) {
        Inventaris pendataan = new Inventaris();
        Scanner input = new Scanner(System.in);
        int pilih = 0;
            do{
                try{
                    System.out.println();
                    System.out.println("-------------------------");
                    System.out.println("Pilihan Menu");
                    System.out.println("-------------------------");
                    System.out.println("1. Tambah data alat");
                    System.out.println("2. Tampilkan semua data inventaris");
                    System.out.println("3. Ubah data alat");
                    System.out.println("4. Hapus data");
                    System.out.println("5. Keluar program");
                    System.out.println("-------------------------");
                    System.out.print("Masukkan pilihan anda: ");
                    pilih = input.nextInt();
                    input.nextLine();
        
                    switch (pilih) {
                        case 1:
                                System.out.print("Masukkan kode alat       : ");
                                String kodeAlat = input.nextLine();
                                System.out.print("Masukkan nama alat       : ");
                                String namaAlat = input.nextLine();
                                System.out.print("Masukkan merk Alat       : ");
                                String merkAlat = input.nextLine();
                                System.out.print("Masukkan jumlah unit     : ");
                                String unitAlat = input.nextLine();
                                System.out.print("Masukkan kondisi alat    : ");
                                String kondisiAlat = input.nextLine();
                                Alat dataBaru = new Alat(kodeAlat, namaAlat, merkAlat, unitAlat, kondisiAlat);
                                pendataan.tambahDataAlat(dataBaru);
                            break;
                        case 2 :
                                pendataan.tampilkanDataAlat();
                            break;
                        case 3 :
                                boolean cariKode = false;
                                while (!cariKode) {
                                    System.out.print("Masukkan kode alat yang  ingin di ubah: ");
                                    String kodeUpdate = input.nextLine();
                                    cariKode = pendataan.updateDataAlat(kodeUpdate);
                                    if (!cariKode) {
                                        System.out.println("Kode alat tidak ditemukan!");
                                    }
                                }
                                break;
                        case 4 :
                                System.out.print("Masukkan kode alat yang  ingin di hapus: ");
                                String kodeHapus = input.nextLine();
                                pendataan.hapusDataAlat(kodeHapus);
                                break;
                        default:
                            break;
                    }
                }  catch (Exception e) {
                    System.out.print("\033[H\033[2J");
                    System.out.flush();
                    System.out.println("Input tidak valid (harus berupa angka)");
                    input.nextLine();
                }

            } while(pilih != 5);
            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("Keluar program");
        }
}
