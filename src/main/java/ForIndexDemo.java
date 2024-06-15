public class ForIndexDemo {
    public static void main(String[] args) {
        // in ra 1-->10
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // in ra số chẵn 1--> 10
        for (int i = 2; i <= 8; i += 2) {
            System.out.print(i + " ");
        }
        // in ra tu 10 --> 1
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
