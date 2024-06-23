import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
//        Set<Integer> set = new HashSet<>(); // -> không lưu trữ thứ tự được thêm vào
//        Set<Integer> set = new LinkedHashSet<>(); // -> Đảm bảo lưu trữ theo đúng thứ tự
        Set<Integer> set = new TreeSet<>(); // -> là một tập hợp đã được sắp xếp
        set.add(1);
        set.add(1);
        set.add(6);
        set.add(2);
        set.add(4);
        System.out.println(set);
    }
}
