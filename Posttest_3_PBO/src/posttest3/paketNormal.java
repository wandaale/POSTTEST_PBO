package posttest3;

import java.util.ArrayList;
import java.util.Scanner;

public class paketNormal extends pemesanan{
    private final String kodePaketNormal = "PANO";
    private long noPesan;
    private final int hargaPANO = 199000;
    private final String jenis = "Paket Normal";

    public paketNormal(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan, int hargaPaket,String jenis) {
        super(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPaket,jenis);
    }
    paketNormal() {
        
    }
    
    paketNormal PANO;
    ArrayList<paketNormal> PNList = new ArrayList<>();
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
        PANO = new paketNormal(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPANO, jenis);
        PNList.add(PANO);
        System.out.println("\n>> Tambah Data Berhasil <<");
    }
    protected void tampilPesan(){
        System.out.println("\nMenampilkan Data Pesanan\n");
        for (int i=0; i<PNList.size(); i++){
            System.out.println("["+(i+1)+"] No Pesanan : " + kodePaketNormal + PNList.get(i).getNoPesan());
            System.out.println("    Nama Pemesan : " + PNList.get(i).getNama());
            System.out.println("    NIM Pemesan : " + PNList.get(i).getNim());
            System.out.println("    No. HP : " + PNList.get(i).getNomorHP());
            System.out.println("    Fakultas : " + PNList.get(i).getFakultas());
            System.out.println("    Prodi : " + PNList.get(i).getProdi());
            System.out.println("    Jenis Paket : " + PNList.get(i).getJenis());
            System.out.println("    Harga Paket : " + PNList.get(i).getHargaPaket());
            System.out.println(" ");
        }
    }
    public void hapusPesanan() {
        System.out.println("\nMenghapus Data Pesanan\n");
        int hapus;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i=0; i<PNList.size(); i++){
            System.out.println("["+(i+1)+"] No Pesanan : " + kodePaketNormal + PNList.get(i).getNoPesan());
            System.out.println("    Nama Pemesan : " + PNList.get(i).getNama());
            System.out.println("    NIM Pemesan : " + PNList.get(i).getNim());
            System.out.println("    No. HP : " + PNList.get(i).getNomorHP());
            System.out.println("    Fakultas : " + PNList.get(i).getFakultas());
            System.out.println("    Prodi : " + PNList.get(i).getProdi());
            System.out.println("    Jenis Paket : " + PNList.get(i).getJenis());
            System.out.println("    Harga Paket : " + PNList.get(i).getHargaPaket());
            System.out.println(" ");
        }
        if (PNList.size() == 1){
            hapus = 0;
        } else {
            System.out.print("\nMasukkan Nomor yang Ingin Dihapus : ");
            hapus = inputInt.nextInt();
            hapus--;
        }
        PNList.remove(hapus);
        System.out.println("\n>> Hapus Pesanan Berhasil <<\n");
    }
    public ArrayList<paketNormal> ubahPesanan(ArrayList<paketNormal> PNlist) {
        int ubah;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i=0; i<PNList.size(); i++){
            System.out.println("["+(i+1)+"] No Pesanan : " + kodePaketNormal + PNList.get(i).getNoPesan());
            System.out.println("    Nama Pemesan : " + PNList.get(i).getNama());
            System.out.println("    NIM Pemesan : " + PNList.get(i).getNim());
            System.out.println("    No. HP : " + PNList.get(i).getNomorHP());
            System.out.println("    Fakultas : " + PNList.get(i).getFakultas());
            System.out.println("    Prodi : " + PNList.get(i).getProdi());
            System.out.println("    Jenis Paket : " + PNList.get(i).getJenis());
            System.out.println("    Harga Paket : " + PNList.get(i).getHargaPaket());
            System.out.println(" ");
        }
        if (PNList.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nMasukkan Nomor yang Ingin Diubah : ");
            ubah = inputInt.nextInt();
            ubah--;
        }
        System.out.print("\nNama Baru : ");
        PNList.get(ubah).nama = inp.nextLine();
        System.out.print("NIM Baru : ");
        PNList.get(ubah).nim = inp.nextLine();
        System.out.print("No. HP Baru : ");
        PNList.get(ubah).nomorHP = inp.nextLine();
        System.out.print("Fakultas Baru : ");
        PNList.get(ubah).fakultas = inp.nextLine();
        System.out.print("Prodi Baru : ");
        PNList.get(ubah).prodi = inp.nextLine();
        System.out.println("\n>> Edit Data Berhasil <<\n");
        
        return PNList;
    }
}
