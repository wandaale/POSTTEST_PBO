package posttest2pbo;
import java.io.*;
import java.util.*;

public class Posttest2PBO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<pemesanan> dataPesan = new ArrayList<>();
        
        Boolean ulang1;
        System.out.println("\tWELCOME\n");
        ulang1 = true;
        while(ulang1){
            System.out.println();
            System.out.println("Sistem Pemesanan Foto Proses Wisuda");
            System.out.println("Menu Pesan");
            System.out.println("1. Tambah Data Pesanan");
            System.out.println("2. Tampilkan Data Pesanan");
            System.out.println("3. Edit Data Pesanan");
            System.out.println("4. Hapus Data Pesanan");
            System.out.println("5. Exit Program");
            System.out.print("Masukan Pilihan menu : ");
            String admin = br.readLine();
            switch (admin){
                case "1":
                    System.out.println("\nMenambahkan Data\n");
                    System.out.print("Nama Pemesan : ");
                    String nama = br.readLine();
                    System.out.print("NIM Pemesan : ");
                    int nim = Integer.parseInt(br.readLine());
                    System.out.print("No. HP : ");
                    String nomorHP = br.readLine();
                    System.out.print("Fakultas : ");
                    String fakultas = br.readLine();
                    System.out.print("Prodi : ");
                    String prodi = br.readLine();
                    pemesanan pesan = new pemesanan(nama, nim, fakultas, prodi, nomorHP);
                    dataPesan.add(pesan);
                    System.out.println("\n>> Tambah Data Furniture Berhasil <<");
                    break;
                    
                case "2":
                    System.out.println("\nMenampilkan Data Pesanan\n");
                    for (int i=0; i<dataPesan.size(); i++){
                        System.out.println("["+(i+1)+"] Nama Pemesan : " + dataPesan.get(i).getNama());
                        System.out.println("    NIM Pemesan : " + dataPesan.get(i).getNim());
                        System.out.println("    No. HP : " + dataPesan.get(i).getNomorHP());
                        System.out.println("    Fakultas : " + dataPesan.get(i).getFakultas());
                        System.out.println("    Prodi : " + dataPesan.get(i).getProdi());
                        System.out.println(" ");
                    }
                    break;
                    
                case "3":
                    int ubah;
                    System.out.println("\nMengubah Data Pesanan\n");
                    for (int i=0; i<dataPesan.size(); i++){
                        System.out.println("["+(i+1)+"] Nama Pemesan : " + dataPesan.get(i).getNama());
                        System.out.println("    NIM Pemesan : " + dataPesan.get(i).getNim());
                        System.out.println("    No. HP : " + dataPesan.get(i).getNomorHP());
                        System.out.println("    Fakultas : " + dataPesan.get(i).getFakultas());
                        System.out.println("    Prodi : " + dataPesan.get(i).getProdi());
                        System.out.println(" ");
                    }
                    if (dataPesan.size() == 1){
                        ubah = 0;
                    } else {
                        System.out.print("\nMasukkan Nomor yang ingin diubah : ");
                        ubah = Integer.parseInt(br.readLine());
                        ubah--;
                    }
                    System.out.print("\nNama Baru : ");
                    String nama1 = br.readLine();
                    dataPesan.get(ubah).setNama(nama1);
                    System.out.print("NIM Baru : ");
                    int nim1 = Integer.parseInt(br.readLine());
                    dataPesan.get(ubah).setNim(nim1);
                    System.out.print("No. HP Baru : ");
                    String nomorHP1 = br.readLine();
                    dataPesan.get(ubah).setNomorHP(nomorHP1);
                    System.out.print("Fakultas Baru : ");
                    String fakultas1 = br.readLine();
                    dataPesan.get(ubah).setFakultas(fakultas1);
                    System.out.print("Prodi Baru : ");
                    String prodi1 = br.readLine();
                    dataPesan.get(ubah).setProdi(prodi1);
                    System.out.println("\n>> Edit Data Berhasil <<\n");
                    break;
                    
                case "4":
                    System.out.println("\nMenghapus Data Pesanane\n");
                    int hapus;
                    System.out.println("\nMengubah Data Pesanan\n");
                    for (int i=0; i<dataPesan.size(); i++){
                        System.out.println("["+(i+1)+"] Nama Pemesan : " + dataPesan.get(i).getNama());
                        System.out.println("    NIM Pemesan : " + dataPesan.get(i).getNim());
                        System.out.println("    No. HP : " + dataPesan.get(i).getNomorHP());
                        System.out.println("    Fakultas : " + dataPesan.get(i).getFakultas());
                        System.out.println("    Prodi : " + dataPesan.get(i).getProdi());
                        System.out.println(" ");
                    }
                    if (dataPesan.size() == 1){
                        hapus = 0;
                    } else {
                        System.out.print("\nMasukkan Nomor yang ingin dihapus : ");
                        hapus = Integer.parseInt(br.readLine());
                        hapus--;
                    }
                    dataPesan.remove(hapus);
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
}
