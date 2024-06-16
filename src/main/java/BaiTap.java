import java.util.Scanner;

public class BaiTap {
    public static void main(String[] args) {
        // bài tập
        // 1. nhập vào tên sau đó in ra chữ đầu tiên viết hoa
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập tên:");
        String name = scanner.nextLine();
        String a1 = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        System.out.println("a1 = " + a1);
        // 2. yêu cầu nhập vào họ và tên, đếm số từ trong tên.
        System.out.println("Mời bạn nhập họ và tên:");
        String name2 = scanner.nextLine();
        String[] arrays = name2.split(" ");
        int count = 0;
        for (String word : arrays) {
            if (!word.isEmpty()){
                count++;
            }
        }
        System.out.println("count = " + count);
    }
}
