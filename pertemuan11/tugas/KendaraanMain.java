package pertemuan11.tugas;

public class KendaraanMain {
    public static void main(String[] args) {
        // Membuat objek mobil dan motor
        Mobil mobil = new Mobil("Honda HRV");
        Motor motor = new Motor("Honda Stylo");

        // Operasi pada mobil
        mobil.hidupkan();
        mobil.bergerak();
        mobil.bunyiKlakson();
        mobil.berhenti();
        mobil.matikan();

        System.out.println();

        // Operasi pada motor
        motor.hidupkan();
        motor.bergerak();
        motor.bunyiKlakson();
        motor.berhenti();
        motor.matikan();
    }
}
