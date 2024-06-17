import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department department;
    Position position;
    LocalDate createdDate;
    Group[] groups;

    Account() {
    }

    public Account(int id, String email, String username, String firtName, String lastName,Position position) {
        this.id = id;
        this.email = email;
        this.username = username;
        this.fullName = firtName + lastName;
        this.position = position;
        this.createdDate = LocalDate.now();
    }
}
