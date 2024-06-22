public class FinalDemo {
    public static void main(String[] args) {
        //biến final variable, thuộc tinh final property
        // tạo hằng số (constant)
        final double PI = 3.14159;

        // final method
        // Lớp con không thể ghi đè final method của lớp cha
        Dog dog = new Dog();
        dog.eat();

        // final class
        // Đánh dấu class đó sẽ không có class con
        // contructor không thể đánh dấu final


    }
}
