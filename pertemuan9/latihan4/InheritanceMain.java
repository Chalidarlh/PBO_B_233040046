package pertemuan9.latihan4;

public class InheritanceMain {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("233040046", "Chalida", "Bandung");
        System.out.println(mhs.getNrp()+ "-"+ mhs.getNama()+ "-"+ mhs.getAlamat());
    }
    
}
