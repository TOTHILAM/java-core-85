public class MethodDemo {
    public static void main(String[] args) {
        Math math = new Math();
        // nếu phương thức k có dữ liệu trả về thì gọi trực tiếp
        math.showPI();
        // nếu phương thức có giá trị trả về thì lưu nó vào một biết và in ra
        int max = math.max(1,5);
        System.out.println("max = " + max);
        int de = math.loDe();
        System.out.println("de = " + de);
    }
}
