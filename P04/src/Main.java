public class Main {
    public static void main(String[] args) {
        // Rektor
        Rektor rektor = new Rektor("Andi","999901","Manajemen",2018,2);
        rektor.view();
        rektor.viewRektor();

        System.out.println("===================================================");
        // Dekan
        Dekan dekan = new Dekan("Ahmad","999902","Teknik Mesin","TI");
        dekan.view();
        dekan.viewDekan();
        System.out.println("==================================================");

        // Kalab
        Kalab kalab = new Kalab("Indah","999903","Informatika","Database");
        kalab.view();
        kalab.viewKalab();
    }
}
