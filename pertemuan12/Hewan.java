package pertemuan12;

public abstract class Hewan implements Bersuara {
    protected String nama;

    public Hewan(String nama) {
        this.nama = nama;
    }

    public void info() {
        System.out.println("Saya adalah " + nama);
    }

    // Tidak implementasi buatSuara di sini, karena tetap abstrak
}
