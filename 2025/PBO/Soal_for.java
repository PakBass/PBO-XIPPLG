public class Soal_for {
    public static void main(String[] args) {
        String nama = "Mason";
        int menabung = 0;
        for (int ayu = 0; ayu < 30; ayu++) {
            menabung += 1000;
            System.out.println("Menabung hari ke- " + (ayu + 1) + " = " + "Rp " + menabung);
        }
        System.out.println("Total tabungam ayu selama 30 hari = Rp " + menabung);
        System.out.println("Nama programer adalah " + nama);
    }
}
