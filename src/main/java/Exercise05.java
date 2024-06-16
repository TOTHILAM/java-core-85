import java.time.LocalDate;
import java.util.Scanner;

public class Exercise05 {
    void question01(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 3 số nguyên.");
        System.out.println("Mời bạn nhập số thứ 1");
        int a = scanner.nextInt();
        System.out.println("Mời bạn nhập số thứ 2");
        int b = scanner.nextInt();
        System.out.println("Mời bạn nhập số thứ 3");
        int c = scanner.nextInt();
        System.out.printf("3 số nguyên la: %d, %d, %d", a, b, c);
    }
    void question02(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 2 số thực");
        System.out.println("Mời bạn nhập số thứ 1");
        float a = scanner.nextFloat();
        System.out.println("Mời bạn nhập số thứ 2");
        float b = scanner.nextFloat();
        System.out.printf("2 số thuc la: %.1f và %.1f", a, b);
    }
    void question03(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập họ và tên");
        String name = scanner.nextLine();
        System.out.println("Tên bạn là: "+name);
    }
    void question04(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập vào ngày sinh");
        System.out.println("Nhập vào ngày sinh (yyyy-MM-dd):");
        LocalDate birthday = LocalDate.parse(scanner.next());
        System.out.printf("Bạn vừa nhập vào ngày sinh: %s.%n", birthday);
    }
    void question05(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin account.");
        Account account = new Account();

        System.out.println("Nhập vào id:");
        account.id = scanner.nextInt();

        System.out.println("Nhập vào email:");
        account.email = scanner.next();

        System.out.println("Nhập vào username:");
        account.username = scanner.next();

        scanner.nextLine();
        System.out.println("Nhập vào full name:");
        account.fullName = scanner.nextLine();

        System.out.println("Nhập vào position:");
        System.out.println("1. Developer");
        System.out.println("2. Tester");
        System.out.println("3. Scrum Master");
        System.out.println("4. Project Manager");
        Position position = new Position();
        int menu = scanner.nextInt();
        if (menu == 1) {
            position.name = PositionName.DEV;
        } else if (menu == 2) {
            position.name = PositionName.TEST;
        } else if (menu == 3) {
            position.name = PositionName.SCRUM_MASTER;
        } else {
            position.name = PositionName.PM;
        }
        account.positionId = position;

        System.out.println("Bạn vừa nhập vào account có thông tin như sau:");
        System.out.printf(
                "Account[%d, %s, %s, %s, %s].%n",
                account.id, account.email, account.username,
                account.fullName, account.positionId.name
        );
    }
    void question06(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào thông tin deparment.");
        Department department = new Department();
        System.out.println("Nhập vào id:");
        department.id = scanner.nextInt();

        scanner.nextLine();
        System.out.println("Nhập vào deparmentName:");
        department.name = scanner.nextLine();
        System.out.println("Bạn vừa nhập vào deparment có thông tin như sau:");
        System.out.printf("deparmant id: %d, name: %s", department.id, department.name);
    }
    void question07(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào 1 số chẵn.");

        while (true) {
            System.out.println("Nhập vào 1 số chẵn:");
            int n = scanner.nextInt();
            if (n % 2 == 0) {
                System.out.printf("Bạn vừa nhập vào số chẵn: %d.%n", n);
                break;
            } else {
                System.out.printf("Số %d không phải là số chẵn.%n", n);
                System.out.println("Mời bạn nhập lại.");
            }
        }
    }
    void question08(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Tạo account");
            System.out.println("2. Tạo department");
            System.out.println("3. Thoát chương trình");
            System.out.println("Mời bạn chọn chức năng:");
            int menu = scanner.nextInt();
            switch (menu) {
                case 1:
                    question05();
                    break;
                case 2:
                    question06();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Mời bạn nhập lại.");
                    break;
            }
        }
    }
}
