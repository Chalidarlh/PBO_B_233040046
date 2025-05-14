package latihanUTS;

public class Dosen22 {
    private String nama;
    private String gelar;

    public Dosen22 (){

    }

    public Dosen22 (String nama, String gelar){
        this.nama = nama;
        this.gelar = gelar;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public String getNama () {
        return nama;
    }

    public void setGelar (String gelar){
        this.gelar = gelar;
    }

    public String getGelar () {
        return gelar;
    }

}
