package pertemuan10;

public abstract class Hewan {
    abstract void sound(); // Metode abstrak

    void eat() { // Metode konkret
        System.out.println("Eating...");
    }

}
