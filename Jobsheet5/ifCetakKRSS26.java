package Jobsheet5;
import java.util.Scanner;

public class ifCetakKRSS26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("--- Cetak KRS Siakad ---");
        System.out.print("apakah ukt sudah lunas? (true/false):");
        boolean uktLunas = scanner.nextBoolean();

        String a = (uktLunas) ? "pembayaran ukt terverifikasi":"registrasi ditolak, silahkan lunasi ukt terlebih dahulu";
        System.out.println(a);
    }
}
