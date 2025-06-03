package pertemuan12;

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Kucing("Kucing Persia");
        Hewan hewan2 = new Anjing("Anjing Bulldog");

        hewan1.info();
        hewan1.buatSuara();  
        // Output: Meong!

        hewan2.info();
        hewan2.buatSuara();  
        // Output: Guk guk!
    }

}
    

