package pratikum_3.bagian3;

public class Main {
    // Class Mesin (Composition)
    class Mesin {
        void hidupkan() {
            System.out.println("Mesin menyala.");
        }

        void matikan() {
            System.out.println("Mesin dimatikan.");
        }
    }

    // Superclass (Inheritance)
    class Kendaraan {
        void bergerak() {
            System.out.println("Kendaraan sedang bergerak.");
        }
    }

    // Subclass
    class Mobil extends Kendaraan {
        private Mesin mesin; // Composition

        public Mobil() {
            mesin = new Mesin();
        }

        void mulai() {
            mesin.hidupkan();
            System.out.println("Mobil siap digunakan.");
        }

        void berhenti() {
            mesin.matikan();
            System.out.println("Mobil berhenti.");
        }
    }


}
