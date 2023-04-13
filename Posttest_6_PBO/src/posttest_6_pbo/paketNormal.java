package posttest_6_pbo;

import java.util.ArrayList;
import java.util.Scanner;

//perenapan final class
public final class paketNormal extends pemesanan implements notif {
    // penerapan final variabel
    private final String kodePaketNormal = "PANO";
    private final int hargaPANO = 199000;
    private final String jenis = "Paket Normal";
    private long noPesan;

    public paketNormal(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan,
            int hargaPaket, String jenis) {
        super(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPaket, jenis);
    }

    paketNormal() {

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

    // override method dari interface notif
    public void notifKeluar() {
        System.err.println("\n!! Anda Telah Keluar dari Program !!\n");
    }

    // override method dari interface notif
    public void notifError() {
        System.err.println("\n!! Pilihan Tidak Tersedia !!\n");
    }

    paketNormal PANO;
    ArrayList<paketNormal> PNList = new ArrayList<>();
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
        PANO = new paketNormal(nama, nim, fakultas, prodi, nomorHP, noPesan, hargaPANO, jenis);
        PNList.add(PANO);
        System.out.println("\n>> Tambah Data Berhasil <<");
    }

    protected final void tampilPesan() {
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

    protected final void hapusPesanan() {
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

    protected final ArrayList<paketNormal> ubahPesanan(ArrayList<paketNormal> PNlist) {
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