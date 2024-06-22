import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class IOStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String path = "src/main/resources/abc.txt";
        String text = "high.score=1000";
        //dùng UF 8 để hỗ trợ tiếng việt
        byte[] bytes = text.getBytes(StandardCharsets.UTF_8);
        IOManager.writeBytes(path, bytes, true);
        IOManager.writeBytes(path, bytes, true);
        IOManager.writeBytes(path, bytes, false);

        byte[] result = IOManager.readBytes(path);
        String content = new String(result, StandardCharsets.UTF_8);
        System.out.println("content = " + content);
        // split tách phần tử thông qua dấu cách tạo thành mảng và lấy ra chỉ số 1
        System.out.println("high.score = " + content.split("=")[1]);

        Account account = new Account(1, "lam", "lam.tt", "12345a");
        IOManager.writeObject(path, account, false);

        Object saveAccount = IOManager.readObject(path);
        System.out.println(saveAccount);
//  khi  muốna ép sang kiểu dữ liệu account
        Account saveAccount1 = (Account) IOManager.readObject(path);
        System.out.println(saveAccount1);
    }
}
