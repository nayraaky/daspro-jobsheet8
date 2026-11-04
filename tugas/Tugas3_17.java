package tugas;

import java.util.Scanner;

public class Tugas3_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah toko: ");
        int jumlahToko = sc.nextInt();

        if (jumlahToko < 1) {
            System.out.println("Jumlah toko minimal 1!");
        } else {
            int totalSemuaBarang = 0;
            int barangTertinggi  = -1;
            int tokoTerbanyak    = 0;

            for (int toko = 1; toko <= jumlahToko; toko++) {
                System.out.println("+---------------- TOKO " + toko + "----------------+");

                int jumlahPelanggan;
                do {
                    System.out.print("  Jumlah pelanggan: ");
                    jumlahPelanggan = sc.nextInt();
                    if (jumlahPelanggan < 0) {
                        System.out.println("    Input tidak valid!");
                    }
                } while (jumlahPelanggan < 0);

                int totalBarangToko = 0;

                for (int p = 1; p <= jumlahPelanggan; p++) {
                    int barang;
                    do {
                        System.out.print("      Jumlah barang pelanggan " + p + ": ");
                        barang = sc.nextInt();
                        if (barang < 0) {
                            System.out.println("        Input tidak valid!");
                        }
                    } while (barang < 0);

                    totalBarangToko += barang;
                }

                System.out.println("Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarangToko);

                totalSemuaBarang += totalBarangToko;

                if (totalBarangToko > barangTertinggi) {
                    barangTertinggi = totalBarangToko;
                    tokoTerbanyak = toko;
                }
            }

            System.out.println("+---------------------------------------+");
            System.out.println("Total barang seluruh toko    : " + totalSemuaBarang);
            System.out.println("Toko dengan barang terbanyak : " + tokoTerbanyak);
        }

        sc.close();
    }
}
