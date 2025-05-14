package latihanUTS;

public class Dosen {
    private String nama;
    private String lulusan;
    private String golongan;

    public Dosen (){
        nama = "Ade";
        lulusan = "S2";
        golongan = "-";
    }

    public Dosen (String nama, String lulusan, String golongan){
        this.nama = nama;
        this.lulusan = lulusan;
        this.golongan = golongan;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setLulusan (String lulusan){
        this.lulusan = lulusan;
    }

    public String getLulusan(){
        return lulusan;
    }

    public void setGolongan (String golongan){
        this.golongan = golongan;
    }

    public String getGolongan(){
        return golongan;
    }
}
