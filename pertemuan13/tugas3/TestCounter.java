package pertemuan13.tugas3;

public class TestCounter {
     public static void main(String[] args) {
        Counter c1 = new Counter(); // objek pertama
        Counter c2 = new Counter(); // objek kedua
        Counter c3 = new Counter(); // objek ketiga
        Counter c4 = new Counter(); // objek ketiga

        System.out.println("Total objek Counter yang dibuat: " + Counter.getInstanceCount());
    }
}
