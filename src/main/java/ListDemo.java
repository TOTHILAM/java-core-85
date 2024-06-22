import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>();

        // thêm phần tử vào cuối
        list.add("Lam");
        list.add("Lan");

        // Thêm vị trí bất kì
        list.add(1, "Kien");
        System.out.println(list);

        //kích thước
        System.out.println("list.size() = " + list.size());

        // Kiểm tra rỗng
        System.out.println("list.isEmpty() = " + list.isEmpty());

        // Kiểm tra chứ phần tử
        System.out.println("list.contains(\"K\") = " + list.contains("K"));

        // Lấy ra chỉ số của đối tượng
        System.out.println("list.indexOf(\"Kien\") = " + list.indexOf("Kien"));

        // truy cập theo chỉ sô
        System.out.println("list.get(2) = " + list.get(2));

        // xoá theo chỉ số
        list.remove(2);

        //xoá theo đối tượng
        list.remove("Kien");

        // xoá theo điều kiện
//        list.removeIf();

        //Xoá toàn bộ
        list.clear();
    }
}
