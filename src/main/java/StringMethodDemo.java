import java.util.Scanner;

public class StringMethodDemo {
    public static void main(String[] args) {
        String s = "Java Core";
        String empty = "";
        String blank = "      ";
        String search = "   Samsung  ";
        String name = "Tô Thị Lâm";

        // viết thường
        System.out.println("s.toLowerCase() = " + s.toLowerCase());
        // viết hoa
        System.out.println("s.toUpperCase() = " + s.toUpperCase());
        // độ dài của chuỗi
        System.out.println("s.length() = " + s.length());
        // kiểm tra độ dài có phải bằng 0 không nếu đúng thì trả về true
        System.out.println("empty.isEmpty() = " + empty.isEmpty());
        // kiểm tra xem có phải toàn dấu cách không. nếu đúng thì trả về true
        System.out.println("blank.isBlank() = " + blank.isBlank());
        // lấy ra kí tự từ chỉ số
        System.out.println("s.charAt(0) = " + s.charAt(0));
        // truyền vào kí tự, và in ra index
        System.out.println("s.indexOf('a') = " + s.indexOf('a'));
        System.out.println("s.lastIndexOf('a') = " + s.lastIndexOf('a'));
        // kiểm tra xem có chuỗi đó trong đó không nếu có thì trả về true
        System.out.println("s.contains(\"Core\") = " + s.contains("Core"));
        // loại bỏ khoảng trắng đầu và cuối
        System.out.println("search.trim() = " + search.trim());
        // tách từng từ thông qua dấu cách
        String[] words = name.split(" ");
        for (String word : words) {
            System.out.println("word = " + word);
        }
        // lấy từ begin -> trước end   begin <= ... < end
        System.out.println("s.substring(0,4) = " + s.substring(0, 4));

    }
}
