package posttest_5_pbo;

import java.util.ArrayList;
import java.util.Scanner;

//perenapan final class
public final class paketLengkap extends pemesanan {
    // penerapan final variabel
    private final String kodePaketLengkap = "PALE";
    private final int hargaPALE = 499000;
    private final String jenis = "Paket Lengkap";
    private long noPesan;

    paketLengkap(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan, int hargaPaket,
            String jenis) {
        super(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPaket, jenis);
    }

    paketLengkap() {

    }

    protected int getHargaPaket() {
        return hargaPaket;
    }

    protected String getJenis() {
        return jenis;
    }

    protected String getNama() {
        return nama;
    }

    protected String getFakultas() {
        return fakultas;
    }

    protected String getProdi() {
        return prodi;
    }

    protected String getNomorHP() {
        return nomorHP;
    }

    protected String getNim() {
        return nim;
    }

    protected long getNoPesan() {
        return noPesan;
    }

    paketLengkap PALE;
    ArrayList<paketLengkap> PLList = new ArrayList<>();
    Scanner inp = new Scanner(System.in);
    Scanner inputInt = new Scanner(System.in);

    // penerapan final method & abstarct method yang di override
    @Override
    protected final void opsi() {
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

    protected final void tambapesan() {
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

    protected final void tampilPesan() {
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

    protected final void hapusPesanan() {
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

    protected final ArrayList<paketLengkap> ubahPesanan(ArrayList<paketLengkap> PLlist) {
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