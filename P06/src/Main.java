public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();

        try {
            mhs.setNama(null);
        } catch (NullPointerException err) {
            System.out.println(err.getMessage());
        }

        try {
            mhs.setNim(null);
        } catch (NullPointerException err) {
            System.out.println(err.getMessage());
        }

        try {
            mhs.setNama("Sri Aspari");
            mhs.setNim("G.131.20.0045");

            mhs.view();
        } catch (NullPointerException err) {
            System.out.println(err.getMessage());
        }
    }
}
