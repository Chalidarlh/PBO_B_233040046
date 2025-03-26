package pertemuan4.tugas1;

public class mainLingkaran {
    public static void main(String[] args) {
        Lingkaran l1 = new Lingkaran(5);
        Lingkaran l2 = l1;

        System.out.println("Jari-jari l1: " + l1.getJari2());
        System.out.println("Jari-jari l2: " + l2.getJari2());

       l2.setJari2(10);
        
        System.out.println("Jari-jari l1: " + l1.getJari2());
        System.out.println("Jari-jari l2: " + l2.getJari2());
    }
}
