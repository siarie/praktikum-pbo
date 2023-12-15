public class Main {
    public static void main(String[] args) {
        Laptop laptopAnto = new Laptop();

        laptopAnto.pemilik = "Anto";
        laptopAnto.merk = "Asus";
        laptopAnto.ukuranLayar = 15.6;

        // menampilkan properties dari object laptop
        System.out.println(laptopAnto.pemilik);
        System.out.println(laptopAnto.merk);
        System.out.println(laptopAnto.ukuranLayar);

        // memanggil method dari object laptop
        System.out.println(laptopAnto.hidupkanLaptop());
        System.out.println(laptopAnto.matikanLaptop());
    }
}