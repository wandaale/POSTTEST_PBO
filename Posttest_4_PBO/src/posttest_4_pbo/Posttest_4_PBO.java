package posttest_4_pbo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Posttest_4_PBO {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static paketLengkap PALE = new paketLengkap();// OBJEK
    static ArrayList<paketLengkap> PLList;// ARRAYLIST
    static paketNormal PANO = new paketNormal();// OBJEK
    static ArrayList<paketNormal> PNList;// ARRAYLIST

    public static void main(String[] args) throws IOException {
        Boolean ulang, ulang1;
        System.out.println("\tWELCOME\n");
        ulang = true;
        while (ulang) {
            System.out.println();
            System.out.println("Sistem Pemesanan Foto Proses Wisuda");
            System.out.println("Menu Pesan");
            System.out.println("1. Paket Lengkap");
            System.out.println("2. Paket Normal");
            System.out.println("3. Exit Program");
            System.out.print("Masukan Pilihan Menu : ");
            String admin = br.readLine();
            switch (admin) {
                case "1":
                    ulang1 = true;
                    while (ulang1) {
                        PALE.opsi();
                        String opsi = br.readLine();
                        switch (opsi) {
                            case "1":
                                PALE.tambapesan();
                                break;
                            case "2":
                                PALE.tampilPesan();
                                break;
                            case "3":
                                PALE.ubahPesanan(PLList);
                                break;
                            case "4":
                                PALE.hapusPesanan();
                                break;
                            case "5":
                                ulang1 = false;
                                break;
                            case "6":
                                System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                                System.exit(0);
                            default:
                                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                                break;
                        }
                    }
                    break;
                case "2":
                    ulang1 = true;
                    while (ulang1) {
                        PANO.opsi();
                        String opsi = br.readLine();
                        switch (opsi) {
                            case "1":
                                PANO.tambapesan();
                                break;
                            case "2":
                                PANO.tampilPesan();
                                break;
                            case "3":
                                PANO.ubahPesanan(PNList);
                                break;
                            case "4":
                                PANO.hapusPesanan();
                                break;
                            case "5":
                                ulang1 = false;
                                break;
                            case "6":
                                System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                                System.exit(0);
                            default:
                                System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                                break;
                        }
                    }
                    break;
                case "3":
                    System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
                    System.exit(0);
                default:
                    System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
                    break;
            }
        }

    }
}