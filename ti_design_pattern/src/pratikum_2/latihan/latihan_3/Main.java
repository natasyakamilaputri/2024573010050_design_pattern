package pratikum_2.latihan.latihan_3;

public class Main {
    public static void main(String[] args) {

        // Membuat object
        AkunBank akun = new AkunBank(1000000);

        // Mengakses method public
        akun.tampilkanSaldo();

        // Mencoba mengakses atribut langsung (akan error)
        // System.out.println(akun.saldo);
    }
}
