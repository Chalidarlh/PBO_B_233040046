package pertemuan13.tugas5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040046", "chalida"); 
        Mahasiswa m2 = new Mahasiswa("233040044", "nuy"); 
        Mahasiswa m3 = new Mahasiswa("233040048", "nada"); 

        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
