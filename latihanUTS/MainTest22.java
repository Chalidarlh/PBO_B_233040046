package latihanUTS;

public class MainTest22 {
    public static void main(String[] args) {
        //create objek dosen
        Dosen22 d1 = new Dosen22("Hendra", "IF001");
        Dosen22 d2 = new Dosen22("Wanda", "IF002");

        //create objek mahasiswa
        Mahasiswa22 m1 = new Mahasiswa22("Badu", "12303333", d1, d2);
        Mahasiswa22 m2 = new Mahasiswa22("Tuti", "12303223", d1, null);

        m1.display();
        m2.display();
    }
}
