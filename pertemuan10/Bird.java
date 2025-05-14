package pertemuan10;

public class Bird extends Hewan implements Flyable {
    @Override
    public void fly(){
        System.out.println("burung terbang menggunakan sayap");
    }

    public void sound(){
        System.out.println("cwitcwit");
    }
    
}
