package pratikum_3.bagian5.latihan;

public interface Berenang {
    void berenang(); // Secara otomatis bersifat public dan abstract
}

// 2. Membuat Abstract Class
abstract class HewanAir {
    protected String nama;

    public HewanAir(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang wajib diimplementasikan oleh subclass
    public abstract void makan();
}

// 3. Class Ikan mewarisi HewanAir dan mengimplementasikan Berenang
class Ikan extends HewanAir implements Berenang {

    public Ikan(String nama) {
        super(nama);
    }

    // 4. Implementasi method makan() dari HewanAir
    @Override
    public void makan() {
        System.out.println(nama + " sedang makan pelet atau plankton.");
    }

    // 4. Implementasi method berenang() dari interface Berenang
    @Override
    public void berenang() {
        System.out.println(nama + " berenang dengan cara menggerakkan siripnya.");
    }
}
