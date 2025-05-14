package pertemuan11.tugas;

// Kelas abstrak yang menjadi dasar semua kendaraan
public abstract class Kendaraan {
    //atribut merk dan kecepatan
    protected String merk;
    protected int kecepatan;

    // Konstruktor untuk inisialisasi atribut merk
    public Kendaraan(String merk) {
        this.merk = merk;
        this.kecepatan = 0;
    }

    // Method umum untuk semua kendaraan
    public void hidupkan() {
        System.out.println(merk + " dihidupkan.");
    }

    public void matikan() {
        System.out.println(merk + " dimatikan.");
    }

    // Method abstrak yang wajib diimplementasi oleh subclass
    public abstract void bergerak();
    public abstract void berhenti();
}

