public class PolymorphismDemo {
    public static void main(String[] args) {
        // Tính đa hình
        // instanceOf: tìm xem nó xuất phát từ một đối tượng nào ...cat hay bird
        Runnable cat = new Cat();
        callRun(cat);
        Runnable bird = new Bird();
        callRun(bird);
    }

    static void callRun(Runnable runnable) {
        if (runnable instanceof Cat) {
            System.out.println("Mèo có chạy được không?");
        } else if (runnable instanceof Bird) {
            System.out.println("Chim có chạy được không?");
        }
        runnable.run();
    }
}
