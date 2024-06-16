public class ConstructorDemo {
    public static void main(String[] args) {
        // constructor: hàm khởi tạo
        // 1. không có kiểu dữ liệu trả về
        // 2. tên phải trùng với tên class
        Deparment deparment = new Deparment(1, "bảo vệ");
        System.out.println("deparment.id = " + deparment.id);
        System.out.println("deparment.name = " + deparment.name);
        // Mặc định: 0 tham số
    }
}
