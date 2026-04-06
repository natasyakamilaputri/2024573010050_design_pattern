package pratikum_3.bagian4.latihan;

public class BangunDatar {
    public void hitungLuas() {
        System.out.println("Menghitung luas bangun datar...");
    }
}

// 2 & 3. Subclass Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitungLuas() {
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas);
    }
}

// 2 & 3. Subclass Lingkaran
class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r) {
        this.r = r;
    }

    @Override
    public void hitungLuas() {
        double luas = 3.14 * r * r;
        System.out.println("Luas Lingkaran: " + luas);
    }
}
