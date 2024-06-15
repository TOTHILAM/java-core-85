import java.time.LocalDateTime;
import java.util.Locale;

public class Exercise02 {
    void question01(){
        int n = 5;
        System.out.printf("n = %d%n", n);
    }
    void question02(){
        int n = 100000000;
        System.out.printf(Locale.CHINA, "n = %,d%n", n);
    }
    void question03(){
        double a = 5.678902;
        System.out.printf("a = %.4f", a);
    }
    void question04(){
        String s = "Nguyễn Văn A";
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", s);
    }
    void question05(){
        LocalDateTime n = LocalDateTime.now();
        System.out.printf("%1$td/%1$tm/%1$tY %1$tHh:%1$tMp:%1$tSs%n",n);
    }
    void question06(){
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn A";
        accountA.departmentId = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn B";
        accountB.departmentId = departmentB;

        Account[] accounts = {accountA, accountB};

        System.out.println("+-------------------+-------------------+-------------------+");
        System.out.println("|       EMAIL       |     FULL NAME     |  DEPARTMENT NAME  |");
        System.out.println("+-------------------+-------------------+-------------------+");
        for (Account account : accounts) {
            System.out.printf("| %-17s | %-17s | %-17s |%n",
                    account.email, account.fullName, account.departmentId.name);
            System.out.println("+-------------------+-------------------+-------------------+");
        }
    }
}
