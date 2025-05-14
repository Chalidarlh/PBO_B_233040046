package pertemuan9.tugas;

public class Kucing extends Hewan {
    private String warnaBulu;

    public Kucing (String nama, int umur, String warnaBulu){
        super(nama, umur);
        setWarnaBulu(warnaBulu);
    }

    public void setWarnaBulu (String warnaBulu){
        this.warnaBulu = warnaBulu;
    }

    public String getWarnaBulu(){
        return warnaBulu;
    }
}

