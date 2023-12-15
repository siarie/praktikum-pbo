public class Mobil extends Kendaraan {
    private String nama;
    private String jenis;

    Mobil(String nama) {
        super("Mobil");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }

    Mobil(String nama, String jenis) {
        super("Mobil");
        this.nama = nama;
        this.jenis = jenis;
    }

    public void informasi() {
        System.out.printf("Nama mobil\t: %s\n", this.nama);
        System.out.printf("Jenis mobil\t: %s\n", this.jenis);
    }
}
