import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String name;
    private String uername;
    private transient String password;
    //khi k muốn chuyển hoá thành file thì dùng 'transient', và nó xuất hiệm trong file là null

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", uername='" + uername + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Account(int id, String name, String uername, String password) {

        this.id = id;
        this.name = name;
        this.uername = uername;
        this.password = password;
    }
}
