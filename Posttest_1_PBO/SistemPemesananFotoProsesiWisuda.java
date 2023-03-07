package sistem.pemesanan.foto.prosesi.wisuda;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemPemesananFotoProsesiWisuda {
    
    static String option, admin;
    static Scanner input = new Scanner(System.in);
    static pemesanan pesan = new pemesanan();
    static ArrayList<pemesanan> dataPesan;
    
    public static void menu (){
        Boolean ulang1;
        System.out.println("\tWELCOME\n");
        ulang1 = true;
        while(ulang1){
            Pesan();
            switch (admin){
                case "1":
                    pesan.tambahPesan();
                    break;
                case "2":
                    pesan.tampilData();
                    break;
                case "3":
                    pesan.ubahData(dataPesan);
                    break;
                case "4":
                    pesan.hapusData();
                    break;
                
                case "5":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);
                default:
                    System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                    break;
            }
        }
    }
    public static String Pesan (){
        System.out.println();
        System.out.println("Sistem Pemesanan Foto Proses Wisuda");
        System.out.println("Menu Pesan");
        System.out.println("1. Tambah Data Pesanan");
        System.out.println("2. Tampilkan Data Pesanan");
        System.out.println("3. Edit Data Pesanan");
        System.out.println("4. Hapus Data Pesanan");
        System.out.println("5. Exit Program");
        System.out.print("Masukan Pilihan menu : ");
        admin = input.nextLine();
        return admin;
    }
    
    public static void main(String[] args) {
        menu();
    }
}
