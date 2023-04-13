package posttest_6_pbo;

//penerapan abstarct class
public abstract class pemesanan {
    protected String nama, fakultas, prodi, nomorHP, nim, jenis;
    protected int hargaPaket;
    protected long noPesan;

    protected pemesanan(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan,
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

    // penerapan abstract method
    protected abstract void opsi();

    protected abstract int getHargaPaket();

    protected abstract String getJenis();

    protected abstract String getNama();

    protected abstract String getFakultas();

    protected abstract String getProdi();

    protected abstract String getNomorHP();

    protected abstract String getNim();

    protected abstract long getNoPesan();

}
