public class Pesawat extends Kendaraan {
    private String nama;
    private String jenis;

    Pesawat(String nama) {
        super("Pesawat");
        this.nama = nama;
        jenis = "belum teridentifikasi";
    }

    Pesawat(String nama, String jenis) {
        super("Pesawat");
        this.nama = nama;
        this.jenis = jenis;
    }

    public void informasi() {
        System.out.printf("Nama pesawat\t: %s\n", this.nama);
        System.out.printf("Jenis pesawat\t: %s\n", this.jenis);
    }
}
