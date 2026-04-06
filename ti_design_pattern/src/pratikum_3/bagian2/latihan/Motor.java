package pratikum_3.bagian2.latihan;

public class Motor {
    // 1. Atribut yang dienkapsulasi (menggunakan private)
    private String merk;
    private int tahun;

    // 2. Getter untuk atribut merk
    public String getMerk() {
        return merk;
    }

    // Setter untuk atribut merk
    public void setMerk(String merk) {
        this.merk = merk;
    }

    // Getter untuk atribut tahun
    public int getTahun() {
        return tahun;
    }

    // Setter untuk atribut tahun
    public void setTahun(int tahun) {
        this.tahun = tahun;
    }
}
