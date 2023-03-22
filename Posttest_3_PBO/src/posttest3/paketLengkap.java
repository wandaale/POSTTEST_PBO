package posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class paketLengkap extends pemesanan{
    private final String kodePaketLengkap = "PALE";
    private long noPesan;
    private final int hargaPALE = 499000;
    private final String jenis = "Paket Lengkap";

    paketLengkap(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan, int hargaPaket,String jenis) {
        super(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPaket,jenis);
    }
    paketLengkap() {
        
    }
    
    paketLengkap PALE;
    ArrayList<paketLengkap> PLList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    
    protected void tambapesan (){
        System.out.println("\nMenambahkan Data\n");
        System.out.print("Nama Pemesan : ");
        nama = inp.nextLine();
        System.out.print("NIM Pemesan : ");
        nim = inp.nextLine();
        System.out.print("No. HP : ");
        nomorHP = inp.nextLine();
        System.out.print("Fakultas : ");
        fakultas = inp.nextLine();
        System.out.print("Prodi : ");
        prodi = inp.nextLine();
        noPesan++;
        PALE = new paketLengkap(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPALE, jenis);
        PLList.add(PALE);
        System.out.println("\n>> Tambah Data Berhasil <<");
    }
    protected void tampilPesan(){
        System.out.println("\nMenampilkan Data Pesanan\n");
        for (int i=0; i<PLList.size(); i++){
            System.out.println("["+(i+1)+"] No Pesanan : " + kodePaketLengkap + PLList.get(i).getNoPesan());
            System.out.println("    Nama Pemesan : " + PLList.get(i).getNama());
            System.out.println("    NIM Pemesan : " + PLList.get(i).getNim());
            System.out.println("    No. HP : " + PLList.get(i).getNomorHP());
            System.out.println("    Fakultas : " + PLList.get(i).getFakultas());
            System.out.println("    Prodi : " + PLList.get(i).getProdi());
            System.out.println("    Jenis Paket : " + PLList.get(i).getJenis());
            System.out.println("    Harga Paket : " + PLList.get(i).getHargaPaket());
            System.out.println(" ");
        }
    }
    public void hapusPesanan() {
        System.out.println("\nMenghapus Data Pesanan\n");
        int hapus;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i=0; i<PLList.size(); i++){
            System.out.println("["+(i+1)+"] No Pesanan : " + kodePaketLengkap + PLList.get(i).getNoPesan());
            System.out.println("    Nama Pemesan : " + PLList.get(i).getNama());
            System.out.println("    NIM Pemesan : " + PLList.get(i).getNim());
            System.out.println("    No. HP : " + PLList.get(i).getNomorHP());
            System.out.println("    Fakultas : " + PLList.get(i).getFakultas());
            System.out.println("    Prodi : " + PLList.get(i).getProdi());
            System.out.println("    Jenis Paket : " + PLList.get(i).getJenis());
            System.out.println("    Harga Paket : " + PLList.get(i).getHargaPaket());
            System.out.println(" ");
        }
        if (PLList.size() == 1){
            hapus = 0;
        } else {
            System.out.print("\nMasukkan Nomor yang Ingin Dihapus : ");
            hapus = inputInt.nextInt();
            hapus--;
        }
        PLList.remove(hapus);
        System.out.println("\n>> Hapus Pesanan Berhasil <<\n");
    }
    public ArrayList<paketLengkap> ubahPesanan(ArrayList<paketLengkap> PLlist) {
        int ubah;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i=0; i<PLList.size(); i++){
            System.out.println("["+(i+1)+"] No Pesanan : " + kodePaketLengkap + PLList.get(i).getNoPesan());
            System.out.println("    Nama Pemesan : " + PLList.get(i).getNama());
            System.out.println("    NIM Pemesan : " + PLList.get(i).getNim());
            System.out.println("    No. HP : " + PLList.get(i).getNomorHP());
            System.out.println("    Fakultas : " + PLList.get(i).getFakultas());
            System.out.println("    Prodi : " + PLList.get(i).getProdi());
            System.out.println("    Jenis Paket : " + PLList.get(i).getJenis());
            System.out.println("    Harga Paket : " + PLList.get(i).getHargaPaket());
            System.out.println(" ");
        }
        if (PLList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nMasukkan Nomor yang Ingin Diubah : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nNama Baru : ");
        PLList.get(ubah).nama = inp.nextLine();
        System.out.print("NIM Baru : ");
        PLList.get(ubah).nim = inp.nextLine();
        System.out.print("No. HP Baru : ");
        PLList.get(ubah).nomorHP = inp.nextLine();
        System.out.print("Fakultas Baru : ");
        PLList.get(ubah).fakultas = inp.nextLine();
        System.out.print("Prodi Baru : ");
        PLList.get(ubah).prodi = inp.nextLine();
        System.out.println("\n>> Edit Data Berhasil <<\n");
        
        return PLList;
    }
}
