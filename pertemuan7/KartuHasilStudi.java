package pertemuan7;

import java.util.List;
import java.util.ArrayList;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<MataKuliah> daftarMatakuliah;

    public KartuHasilStudi (String semester){
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<> ();
    }

    public void addMatakuliah (MataKuliah matakuliah){
        daftarMatakuliah.add(matakuliah);
    }

    public String display(){
        StringBuilder sb = new StringBuilder();
        for (MataKuliah mk : daftarMatakuliah){
            sb.append(mk.display());
            sb.append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS(){
        double totalBobot = 0;
        int totalSKS = 0;

        for(MataKuliah mk : daftarMatakuliah){
            totalBobot += mk.nilaiIndex() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        if(totalSKS > 0){
            ips = totalBobot/totalSKS;
        }else{
            ips = 0;
        }
    }

    //setter n getter
    public void setSemester(String semester){
        this.semester = semester;
    }

    public String getSemester(){
        return semester;
    }

    public void setIPS(double ips){
        this.ips = ips;
    }

    public double getIPS(){
        return ips;
    }

    public void setDaftarMatakuliah(List<MataKuliah> daftarMataKuliah){
        this.daftarMatakuliah = daftarMataKuliah;
    }

    public List<MataKuliah> getDaftarMatakuliah(){
        return daftarMatakuliah;
    }

}
