public class Dosen {
    protected String nama, nik, jurusan;

    Dosen (String nama, String nik, String jurusan) {
        this.nama = nama;
        this.nik = nik;
        this.jurusan = jurusan;
    }

    public void view()
    {
        System.out.println("Nama\t: "+nama);
        System.out.println("Nik\t\t: "+nik);
        System.out.println("Jurusan\t: "+jurusan);
    }
}
