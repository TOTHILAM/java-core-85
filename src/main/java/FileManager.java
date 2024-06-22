import java.io.File;
import java.io.IOException;

public class FileManager {
    // kiểm tra file có tồn tại hay không
    public static boolean exists(String path) {
        File file = new File(path);
        return file.exists();
    }

    // tạo mới file
    public static boolean createFile(String path) throws IOException {
        if (exists(path)) {
            throw new IllegalStateException("File da ton tai");
        }
        File file = new File(path);
        return file.createNewFile();
    }

    // xoá file
    public static boolean delete(String path) {
        if (!exists(path)) {
            throw new IllegalStateException("Error! File Not Exist");
        }
        File file = new File(path);
        return file.delete();
    }

    // kiểm tra có phải file
    public static boolean isFile(String path) {
        File file = new File(path);
        return file.isFile();
    }

    // kiểm tra có phải foder
    public static boolean isFoder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    // lấy ra danh sách tên file có trong thư mục
    public static String[] list(String path) {
        File file = new File(path);
        return file.list();
    }

    // tạo foder
    public static boolean mkdirs(String path) {
        File file = new File(path);
        return file.mkdirs(); //made director
    }
}
