package posttest2pbo;

public class pemesanan {
    private String nama, fakultas, prodi, nomorHP;
    private int nim;

    public pemesanan(String nama, int nim, String fakultas, String prodi, String nomorHP) {
        this.nama = nama;
        this.nim = nim;
        this.fakultas = fakultas;
        this.prodi = prodi;
        this.nomorHP = nomorHP;
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

    public int getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setProdi(String prodi) {
        this.prodi = prodi;
    }

    public void setNomorHP(String nomorHP) {
        this.nomorHP = nomorHP;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }
}
