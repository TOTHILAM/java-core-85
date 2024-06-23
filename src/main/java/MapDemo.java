import java.security.Key;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {
    public static void main(String[] args) {
        Map<Character, String> map = new HashMap<>();
//        Map<Character, String> map = new LinkedHashMap<>();
//        Map<Character, String> map = new TreeMap<>();
        // thêm các cặp key value
        map.put('L', "Lam");
        map.put('L', "Lam");
        map.put('K', "Kien");
        map.put('A', "Anh");
        // lặp các phần tử. có thể thay thế bằng từ khoá 'var' cho kiểu dữ liệu
        // nếu key trùng nhau thì phần tử sau sẽ ghi đè phần tử trước
        for (Map.Entry<Character, String> pair : map.entrySet()) {
            System.out.println("Key : " + pair.getKey());
            System.out.println("Value : " + pair.getValue());
        }
        // lấy ra dựa vào key truyền vào
        System.out.println("map.get(\"L\") = " + map.get("L"));
    }
}
