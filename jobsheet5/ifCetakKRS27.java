package PraktikumDaspro.jobsheet5;

import java.util.Scanner;
public class ifCetakKRS27{ public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        boolean uktLunas = sc.nextBoolean();
        String pesanStatus = uktLunas ? "Pembayaran UKT terverifikasi" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu";
        System.out.println(pesanStatus);
        if (uktLunas) {
            System.out.println("Silakan cetak KRS dan minta tanda tangan DPA");
        }

    }
    }
