package pertemuan7;

public class Mahasiswa {
    private String NRP;
    private String nama;

    public Mahasiswa (){
    }

    public  Mahasiswa (String NRP, String nama){
        super();
        this.NRP = NRP;
        this.nama = nama;
    }

    public String display(){
        return "NRP: "+ NRP+", Nama: "+ nama;
    }

    public void setNRP(String NRP) {
		this.NRP = NRP;
	}
	
	public String getNRP() {
		return NRP;
	}

    public void setNama(String nama) {
		this.nama = nama;
	}
	
	public String getNama() {
		return nama;
	}
}
