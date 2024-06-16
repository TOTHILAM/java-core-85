import java.util.Scanner;

public class Exercise04 {
    void question04() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào tên");

        String name = scanner.nextLine();
        int length = name.length();
        for (int i = 0; i < length; i++) {
            int n = i + 1;
            int c = name.charAt(i);
            System.out.printf("Kí tự thứ %d là: %C%n", n, c);
        }
    }

    void question06() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào họ và tên");

        String s = scanner.nextLine();
        int indexOfFirtWhiteSpace = s.indexOf(' ');
        int indexOfLastWhiteSpace = s.lastIndexOf(' ');
        String firtName = s.substring(0, indexOfFirtWhiteSpace);
        String lastName = s.substring(indexOfLastWhiteSpace + 1);
        String middleName = s.substring(indexOfFirtWhiteSpace + 1, indexOfLastWhiteSpace);
        System.out.println("Họ là : " + firtName);
        System.out.println("Tên đệm là : " + middleName);
        System.out.println("Tên là : " + lastName);
    }

    int question11(String s) {
        int length = s.length();
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        return count;
    }
}
