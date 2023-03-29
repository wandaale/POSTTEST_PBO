package posttest_4_pbo;

public class pemesanan {
    public String nama, fakultas, prodi, nomorHP, nim, jenis;
    public int hargaPaket;
    protected long noPesan;

    public pemesanan(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan,
            int hargaPaket, String jenis) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.nomorHP = nomorHP;
        this.noPesan = noPesan;
        this.hargaPaket = hargaPaket;
        this.jenis = jenis;
    }

    pemesanan() {

    }

    // FUNGSI OVERLOADING PARENT
    public void deskripsi(String teks, String data) {
        System.out.println("    " + teks + ": " + data);
    }

    public void deskripsi(String teks, int data) {
        System.out.println("    " + teks + ": " + data);
    }

    // FUNGSI OVERRIDE PARENT
    public void opsi() {
        System.out.println("Sistem Pemesanan Foto Proses Wisuda");
        System.out.println("Menu");
        System.out.println("1. Tambah Data Pesanan");
        System.out.println("2. Tampilkan Data Pesanan");
        System.out.println("3. Edit Data Pesanan");
        System.out.println("4. Hapus Data Pesanan");
        System.out.println("5. Kembali");
        System.out.println("6. Exit Program");
        System.out.print("Masukan Pilihan Menu : ");
    }

    public int getHargaPaket() {
        return hargaPaket;
    }

    public String getJenis() {
        return jenis;
    }

    public String getNama() {
        return nama;
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

    public String getNim() {
        return nim;
    }

    public long getNoPesan() {
        return noPesan;
    }

}
