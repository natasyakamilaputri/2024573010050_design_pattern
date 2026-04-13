package pratikum_2.latihan.latihan_3;

public class AkunBank {
    // Attribute dengan akses private
    private double saldo;

    // Constructor
    public AkunBank(double saldo) {
        this.saldo = saldo;
    }

    // Method public untuk menampilkan saldo
    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini: " + saldo);
    }
}
