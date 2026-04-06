package pratikum_3.bagian4.latihan;

public class Main {
    public static void main(String[] args) {
        // Uji Overriding
        System.out.println("--- Demo Overriding ---");
        BangunDatar p = new Persegi(5);
        BangunDatar l = new Lingkaran(7);

        p.hitungLuas(); // Menjalankan versi Persegi
        l.hitungLuas(); // Menjalankan versi Lingkaran

        // Uji Overloading
        System.out.println("\n--- Demo Overloading ---");
        Matematika mtk = new Matematika();

        System.out.println("Tambah 2 int: " + mtk.tambah(10, 20));
        System.out.println("Tambah 3 int: " + mtk.tambah(10, 20, 30));
        System.out.println("Tambah 2 double: " + mtk.tambah(10.5, 20.5));
    }
}
