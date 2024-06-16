import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        int a = random.nextInt();
        System.out.println("a = " + a);

        // 0 <= random.nextTnt(max) < max
        int b = random.nextInt(100);
        System.out.println("b = " + b);

        // min <= min + random.nextTnt(max - min + 1) <= max
        // min <= ? <= max
        int min = 100;
        int max = 999;
        int c = min + random.nextInt(max - min + 1);
        System.out.println("c = " + c);

        // Random một phần tử trong mảng
        String[] fruits = {"cam", "táo", "lê", "dứa"};
        int index = random.nextInt(fruits.length);
        System.out.println("fruit = " + fruits[index]);
    }
}
