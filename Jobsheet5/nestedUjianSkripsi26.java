package Jobsheet5;
import java.util.Scanner;

public class nestedUjianSkripsi26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pesan;

        System.out.print("Apakah mahasiswa sudah bebas kompen? (ya/tidak): ");
        String bebasKompen = scanner.nextLine().trim();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 1: ");
        int bimbingan1 = scanner.nextInt();

        System.out.print("Masukkan jumlah log bimbingan pembimbing 2: ");
        int bimbingan2 = scanner.nextInt();

        if (bebasKompen.equalsIgnoreCase("ya")) {
            if (bimbingan1 >= 8 && bimbingan2 >= 4) {
                pesan = "Semua syarat terpenuhi. Mahasiswa boleh mendaftar ujian skripsi.";
            } else if (bimbingan1 < 8 && bimbingan2 < 4) {
                pesan = "Gagal! Log bimbingan P1 kurang dari 8 kali dan log bimbingan P2 kurang dari 4 kali.";
            } else if (bimbingan1 < 8) {
                pesan = "Gagal! Log bimbingan P1 belum mencapai 8 kali.";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali.";
            }
        } else {
            pesan = "Gagal! Mahasiswa masih memiliki tanggungan kompen.";
        }

        System.out.println(pesan);
    }
}
