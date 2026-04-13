package pratikum_2.latihan.latihan_1;

public class Main {
    public static void main(String[] args) {

        // Membuat object dari class Buku
        Buku buku1 = new Buku();

        // Mengisi nilai atribut
        buku1.judul = "Pemrograman Java";
        buku1.pengarang = "Andi";

        // Menampilkan nilai atribut
        System.out.println("Judul Buku: " + buku1.judul);
        System.out.println("Pengarang: " + buku1.pengarang);
    }
}
