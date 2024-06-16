public class CastingDemo {
    public static void main(String[] args) {
        // ép kiểu dữ liệu
        // Widening: nới rộng ra
        // byte -> short -> int -> long -> float -> double
        int a = 1000;
        long b = a;
        System.out.println("b = " + b);

        // Narrowing thu hẹp lại
        //double -> float -> long -> int -> short -> byte
        long x = 8000000000L;
        int y = (int) x;
        System.out.println("y = " + y);
        // bài toán
        int u = 1;
        int v = 2;
        System.out.println("u/v = " + (float) u / v);
        System.out.println("u/v = " + (float) u / (float) v);
        System.out.println("u/v = " + u / (float) v);
        System.out.println("u/v = " + (float) (u / v));

    }
}
