package PraktikumDaspro.jobsheet5;

import java.util.Scanner;

public class SistemWifiKampus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Sistem Akses WiFi Kampus ---");
        System.out.print("Apakah Anda dosen, mahasiswa, atau lainnya? ");
        String jenis = sc.nextLine();

        if (jenis.equalsIgnoreCase("dosen")) {
            System.out.println("Akses WiFi diberikan (dosen).");
        } else if (jenis.equalsIgnoreCase("mahasiswa")) {
            System.out.print("Masukkan jumlah SKS yang diambil: ");
            int sks = sc.nextInt();

            if (sks >= 12) {
                System.out.println("Akses WiFi diberikan (mahasiswa aktif).");
            } else {
                System.out.println("Akses ditolak, SKS kurang dari 12.");
            }
        } else {
            System.out.println("Akses ditolak. Peran tidak dikenali.");
        }

        sc.close();
    }
}
