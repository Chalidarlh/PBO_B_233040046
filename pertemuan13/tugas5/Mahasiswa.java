package pertemuan13.tugas5;

public class Mahasiswa {
    // NIM bersifat final karena tidak boleh berubah setelah inisialisasi
    private final String nim;
    //Nama mahasiswa bisa berubah
    private String nama;
    // Variabel static untuk menghitung jumlah mahasiswa yang dibuat
    private static int totalMahasiswa = 0;
    // Konstanta batas maksimum SKS yang berlaku untuk semua mahasiswa
    public static final int MAX_SKS = 24;

    public Mahasiswa(String nim, String nama) {
        this.nim = nim; // Inisialisasi NIM
        this.nama = nama; // Inisialisasi nama
        totalMahasiswa++; // Menambah jumlah mahasiswa setiap objek dibuat
    }

    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Max SKS : " + MAX_SKS);
        System.out.println();
    }

    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}
