package PraktikumDaspro.jobsheet5;

import java.util.Scanner;
public class ifCetakKRS27{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();

        if (uktLunas) {
            System.out.println("Pembayaran UKT terverifikasi");
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }
        else {
            System.out.println("Pembayaran UKT belum terverifikasi");
            System.out.println("Silahkan melunasi UKT terlebih dahulu sebelum mencetak KRS");
        }
    }
}
