package pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        //Create objek dosen
        Dosen dosen1 = new Dosen("12345", "Siroj Nur Ulum, S.T., M.T.");
        Dosen dosen2 = new Dosen("12346", "Mellia Liyanthy, ST., MT.");
        Dosen dosen3 = new Dosen("12347", "Erik, ST.,M.Kom.");

        //Create  objek matakuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma dan Pemrograman 1", "A", 3, dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma dan Pemrograman 2", "BC", 3, dosen2);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen3);

        //Create objek KHS
        KartuHasilStudi khs = new KartuHasilStudi("4");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        //Create objek mahasiswa
        Mahasiswa mhs = new Mahasiswa("233040046", "kalida");

        //Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.display();
    }
}

