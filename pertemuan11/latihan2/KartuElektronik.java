package pertemuan11.latihan2;

// Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    //atribut kodeBank dan pin
    private String kodeBank;
    private String pin;

     // Konstruktor untuk menginisialisasi kode bank dan PIN
    public KartuElektronik(String kodeBank, String pin){
        super();
        this.kodeBank = kodeBank;
        this.pin=pin;
    }

     // Implementasi method otentikasi dari interface
    @Override
    public boolean otentikasi (String pinInput){
        // Mengecek apakah PIN yang dimasukkan cocok dengan PIN yang disimpan
        if (pin.equals(pinInput))
            return true;
        else
            return false;
    }

     // Implementasi method encode dari interface
    @Override
    public String encode (String pin){
        //melakukan enkripsi inputan PIN
        return null;
    }
    
}
