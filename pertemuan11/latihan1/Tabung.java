package pertemuan11.latihan1;

// Kelas Tabung adalah turunan dari Bentuk
public class Tabung extends Bentuk{
    // Atribut tinggi tabung
    private int tinggi;

     // Konstruktor default yang memanggil konstruktor Bentuk dengan jari-jari 0
    public Tabung(){
        super(0);
    }

    // Konstruktor Tabung dengan parameter jari-jari dan tinggi
    public Tabung (int jari2, int tinggi){
        super(jari2);
        this.tinggi = tinggi;
    }

    // Implementasi method luas untuk menghitung luas permukaan tabung
    @Override
    public double luas(){
        return 2*PHI*jari2*(jari2+tinggi);
    }

    //setter dan getter
    public int getTinggi(){
        return tinggi;
    }

    public void setTinggi (int tinggi){
        this.tinggi = tinggi;
    }
 
}
