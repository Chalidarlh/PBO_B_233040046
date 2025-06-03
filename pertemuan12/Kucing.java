package pertemuan12;

public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void buatSuara() {
        System.out.println("Meong!");
    }
}

