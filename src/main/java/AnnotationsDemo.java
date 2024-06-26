public class AnnotationsDemo {
    public static void main(String[] args) {
        // Annotation: Chú thích
        // @Override nếu k có vẫn chạy bình thường, nhưng có thì sẽ hạn chế lỗi khó phát hiện
        class Dog {
            @Override
            public String toString() {
                return "Dog";
            }
        }
        Dog dog = new Dog();
        System.out.println("dog = " + dog);

        // @deprecated dùng để đánh dấu phương thức này đã bị lỗi thời, đã bị loại bỏ
        @SuppressWarnings("deprecation")
        int max = Math.max(1, 100);
        System.out.println("max = " + max);
    }
}
