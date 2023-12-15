public class Kalab extends Dosen {
    private final String laboratorium;

    Kalab(String nama, String nik, String jurusan, String lab) {
        super(nama, nik, jurusan);
        laboratorium = lab;
    }

    public void viewKalab() {
        System.out.println("Laboratorium\t: " + laboratorium);
    }
}
