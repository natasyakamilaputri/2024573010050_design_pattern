package pratikum_3.bagian2.latihan;

public class Main {
    public static void main(String[] args) {
        // Membuat objek motorBaru
        Motor motorBaru = new Motor();

        // Mengisi data menggunakan setter
        motorBaru.setMerk("Honda Vario");
        motorBaru.setTahun(2024);

        // Mengambil data menggunakan getter
        System.out.println("Merk Motor: " + motorBaru.getMerk());
        System.out.println("Tahun Motor: " + motorBaru.getTahun());
    }
}
