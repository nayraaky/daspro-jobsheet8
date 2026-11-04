package tugas;

import java.util.Scanner;

public class Tugas1_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai n = ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("Nilai n minimal 1!");
        } else {
            int i = 1;
            int totalAngka = 0;

            while (i <= n) {
                int j = 1;
                while (j <= i) {
                    System.out.print(j + " ");
                    totalAngka++;
                    j++;
                }
                System.out.println();
                i++;
            }
            System.out.println("Total angka tercetak: " + totalAngka);
        }

        sc.close();
    }
}
