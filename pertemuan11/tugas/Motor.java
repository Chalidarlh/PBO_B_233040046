package pertemuan11.tugas;

// Kelas Motor juga turunan dari Kendaraan dan bisa membunyikan klakson
public class Motor extends Kendaraan implements Klaksonable {

    // Konstruktor untuk motor
    public Motor(String merk) {
        super(merk);
    }

    // Implementasi method abstrak bergerak
    @Override
    public void bergerak() {
        kecepatan = 40;
        System.out.println(merk + " berjalan dengan kecepatan " + kecepatan + " km/jam.");
    }

    // Implementasi method abstrak berhenti
    @Override
    public void berhenti() {
        kecepatan = 0;
        System.out.println(merk + " berhenti.");
    }

    // Implementasi method dari interface Klaksonable
    @Override
    public void bunyiKlakson() {
        System.out.println("Motor " + merk + " membunyikan klakson: Tin! Tin!");
    }
}
