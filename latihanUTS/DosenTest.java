package latihanUTS;

public class DosenTest {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        Dosen d2 = new Dosen("Wanda", "S2", "-");

        System.out.println("Nama: " + d1.getNama());
        System.out.println("Lulusan: " + d1.getLulusan());
        System.out.println("Golongan: " + d1.getGolongan());
        System.out.println();
        
        System.out.println("Nama: " + d2.getNama());
        System.out.println("Lulusan: " + d2.getLulusan());
        System.out.println("Golongan: " + d2.getGolongan());
    }
}
