package pratikum_3.bagian3.latihan;

public class Laptop {
    // Komponen sebagai bagian dari Laptop
    private Processor processor;
    private RAM ram;

    // Inisialisasi melalui Constructor
    public Laptop() {
        this.processor = new Processor();
        this.ram = new RAM();
    }

    void operasikan() {
        System.out.println("Laptop dinyalakan:");
        processor.jalankan();
        ram.baca();
        ram.tulis();
    }
}

// 2. Class Processor
class Processor {
    void jalankan() {
        System.out.println("Processor sedang menjalankan instruksi...");
    }
}

// 3. Class RAM
class RAM {
    void baca() {
        System.out.println("RAM sedang membaca data...");
    }

    void tulis() {
        System.out.println("RAM sedang menulis data...");
    }
}