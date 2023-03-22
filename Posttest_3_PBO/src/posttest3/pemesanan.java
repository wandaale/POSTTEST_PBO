package posttest3;

public class pemesanan {
    public String nama, fakultas, prodi, nomorHP, nim, jenis;
    public int hargaPaket;
    protected long noPesan;

    public pemesanan(String nama, String nim, String fakultas, String prodi, String nomorHP, long noPesan, int hargaPaket, String jenis) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.nomorHP = nomorHP;
        this.noPesan = noPesan;
        this.hargaPaket = hargaPaket;
        this.jenis = jenis;
    }
    
    pemesanan(){
        
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
