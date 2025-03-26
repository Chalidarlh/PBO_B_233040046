package pertemuan7;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai (Mahasiswa mahasiswa){
        super();
        this.mahasiswa = mahasiswa;

        kartuHasilStudi = new ArrayList<KartuHasilStudi>();
        tglCetak = new Date(System.currentTimeMillis());
    }

    public void hitungIPK(){
        double totalIPS = 0;
        int totalSemester = 0;

        for(KartuHasilStudi khs : kartuHasilStudi){
            khs.hitungIPS();
            totalIPS += khs.getIPS();
            totalSemester += 1;
        }
        if(totalSemester>0){
            ipk = totalIPS/totalSemester;
        }
    }

    public void addKHS (KartuHasilStudi khs){
        kartuHasilStudi.add(khs);
    }

    public void display(){
        hitungIPK();
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: "+ tglCetak.toString());
        System.out.println("IPK: "+ipk);
        for (KartuHasilStudi khs : kartuHasilStudi){
            System.out.println("Semester: " + khs.getSemester());
            System.out.println(khs.display());
        }
    }

    public void setTglCetak (Date tglCetak){
        this.tglCetak = tglCetak;
    }

    public Date getTglCetak(){
        return tglCetak;
    }

    public void setIPK (double ipk){
        this.ipk = ipk;
    }

    public double getIPK(){
        return ipk;
    }

    public void setKartuHasilStudi (List<KartuHasilStudi> kartuHasilStudi){
        this.kartuHasilStudi = kartuHasilStudi;
    }

    public List<KartuHasilStudi> getKHS(){
        return kartuHasilStudi;
    }
}
