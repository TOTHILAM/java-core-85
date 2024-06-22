public class StaticDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Lam", 30);
        Student s2 = new Student("Lan", 20);
        s1.count = 10;
        System.out.println("s2.count = " + s2.count);

        // truy cập thông qua class
        System.out.println("Student.count = " + Student.count);
        int max = Student.max(10, 100);
        System.out.println("max = " + max);

        // Static không thể truy cập non-static
        // Non-static có thể truy cập static
    }
}
