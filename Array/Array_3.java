package Array;

public class Array_3 {
    public static void main(String[] args) {
        int nilai[] = {75, 87, 70, 90, 76};

        //Hitung rata-rata nilai dari data Array tersebut
        int jumNilai = 0;
        for(int nilaiSiswa : nilai) {
            // jumNilai = nilai[0]+nilai[1]+nilai[2]+nilai[3]+nilai[4];
            jumNilai += nilaiSiswa;
        }
        double rataRata = (double) jumNilai / nilai.length;
        System.out.println("Rata - rata nilai = "+ rataRata);
    }
}
