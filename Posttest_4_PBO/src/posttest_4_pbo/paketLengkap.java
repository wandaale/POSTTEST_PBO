package posttest_4_pbo;

import java.util.ArrayList;
import java.util.Scanner;

public class paketLengkap extends pemesanan {
    private String kodePaketLengkap = "PALE";
    private long noPesan;
    private int hargaPALE = 499000;
    private String jenis = "Paket Lengkap";

    paketLengkap(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan, int hargaPaket,
            String jenis) {
        super(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPaket, jenis);
    }

    paketLengkap() {

    }

    paketLengkap PALE;
    ArrayList<paketLengkap> PLList = new ArrayList<>();
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
        PALE = new paketLengkap(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPALE, jenis);
        PLList.add(PALE);
        System.out.println("\n>> Tambah Data Berhasil <<");
    }

    public void tampilPesan() {
        System.out.println("\nMenampilkan Data Pesanan\n");
        for (int i = 0; i < PLList.size(); i++) {
            System.out.println("[" + (i + 1) + "] No Pesanan : " + kodePaketLengkap + PLList.get(i).getNoPesan());
            // OVERLOADING
            deskripsi("Nama Pemesan", PLList.get(i).getNama());
            deskripsi("NIM Pemesan", PLList.get(i).getNim());
            deskripsi("No.Hp", PLList.get(i).getNomorHP());
            deskripsi("Fakultas", PLList.get(i).getFakultas());
            deskripsi("Prodi", PLList.get(i).getProdi());
            deskripsi("Jenis Paket", PLList.get(i).getJenis());
            deskripsi("Harga Paket", PLList.get(i).getHargaPaket()); // JIKA DESKRIPSI STRING + INT
            System.out.println(" ");
        }
    }

    public void hapusPesanan() {
        System.out.println("\nMenghapus Data Pesanan\n");
        int hapus;
        System.out.println("\nMengubah Data Pesanan\n");
        for (int i = 0; i < PLList.size(); i++) {
            System.out.println("[" + (i + 1) + "] No Pesanan : " + kodePaketLengkap + PLList.get(i).getNoPesan());
            // OVERLOADING
            deskripsi("Nama Pemesan", PLList.get(i).getNama());
            deskripsi("NIM Pemesan", PLList.get(i).getNim());
            deskripsi("No.Hp", PLList.get(i).getNomorHP());
            deskripsi("Fakultas", PLList.get(i).getFakultas());
            deskripsi("Prodi", PLList.get(i).getProdi());
            deskripsi("Jenis Paket", PLList.get(i).getJenis());
            deskripsi("Harga Paket", PLList.get(i).getHargaPaket()); // JIKA DESKRIPSI STRING + INT
            System.out.println(" ");
        }
        if (PLList.size() == 1) {
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
        for (int i = 0; i < PLList.size(); i++) {
            System.out.println("[" + (i + 1) + "] No Pesanan : " + kodePaketLengkap + PLList.get(i).getNoPesan());
            // OVERLOADING
            deskripsi("Nama Pemesan", PLList.get(i).getNama());
            deskripsi("NIM Pemesan", PLList.get(i).getNim());
            deskripsi("No.Hp", PLList.get(i).getNomorHP());
            deskripsi("Fakultas", PLList.get(i).getFakultas());
            deskripsi("Prodi", PLList.get(i).getProdi());
            deskripsi("Jenis Paket", PLList.get(i).getJenis());
            deskripsi("Harga Paket", PLList.get(i).getHargaPaket()); // JIKA DESKRIPSI STRING + INT
            System.out.println(" ");
        }
        if (PLList.size() == 1) {
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
