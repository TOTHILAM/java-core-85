public class EncapsulationDemo {
    public static void main(String[] args) {
        // Tính đóng gói
        // 1. Thêm private cho tất cả thuộc tính
        // 2. Truy cập thông qua getter, setter
        Student student = new Student("Lam");
        System.out.println("student.getName() = " + student.getName());
        student.setName("Kien");
        System.out.println("student.getName() = " + student.getName());
    }
}
