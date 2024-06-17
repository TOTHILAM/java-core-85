import java.time.LocalDate;

public class Group {
    int id;
    String name;
    Account creator;
    LocalDate createDate;
    Account[] accounts;

    public Group() {
    }

    public Group(String name, Account creator, Account[] accounts, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        this.accounts = accounts;
        this.createDate = createDate;
    }
    public Group(String name, Account creator, String[] userNames, LocalDate createDate) {
        this.name = name;
        this.creator = creator;
        Account[] acc = new Account[userNames.length];
        for (int i = 0; i < userNames.length ; i++) {
            Account a = new Account();
            a.username = userNames[i];
            acc[i] = a;
        }
        this.accounts = acc;
        this.createDate = createDate;
    }
}
