package pratikum_2.latihan.latihan_2;

public class Main {
    public static void main(String[] args) {

        // Membuat object dari class Lingkaran
        Lingkaran lingkaran1 = new Lingkaran(7);

        // Memanggil method hitungLuas()
        double luas = lingkaran1.hitungLuas();

        // Menampilkan hasil
        System.out.println("Jari-jari lingkaran: " + lingkaran1.jariJari);
        System.out.println("Luas lingkaran: " + luas);
    }
}
