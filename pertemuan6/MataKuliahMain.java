package pertemuan6;

public class MataKuliahMain {
    public static void main(String[] args) {
        //create objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Alpro 1", "A", 3);
        MataKuliah mk2 = new MataKuliah("002", "Alpro 2", "BC", 3);
        MataKuliah mk3 = new MataKuliah("003", "PBO", "B", 3);

        //Tampilkan daftar matkul
        System.out.println("---DAFTAR MATAKULIAH---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        System.out.println("---Nilai IPK---");
        double totalBobot = (mk1.nilaiIndex() * mk1.sks) +
                            (mk2.nilaiIndex() * mk2.sks) +
                            (mk3.nilaiIndex() * mk3.sks);

        int totalSks = mk1.sks + mk2.sks + mk3.sks;
        double ipk = totalBobot / totalSks;
        System.out.println(ipk);
}

}
