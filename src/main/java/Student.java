import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private String hometown;
    private double score;

    public Student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào thông tin học sinh");
        System.out.println("Nhập vào tên");
        this.name = scanner.nextLine();
        System.out.println("Nhập vào địa chỉ");
        this.hometown = scanner.nextLine();
    }

    public void setScore(double score) {
        this.score = score;
    }

    public void plusScore(double value) {
        this.score += value;
    }

    public void showInfo() {
        String rank;
        if (score < 4.0) {
            rank = "yếu";
        } else if (score < 6.0) {
            rank = "trung binh";
        } else if (score < 8) {
            rank = "kha";
        } else {
            rank = "gioi";
        }
    }
}
