import java.util.Random;

public class Math {
    // phương thức để tái sử dụng code và gom nhóm logic của code
    void showPI() {
        System.out.println(3.1415);
    }

    int max(int a, int b) {
        return a > b ? a : b;
    }

    // phương thức lấy ngẫu nhiên ra một con số
    int loDe() {
        Random random = new Random();
        return random.nextInt(100);
    }

}
