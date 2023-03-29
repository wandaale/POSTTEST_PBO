package posttest_4_pbo;

import java.util.ArrayList;
import java.util.Scanner;

public class paketNormal extends pemesanan {
    private String kodePaketNormal = "PANO";
    private long noPesan;
    private int hargaPANO = 199000;
    private String jenis = "Paket Normal";

    public paketNormal(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan,
            int hargaPaket, String jenis) {
        super(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPaket, jenis);
    }

    paketNormal() {

    }

    paketNormal PANO;
    ArrayList<paketNormal> PNList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    // OVERRIDE
    @Override
    public void opsi() {
        System.out.println();
        System.out.println("Sistem Pemesanan Foto Proses Wisuda");
        System.out.println("Menu " + jenis);
        System.out.println("1. Tambah Data Pesanan");
        System.out.println("2. Tampilkan Data Pesanan");
        System.out.println("3. Edit Data Pesanan");
        System.out.println("4. Hapus Data Pesanan");
        System.out.println("5. Kembali");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan Menu : ");
    }

    protected void tambapesan() {
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

    public void tampilPesan() {
        System.out.println("\nMenampilkan Data Pesanan\n");
        for (int i = 0; i < PNList.size(); i++) {
            System.out.println("[" + (i + 1) + "] No Pesanan : " + kodePaketNormal + PNList.get(i).getNoPesan());
            // OVERLOADING
            deskripsi("Nama Pemesan", PNList.get(i).getNama());
            deskripsi("NIM Pemesan", PNList.get(i).getNim());
            deskripsi("No.Hp", PNList.get(i).getNomorHP());
            deskripsi("Fakultas", PNList.get(i).getFakultas());
            deskripsi("Prodi", PNList.get(i).getProdi());
            deskripsi("Jenis Paket", PNList.get(i).getJenis());
            deskripsi("Harga Paket", PNList.get(i).getHargaPaket()); // JIKA DESKRIPSI STRING + INT
            System.out.println(" ");
        }
    }

    public void hapusPesanan() {
        System.out.println("\nMenghapus Data Pesanan\n");
        int hapus;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i = 0; i < PNList.size(); i++) {
            System.out.println("[" + (i + 1) + "] No Pesanan : " + kodePaketNormal + PNList.get(i).getNoPesan());
            // OVERLOADING
            deskripsi("Nama Pemesan", PNList.get(i).getNama());
            deskripsi("NIM Pemesan", PNList.get(i).getNim());
            deskripsi("No.Hp", PNList.get(i).getNomorHP());
            deskripsi("Fakultas", PNList.get(i).getFakultas());
            deskripsi("Prodi", PNList.get(i).getProdi());
            deskripsi("Jenis Paket", PNList.get(i).getJenis());
            deskripsi("Harga Paket", PNList.get(i).getHargaPaket()); // JIKA DESKRIPSI STRING + INT
            System.out.println(" ");
        }
        if (PNList.size() == 1) {
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
        for (int i = 0; i < PNList.size(); i++) {
            System.out.println("[" + (i + 1) + "] No Pesanan : " + kodePaketNormal + PNList.get(i).getNoPesan());
            // OVERLOADING
            deskripsi("Nama Pemesan", PNList.get(i).getNama());
            deskripsi("NIM Pemesan", PNList.get(i).getNim());
            deskripsi("No.Hp", PNList.get(i).getNomorHP());
            deskripsi("Fakultas", PNList.get(i).getFakultas());
            deskripsi("Prodi", PNList.get(i).getProdi());
            deskripsi("Jenis Paket", PNList.get(i).getJenis());
            deskripsi("Harga Paket", PNList.get(i).getHargaPaket()); // JIKA DESKRIPSI STRING + INT
            System.out.println(" ");
        }
        if (PNList.size() == 1) {
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
