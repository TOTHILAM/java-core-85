public class ArithmeticOperatorDemo {
    // demo toán tử
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        // +, -, *, /, %(chia lấy dư)
        int c = 100 % 10;
        System.out.println(c);
        float d = 105f / 10;
        System.out.println("d = " + d);
        // thực hiện phép toán bên phải sau đó gán vào biến bên trái
        a = a + 10;
        // tự thực hiện với chính biến đó  thì viết tắt +=, -=, *=, /=, %=
        //
//       d = b++; b được gán và d sau đó mới tăng giá trị của bản thân
//        d = ++b; b tự tăng giá trị sau đó mới gán cho d

    }
}
