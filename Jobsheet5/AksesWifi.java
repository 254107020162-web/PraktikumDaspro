package Jobsheet5;
import java.util.Scanner;

public class AksesWifi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jenis pengguna (dosen/mahasiswa/lain): ");
        String jenis = scanner.nextLine();

        if (jenis.equals("dosen")){
            System.out.println("Akses Wifi diberikan (dosen)");
        }else if (jenis.equals("mahasiswa")){
            System.out.println("Masukkan jumlah SKS yang diambil");
            int sks = scanner.nextInt();
            if (sks >= 12){
                System.out.println("Akses Wifi diberikan (mahasiswa)");
            }else{
                System.out.println("Akses ditolak, SKS kurang dari 12");
            }
        }else{
            System.out.println("Akses ditolak");
        }
        }
    }

