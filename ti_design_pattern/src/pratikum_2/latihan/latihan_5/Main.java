package pratikum_2.latihan.latihan_5;

public class Main {
    public static void main(String[] args) {

        // Object menggunakan Default Constructor
        Barang barang1 = new Barang();
        System.out.println("Data Barang 1:");
        barang1.tampilkanData();

        System.out.println();

        // Object menggunakan Parameterized Constructor
        Barang barang2 = new Barang("Laptop", 7500000);
        System.out.println("Data Barang 2:");
        barang2.tampilkanData();
    }
}
