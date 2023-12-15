public class BarangKeluar {
    Barang item;
    public void simpan() {
        System.out.println("Simpan barang. " + this.item.nama);
    }

    public void edit() {
        System.out.println("Edit Barang. Kode = " + this.item.kode);
    }

    public void tambah() {
        System.out.println("Tambah Barang.");
    }

    public void hapus() {
        System.out.println("Menghapus Barang.");
    }
}
