package latihan_if;

import java.text.NumberFormat;
import java.util.Scanner;

enum MerkCat {
    A, B, C
}

class Cat {
    private MerkCat merk;
    private double hargaPerLiter;

    public Cat(MerkCat merk, double hargaPerLiter) {
        this.merk = merk;
        this.hargaPerLiter = hargaPerLiter;
    }

    public double getHargaPerLiter() {
        return hargaPerLiter;
    }

    public double hitungDiskon(double jumlahLiter) {
        double diskon = 0;
        if (jumlahLiter > 10) {
            diskon += 10;
        }
        if (merk == MerkCat.A && jumlahLiter > 5) {
            diskon += 5;
        } else if (merk == MerkCat.B && jumlahLiter > 8) {
            diskon += 3;
        }
        return diskon;
    }
}

class Pembeli {
    private Cat cat;
    private double jumlahLiter;

    public Pembeli(Cat cat, double jumlahLiter) {
        this.cat = cat;
        this.jumlahLiter = jumlahLiter;
    }

    public double hitungTotalPembayaran() {
        double hargaTotal = cat.getHargaPerLiter() * jumlahLiter;
        double diskon = cat.hitungDiskon(jumlahLiter);
        return hargaTotal - (hargaTotal * diskon / 100);
    }
}

public class DiskonCatOOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

        try {
            System.out.print("Masukkan jumlah cat yang dibeli (liter): ");
            double jumlahLiter = input.nextDouble();
            if (jumlahLiter <= 0) {
                throw new IllegalArgumentException("Jumlah liter harus positif.");
            }

            System.out.print("Masukkan merk cat (A, B, atau C): ");
            String merkStr = input.next().toUpperCase();
            MerkCat merkCat = MerkCat.valueOf(merkStr);

            Cat cat = new Cat(merkCat, switch (merkCat) {
                case A -> 50000;
                case B -> 45000;
                case C -> 40000;
            });

            Pembeli pembeli = new Pembeli(cat, jumlahLiter);
            double totalBayar = pembeli.hitungTotalPembayaran();

            System.out.println("Total harga setelah diskon: " + currencyFormatter.format(totalBayar));
        } catch (IllegalArgumentException e) {
            System.out.println("Input tidak valid: " + e.getMessage());
        }
    }
}