public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i++);
            System.out.println("lam");
        } while (i <= 10);
        // chạy được ít nhất 1 lần
        // làm rồi mới kiểm tra điều kiện
    }
}
