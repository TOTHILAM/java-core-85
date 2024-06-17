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
}
