package pratikum_2.latihan.latihan_5;

public class Barang {
    // Attribute
    String namaBarang;
    double harga;

    // Default Constructor
    public Barang() {
        namaBarang = "Tidak diketahui";
        harga = 0;
    }

    // Parameterized Constructor
    public Barang(String namaBarang, double harga) {
        this.namaBarang = namaBarang;
        this.harga = harga;
    }

    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama Barang: " + namaBarang);
        System.out.println("Harga: " + harga);
    }
}

