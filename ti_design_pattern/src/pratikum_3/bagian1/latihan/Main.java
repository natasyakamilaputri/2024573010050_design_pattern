package pratikum_3.bagian1.latihan;

public class Main {
    public static void main(String[] args) {

        // Membuat objek
        Buku buku1 = new Buku("Laskar Pelangi", "Andrea Hirata", 2005);

        // Menampilkan informasi awal
        System.out.println("Data Buku:");
        buku1.tampilkanInfo();

        // Update data
        buku1.setJudul("Sang Pemimpi");
        buku1.setPenulis("Andrea Hirata");
        buku1.setTahunTerbit(2006);

        // Menampilkan setelah update
        System.out.println("\nSetelah diubah:");
        buku1.tampilkanInfo();
    }
}
