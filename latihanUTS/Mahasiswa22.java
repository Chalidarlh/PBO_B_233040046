package latihanUTS;

public class Mahasiswa22 {
    private String nama;
    private String nrp;
    private Dosen22 pembimbing1;
    private Dosen22 pembimbing2;

    public Mahasiswa22 (String nama, String nrp, Dosen22 pembimbing1, Dosen22 pembimbing2){
        this.nama = nama;
        this.nrp = nrp;
        this.pembimbing1 = pembimbing1;
        this.pembimbing2 = pembimbing2;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public String getNama (){
        return nama;
    }

    public void setNRP (String nrp){
        this.nrp = nrp;
    }

    public String getNRP (){
        return nrp;
    }

    public void setPembimbing1 (Dosen22 pembimbing1){
        this.pembimbing1 = pembimbing1;
    }

    public Dosen22 getPembimbing1 (){
        return pembimbing1;
    }

    public void setPembimbing2 (Dosen22 pembimbing2){
        this.pembimbing2 = pembimbing2;
    }

    public Dosen22 getPembimbing2 (){
        return pembimbing2;
    }

    public void display(){
    System.out.print(nrp + " - " + nama + " : ");
        if (pembimbing1 != null) {
        System.out.print("pembimbing 1 (" + pembimbing1.getGelar() + "-" + pembimbing1.getNama() + ") ");
        }
        if (pembimbing2 != null) {
        System.out.print("pembimbing 2 (" + pembimbing2.getGelar() + "-" + pembimbing2.getNama() + ")");
        }
        System.out.println();
    }

}
