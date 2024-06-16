public class WrapperClassDemo {
    public static void main(String[] args) {
        // byte      ->      Byte
        // short     ->      Short
        // int       ->      Integer
        // long      ->      Long
        // float     ->      Float
        // double    ->      Double
        // boolean   ->      Boolean
        // char      ->      Character
        String s1 = new String("1");
        String s2 = new String("1");
        System.out.println(s1 == s2); // sai
        System.out.println(s1.equals(s2)); //đúng

        // boxing đóng hộp chuyển primitive -> wrapperclass
        Integer a = Integer.valueOf(100);
        // unboxing mở hộp  wrapperclass -> primitive
        int b = a.intValue();
        // bài toán String sang number
        int c = Integer.parseInt("123");
        System.out.println(c + 1000);
        System.out.println("123" + 1000);
    }
}
