package pratikum_3.bagian5.antarmuka;

public interface Bergerak {
    // Method abstrak
    void bergerak();

    // Method default (Java 8+)
    default void berhenti() {
        System.out.println("Berhenti bergerak.");
    }

    // Method static (Java 8+)
    static void info() {
        System.out.println("Ini adalah interface Bergerak.");
    }

}
