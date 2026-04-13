package pratikum_2.latihan.latihan_4;

public class Main {
    public static void main(String[] args) {

        // Membuat object Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa();

        // Mengisi nilai atribut menggunakan setter
        mhs1.setNama("Budi Santoso");
        mhs1.setNim("23012345");

        // Mengambil dan menampilkan nilai menggunakan getter
        System.out.println("Nama Mahasiswa: " + mhs1.getNama());
        System.out.println("NIM Mahasiswa: " + mhs1.getNim());
    }
}
