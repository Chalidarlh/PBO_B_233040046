package pertemuan3;

public class mahasiswa {
    String nim;
    double ipk;
    boolean statusPerwalian;

    //ini namanya konstruktor
    public mahasiswa (String nim, double ipk, boolean statusPerwalian){
        this.nim = nim;
        this.ipk = ipk;
        this.statusPerwalian = statusPerwalian;
    }
    //sampe sini

    public void perwalian(){
        statusPerwalian=true;
    }
}
