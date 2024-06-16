import entity.Dog;

public class AccessModifierDemo {
    public static void main(String[] args) {
        // public: Có thể truy cập được mọi nơi
        Dog dog1 = new Dog();
        dog1.age = 3;
        System.out.println("dog1.age = " + dog1.age);
        // protected: có thể truy cập trong package
        // default: có thể truy cập được trong cùng package (không cần viết gì)

        // private: chỉ có thể truy cập được trong class
    }
}
