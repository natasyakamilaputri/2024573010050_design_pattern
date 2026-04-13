package pratikum_2.latihan.latihan_2;

public class Lingkaran {
    // Attribute
    double jariJari;

    // Constructor
    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    // Method untuk menghitung luas lingkaran
    public double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}
