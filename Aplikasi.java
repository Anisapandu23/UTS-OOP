import java.util.LinkedList; 
import java.util.Scanner;
import model.*;
import service.*;

public class Aplikasi {

    private static Scanner scanner;
    private static serviceHP_Service service;

    public static void main(String args[]) {
        int opsi = 0;
        scanner = new Scanner(System.in);
        service = new serviceHP_Service();

        do {
            cetakMenu();
            opsi = scanner.nextInt();
            switch(opsi) {
                case 1 :
                  modulAdd();
                  break;
                case 2 :
                  ubahData(); break;
                case 3 :
                  hapusData(); break;
                case 4 :
                  tampilData();
                  break;
            }
        } while(opsi != 0);

    }

    private static void cetakMenu() {
        System.out.println("\n\n");
        System.out.println("APLIKASI PEREKAMAN SERVICE HP");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan data");
        System.out.println("-----------");
        System.out.println("0. KELUAR");
        System.out.println("\n");
        System.out.print("Pilihan > ");
    }

    private static void modulAdd() {
        String no_service, jenis_hp, nama_pemilik, jenis_service;

        System.out.println("--- tambah data ---");
        System.out.print("NO Service : "); 
        scanner = new Scanner(System.in);
        no_service = scanner.nextLine();
        System.out.print("Jenis HP : ");
        jenis_hp = scanner.nextLine();
        System.out.print("Nama Pemilik : ");
        nama_pemilik = scanner.nextLine();
        System.out.print("Jenis Service : ");
        jenis_service = scanner.nextLine();
        service.addData(new HP(no_service, jenis_hp, nama_pemilik, jenis_service));
    }

    private static void tampilData() {
        LinkedList<HP> result = (LinkedList<HP>) service.getAllData();

        int i=1;
        for(HP bk : result) {
            System.out.println("data ke-" + i++);
            System.out.println("  NO Service: " + bk.getNo_service());
            System.out.println("  Jenis HP: " + bk.getJenis_hp());
            System.out.println("  Nama Pemilik: " + bk.getNama_pemilik());
            System.out.println("  Jenis Service: " + bk.getJenis_service());
        }
    }

    private static void ubahData() {
        String no_service, jenis_hp, nama_pemilik, jenis_service;

        System.out.println("--- perubahan data ---");
        System.out.print("NO Service : "); 
        scanner = new Scanner(System.in);
        no_service = scanner.nextLine();
        System.out.print("Jenis HP : ");
        jenis_hp = scanner.nextLine();
        System.out.print("Nama Pemilik : ");
        nama_pemilik = scanner.nextLine();
        System.out.print("Jenis Service : ");
        jenis_service = scanner.nextLine();
        service.updateData(new HP(no_service, jenis_hp, nama_pemilik, jenis_service));
    }

    private static void hapusData() {
        String no_service;

        System.out.println("--- hapus data ---");
        System.out.print("NO Service : ");
        scanner = new Scanner(System.in);
        no_service = scanner.nextLine();
        service.deleteData(new HP(no_service, null, null, null));
    }

}