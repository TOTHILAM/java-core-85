public class Exercise01 {
    void question01() {
        Department department = new Department();
        department.name = "Giám đốc";

        Account account = new Account();
        account.departmentId = department;
        if (account.departmentId == null) {
            System.out.println("Nhân viên này chưa có phòng ban");
        } else {
            System.out.println("Phòng ban của nhân viên này là: " + account.departmentId.name);
        }
    }
    void question02() {
        Group group1 = new Group();
        group1.name = "Java Core";
        Group group2 = new Group();
        group2.name = "Core";
        Group group3 = new Group();
        group3.name = "SQL";
        Group[] groups = {group1,group2};
        Account account = new Account();
        account.groups = groups;
        if (account.groups == null || account.groups.length == 0){
            System.out.println("Nhân viên này chưa có group");
        } else if (account.groups.length == 1 ||account.groups.length == 2) {
            System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
        } else if (account.groups.length == 3) {
            System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
        }else {
            System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
        }

    }
    void question03() {
        Department department = new Department();
        department.name = "Giám đốc";

        Account account = new Account();
        account.departmentId = department;
        String message = (account.departmentId == null)
                ? "Nhân viên này chưa có phòng ban"
                : "Phòng ban của nhân viên này là: " + account.departmentId.name;
        System.out.println(message);
    }
    void question04() {
        Position p1 = new Position();
        p1.name = PositionName.DEV;
        String tinNHan = (p1.name == PositionName.DEV)
                ? "Đây là developer"
                : "Người này không phải là developer";
        System.out.println(tinNHan);
    }
    void question05() {
        Account[] accounts = {new Account(), new Account()};
        Group group = new Group();
        group.accounts = accounts;
        switch (group.accounts.length) {
            case 1:
                System.out.println("Nhóm có một thành viên");
                break;
            case 2:
                System.out.println("Nhóm có hai thành viên");
                break;
            case 3:
                System.out.println("Nhóm có ba thành viên");
                break;
            default:
                System.out.println("Nhóm có nhiều thành viên");
                break;
        }
    }
    void question06() {
        Group[] groups = {new Group(), new Group()};
        Account account = new Account();
        account.groups = groups;
        switch (account.groups.length) {
            case 0:
                System.out.println("Nhân viên này chưa có group");
                break;
            case 1:
            case 2:
                System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
                break;
            case 3:
                System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
                break;
            default:
                System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
                break;
        }
    }
    void question07() {
        Position p1 = new Position();
        p1.name = PositionName.DEV;
        switch (p1.name){
            case DEV:
                System.out.println("Đây là developer");
                break;
            default:
                System.out.println("Người này không phải là developer");
                break;
        }
    }
    void question08() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.departmentId = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.departmentId = departmentB;

        Account[] accounts = {accountA, accountB};
        for (Account account : accounts){
            System.out.println("Email: " + account.email);
            System.out.println("Fullname: " + account.fullName);
            System.out.println("Departmentname: " + account.departmentId.name);
        }
    }
    void question09() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Giám đốc";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Thư kí";
        Department[] departments = {department1, department2};

        for (Department department : departments) {
            System.out.println("ID la = " + department.id);
            System.out.println("Ten la = " + department.name);
        }
    }
    void question10() {
        Department departmentA = new Department();
        departmentA.name = "Giám đốc";

        Account accountA = new Account();
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn Khoa";
        accountA.departmentId = departmentA;

        Department departmentB = new Department();
        departmentB.name = "Bảo vệ";

        Account accountB = new Account();
        accountB.email = "duy.nn@gmail.com";
        accountB.fullName = "Nguyễn Ngọc Duy";
        accountB.departmentId = departmentB;

        Account[] accounts = {accountA, accountB};
        for (int i = 0; i < accounts.length; i++){
            System.out.println("Thông tin account thứ "+ (i+1) + " là:\n"+"Email: " + accounts[i].email+"\n" +"name: " + accounts[i].fullName +"\n");
        }
    }
    void question11() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "marketing";
        Department[] departments = {department1,department2};
        for (int i= 0; i< departments.length; i++){
            System.out.println("Thông tin deparment thứ "+ (i+1) + " là:\n"+"Id: " + departments[i].id+"\n" +"Full name: " + departments[i].name);
        }
    }
    void question12() {
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Sale";

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "marketing";
        Department[] departments = {department1,department2};
        for (int i = 0; i < 2; i++){
            System.out.println("Thông tin deparment thứ "+ (i+1) + " là:\n"+"Id: " + departments[i].id+"\n" +"Full name: " + departments[i].name);
        }
    }
    void question13() {
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

        for (int i = 0; i < accounts.length; i++) {
            if (i != 1) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].departmentId.name);
                System.out.println();
            }
        }
    }
    void  question14(){
        Department departmentA = new Department();
        //departmentA.id = 1;
        departmentA.name = "Giám đốc";
        Account accountA = new Account();
        accountA.id = 1;
        accountA.email = "khoa.nv@gmail.com";
        accountA.fullName = "Nguyễn Văn A";
        accountA.departmentId = departmentA;

        Department departmentB = new Department();
        //departmentB.id = 2;
        departmentB.name = "Bảo vệ";
        Account accountB = new Account();
        accountB.id = 2;
        accountB.email = "B.nn@gmail.com";
        accountB.fullName = "Nguyễn B";
        accountB.departmentId = departmentB;

        Department departmentC = new Department();
        //departmentC.id = 3;
        departmentC.name = "Bảo vệ";
        Account accountC = new Account();
        accountC.id = 3;
        accountC.email = "C.nn@gmail.com";
        accountC.fullName = "Nguyễn C";
        accountC.departmentId = departmentC;

        Department departmentD = new Department();
        //departmentD.id = 4;
        departmentD.name = "Giám đốc";
        Account accountD = new Account();
        accountD.id = 4;
        accountD.email = "D.nv@gmail.com";
        accountD.fullName = "Nguyễn Văn D";
        accountD.departmentId = departmentD;


        Account[] accounts = {accountA, accountB, accountC, accountD};

        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].id < 3) {
                System.out.println("Thông tin account thứ " + (i + 1) + " là:");
                System.out.println("Email: " + accounts[i].email);
                System.out.println("Full name: " + accounts[i].fullName);
                System.out.println("Phòng ban: " + accounts[i].departmentId.name);
                System.out.println();
            }
        }
    }
    void question15(){
        for (int i = 0; i<=20; i+=2){
            System.out.print(i+" ");
        }
    }
}
