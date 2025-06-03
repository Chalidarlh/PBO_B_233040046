package pertemuan13.tugas3;

public class Counter {
    private static int instanceCount = 0;

    public Counter() {
        instanceCount++; // Setiap objek baru, nilai dihitung bertambah
    }

    public static int getInstanceCount() {
        return instanceCount; // Mengembalikan jumlah instance yang telah dibuat
    }
}
