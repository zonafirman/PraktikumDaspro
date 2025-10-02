package PraktikumDaspro.jobsheet5;

import java.util.Scanner;

public class NestedPerpustakaan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Apakah membawa kartu mahasiswa? (Ya/Tidak): ");
        String bawaKartu = input.nextLine().trim();

        System.out.print("Apakah sudah registrasi online? (Ya/Tidak): ");
        String registrasi = input.nextLine().trim();

        String hasil;

        if (bawaKartu.equalsIgnoreCase("Ya")) {
            hasil = "Izin diberikan: Anda membawa kartu mahasiswa, silakan masuk.";
        } else {
            if (registrasi.equalsIgnoreCase("Ya")) {
                hasil = "Izin diberikan: Anda sudah registrasi online, silakan masuk.";
            } else {
                hasil = "Izin ditolak: Anda harus membawa kartu mahasiswa atau sudah registrasi online.";
            }
        }

        System.out.println("\nHasil: " + hasil);
        input.close();
    }
}
