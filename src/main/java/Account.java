import java.time.LocalDate;

public class Account {
    int id;
    String email;
    String username;
    String fullName;
    Department departmentId;
    Position positionId;
    LocalDate createdDate;
    Group[] groups;
}
