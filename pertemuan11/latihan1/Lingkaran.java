package pertemuan11.latihan1;

// Kelas Lingkaran adalah turunan dari Bentuk
public class Lingkaran extends Bentuk {
     // Konstruktor Lingkaran yang memanggil konstruktor Bentuk dengan parameter jari-jari
    public Lingkaran (int jari2){
        super(jari2);
    }

    // Implementasi method luas untuk menghitung luas lingkaran
    @Override
    public double luas(){
        return PHI*jari2*jari2;
    }
}
