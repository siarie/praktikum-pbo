public class Dekan extends Dosen {
    private final String fakultas;

    Dekan (String nama, String nik, String jurusan, String fakultas) {
        super (nama, nik, jurusan);
        this.fakultas = fakultas;
    }

    public void viewDekan() {
        System.out.println("Fakultas\t: "+ fakultas);
    }
}
