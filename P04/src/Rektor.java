public class Rektor extends Dosen {
    private final int thnMulai, jabatanKe;

    Rektor(String nama, String nik, String jurusan, int thnMulai, int jabatanKe) {
        super(nama, nik, jurusan);
        this.thnMulai = thnMulai;
        this.jabatanKe = jabatanKe;
    }

    //menampilkan informasi
    public void viewRektor() {
        System.out.println("Tahun mulai jabatan\t: " + this.thnMulai);
        System.out.println("Jabatan Rektor ke\t: " + this.jabatanKe);
    }
}
