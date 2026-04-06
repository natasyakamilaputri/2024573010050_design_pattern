package pratikum_3.bagian5;

interface Terbang {
    void terbang();
}
// abstract class
abstract class Hewan {
    String nama;

    abstract void bersuara();
    }



// Class yang mewarisi abstract class dan mengimplementasikan interface
class Burung extends Hewan implements Terbang {

    @Override
    void bersuara() {
        System.out.println("Kicau kicau!");
    }

    @Override
    public void terbang() {
        System.out.println(nama + " sedang terbang di angkasa.");
    }
}

public class Main {
    public static void main(String[] args) {
        Burung burung = new Burung();
        burung.nama = "Merpati";
        burung.bersuara();
        burung.terbang();
    }
}
