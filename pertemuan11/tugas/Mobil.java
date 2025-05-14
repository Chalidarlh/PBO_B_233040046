package pertemuan11.tugas;

// Kelas Mobil adalah turunan dari Kendaraan dan juga bisa membunyikan klakson
public class Mobil extends Kendaraan implements Klaksonable {

    // Konstruktor untuk mobil
    public Mobil(String merk) {
        super(merk);  
    }

    // Implementasi method abstrak bergerak
    @Override
    public void bergerak() {
        kecepatan = 60;
        System.out.println(merk + " melaju dengan kecepatan " + kecepatan + " km/jam.");
    }

    // Implementasi method abstrak berhenti
    @Override
    public void berhenti() {
        kecepatan = 0;
        System.out.println(merk + " berhenti total.");
    }

    // Implementasi method dari interface Klaksonable
    @Override
    public void bunyiKlakson() {
        System.out.println("Mobil " + merk + " membunyikan klakson: Beep! Beep!");
    }
}

