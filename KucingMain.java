import pertemuan9.tugas.Kucing;

public class KucingMain {
    public static void main(String[] args) {
        Kucing kcg = new Kucing("Boni", 3, "Abu-abu");
        System.out.println(kcg.getNama()+ "-"+ kcg.getUmur()+ "-"+ kcg.getWarnaBulu());
    }
}
