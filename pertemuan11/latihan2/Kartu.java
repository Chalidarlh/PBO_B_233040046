package pertemuan11.latihan2;

// Interface Kartu mendefinisikan dua method yang harus diimplementasikan oleh kelas yang mengimplementasinya
public interface Kartu {
     // Method untuk otentikasi PIN
    public boolean otentikasi (String pin);

    // Method untuk mengenkripsi (encode) PIN
    public String encode (String pin);
    
}
