public class Main {
    public static void main(String[] args) {
        Kendaraan V;
        Pesawat pesawat = new Pesawat("Boeing 707", "Pesawat Komersial");

        V = pesawat;
        V.informasi();
        V.separator();

        Mobil mobil1 = new Mobil("Suzuki Baleno", "Sedan");
        Mobil mobil2 = new Mobil("VW Combi");

        V = mobil1;
        V.informasi();
        V.separator();

        V = mobil2;
        V.informasi();
        V.separator();
    }
}
