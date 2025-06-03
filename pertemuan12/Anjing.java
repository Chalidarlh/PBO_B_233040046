package pertemuan12;

public class Anjing extends Hewan {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void buatSuara() {
        System.out.println("Guk guk!");
    }
}

