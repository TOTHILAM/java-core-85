public class InheritanceDemo {
    // kế thừa

    public static void main(String[] args) {
        //mục đích: tái sử dụng code
        // từ khoá: extends
        // đơn kế thừa
        Dog dog = new Dog( 3, "milu");
        dog.run();
        // this: tham chiếu đến class đó
        // super: tham chiếu đến class cha
    }
}
