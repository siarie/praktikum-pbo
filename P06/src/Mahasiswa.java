public class Mahasiswa {
    private String nama;
    private String nim;

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        if (nama == null) throw new NullPointerException("Nama tidak boleh null");
        this.nama = nama;
    }

    public void setNim(String nim) {
        if (nim == null) throw new NullPointerException("NIM tidak boleh null");
        this.nim = nim;
    }

    public void view() {
        System.out.printf("Nama\t: %s\n", this.nama);
        System.out.printf("NIM\t: %s\n", this.nim);
    }
}
