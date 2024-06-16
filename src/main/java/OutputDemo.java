import java.util.Locale;

public class OutputDemo {
    public static void main(String[] args) {
//        Escape character dành cho tất cả String nói chung
        //      \" --> "
        //      \' --> '
        //      \\ --> \
        //      \n --> xuống dòng
        //      t --> tab

//        System.out.print(); in không xuống dòng
        System.out.print("\"Java\" core\n");
        System.out.print("\"Java\" core\n");

//        System.out.println(); in xuống dòng
        System.out.println("\"Java\" core");
        System.out.println("\"Java\" core");

//        System.out.printf(); in theo đinh dạng
        // %d: số nguyên (byte, short, int, long)
        // %f: số thực (float, double)
        // %s: String
        // %c: kí tự (char)
        // %n: xuống dòng
        String name = "LAM";
        int age = 30;
        System.out.printf("Tên của bạn là: %s, tuổi là: %d%n", name, age);

        // Căn lề khi in ra, + căn lề phải, - căn lề trái, nếu kích thước quá thì tự mở rộng
        System.out.printf("| %8s |%n", "abc");
        System.out.printf("| %-8s |%n", "abc");
        System.out.printf("| %-8s |%n", "To Thi Lam");
        // Làm tròn số sử dụng dấu .
        System.out.printf("PI = %.3f%n", 3.1415);
        // Nhóm 3 số sử dụng dấu ,
        System.out.printf("Money = %,f%n", 1234567000.78);
        System.out.printf(Locale.JAPAN,"Money = %,f%n", 1234567000.78);
        // in hoa dùng %S, %C in hoa tất cả các kí tự trong chuỗi
        System.out.printf("Tên: %S%n", " lâm");
    }
}
