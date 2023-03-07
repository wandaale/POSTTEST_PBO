package sistem.pemesanan.foto.prosesi.wisuda;

import java.util.ArrayList;
import java.util.Scanner;

public class pemesanan {
    private String nama, nim;
    public String fakultas, prodi;
    protected String nomorHP;
    
    pemesanan(String nama, String nim, String fakultas, String prodi, String nomorHp){
        this.nama = nama;
        this.nim = nim;
        this.nomorHP = nomorHp;
        this.fakultas = fakultas;
        this.prodi = prodi;
    }
    
    pemesanan(){
        
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getFakultas() {
        return fakultas;
    }

    public String getProdi() {
        return prodi;
    }

    public String getNomorHP() {
        return nomorHP;
    }
    
    pemesanan pesan;
    ArrayList<pemesanan> dataPesan = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    Scanner inputint = new Scanner(System.in);
    protected void tambahPesan (){
        boolean ulang=true;
        System.out.println("\nMenambahkan Data Pesanan\n");
        System.out.print("Nama Pemesan : ");
        nama = input.nextLine();
        System.out.print("NIM Pemesan : ");
        nim = input.nextLine();
        System.out.print("No. HP : ");
        nomorHP = input.nextLine();
        System.out.print("Fakultas : ");
        fakultas = input.nextLine();
        System.out.print("Prodi : ");
        prodi = input.nextLine();
        pesan = new pemesanan(nama, nim, fakultas, prodi, nomorHP);
        dataPesan.add(pesan);
        System.out.println("\n>> Tambah Data Furniture Berhasil <<");
    }
    protected void tampilData(){
        System.out.println("\nMenampilkan Data Pesanan\n");
        for (int i=0; i<dataPesan.size(); i++){
            int j = i+1;
            System.out.println("["+j+"] Nama Pemesan : " + dataPesan.get(i).getNama());
            System.out.println("["+j+"] NIM Pemesan : " + dataPesan.get(i).getNim());
            System.out.println("["+j+"] No. HP : " + dataPesan.get(i).getNomorHP());
            System.out.println("["+j+"] Fakultas : " + dataPesan.get(i).getFakultas());
            System.out.println("["+j+"] Prodi : " + dataPesan.get(i).getProdi());
            System.out.println(" ");
        }
    }
    public void hapusData() {
        System.out.println("\nMenghapus Data Pesanane\n");
        for (int i=0; i<dataPesan.size(); i++){
            int j = i+1;
            System.out.println("["+j+"] Nama Pemesan : " + dataPesan.get(i).getNama());
            System.out.println("["+j+"] NIM Pemesan : " + dataPesan.get(i).getNim());
            System.out.println("["+j+"] No. HP : " + dataPesan.get(i).getNomorHP());
            System.out.println("["+j+"] Fakultas : " + dataPesan.get(i).getFakultas());
            System.out.println("["+j+"] Prodi : " + dataPesan.get(i).getProdi());
            System.out.println(" ");
        }
        int hapus;
        System.out.print("\nMasukkan Nomor yang ingin dihapus : ");
        hapus = inputint.nextInt();
        hapus--;
        dataPesan.remove(hapus);
        System.out.println("\n>> Hapus Data Berhasil <<\n");
    }
    public ArrayList<pemesanan> ubahData(ArrayList<pemesanan> Flist) {
        int ubah;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i=0; i<dataPesan.size(); i++){
            int j = i+1;
            System.out.println("["+j+"] Nama Pemesan : " + dataPesan.get(i).getNama());
            System.out.println("["+j+"] NIM Pemesan : " + dataPesan.get(i).getNim());
            System.out.println("["+j+"] No. HP : " + dataPesan.get(i).getNomorHP());
            System.out.println("["+j+"] Fakultas : " + dataPesan.get(i).getFakultas());
            System.out.println("["+j+"] Prodi : " + dataPesan.get(i).getProdi());
            System.out.println(" ");
        }
        if (dataPesan.size() == 1){
            ubah = 0;
        } else {
            System.out.print("\nMasukkan Nomor yang ingin diubah : ");
            ubah = inputint.nextInt();
            ubah--;
        }
        System.out.print("\nNama Baru : ");
        dataPesan.get(ubah).nama = (input.nextLine());
        System.out.print("NIM Baru : ");
        dataPesan.get(ubah).nim = input.nextLine();
        System.out.print("No. HP Baru : ");
        dataPesan.get(ubah).nomorHP = input.nextLine();
        System.out.print("Fakultas Baru : ");
        dataPesan.get(ubah).fakultas = input.nextLine();
        System.out.print("Prodi Baru : ");
        dataPesan.get(ubah).prodi = input.nextLine();
        System.out.println("\n>> Edit Data Berhasil <<\n");

        return dataPesan;
    }
}
