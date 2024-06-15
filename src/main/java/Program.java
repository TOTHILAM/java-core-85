import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        // 1.department
        Department department1 = new Department();
        department1.id = 1;
        department1.name = "Giám đốc";
        System.out.println("ID phòng ban " +department1.id +" có tên là: " +department1.name);

        Department department2 = new Department();
        department2.id = 2;
        department2.name = "Thư kí";
        System.out.println("ID phòng ban " +department2.id +" có tên là: " +department2.name);

        Department department3 = new Department();
        department3.id = 3;
        department3.name = "Bảo vệ";
        System.out.println("ID phòng ban " +department3.id +" có tên là: " +department3.name);
        // 2.Position
        Position position1 = new Position();
        position1.id = 1;
        position1.name = PositionName.DEV;
        System.out.println("ID vị trí "+position1.id +" tên là: " +position1.name);

        Position position2 = new Position();
        position2.id = 2;
        position2.name = PositionName.TEST;
        System.out.println("ID vị trí "+position2.id +" tên là: " +position2.name);

        Position position3 = new Position();
        position3.id = 3;
        position3.name = PositionName.SCRUM_MASTER;
        System.out.println("ID vị trí "+position3.id +" tên là: " +position3.name);
        // 3.Account
        Account account1 = new Account();
        account1.id = 1;
        account1.email = "tolam@gmai.com";
        account1.username = "to";
        account1.fullName = "Tô Thị Lâm";
        account1.departmentId = department1;
        account1.positionId = position1;
        account1.createdDate = LocalDate.now();
        System.out.println(account1.departmentId.name);

        Account account2 = new Account();
        account2.id = 2;
        account2.email = "abc@gmai.com";
        account2.username = "abc";
        account2.fullName = "Lê Thị A";
        account2.departmentId = department2;
        account2.positionId = position2;
        account2.createdDate = LocalDate.now();
        System.out.println(account2.fullName);

        Account account3 = new Account();
        account3.id = 3;
        account3.email = "Bnguyen@gmai.com";
        account3.username = "nguyen";
        account3.fullName = "Nguyễn thị B";
        account3.departmentId = department1;
        account3.positionId = position2;
        account3.createdDate = LocalDate.now();
        System.out.println(account3.positionId.name);

        Account account4 = new Account();
        account4.id = 4;
        account4.email = "Ctran@gmai.com";
        account4.username = "tran";
        account4.fullName = "Trần Văn C";
        account4.departmentId = department2;
        account4.positionId = position1;
        account4.createdDate = LocalDate.now();
        System.out.println(account4.email);

        Account account5 = new Account();
        account5.id = 5;
        account5.email = "hoangm@gmai.com";
        account5.username = "hoang";
        account5.fullName = "Hoàng Văm M";
        account5.departmentId = department3;
        account5.positionId = position3;
        account5.createdDate = LocalDate.now();
        System.out.println(account5.username);
        // 4.group
        Group group1 = new Group();
        group1.id = 1;
        group1.name = "Java Core";
        group1.creatorId = account1;
        group1.createDate = LocalDate.of(2023, 7, 28);
        System.out.println("Tên nhóm: " + group1.name);

        Group group2 = new Group();
        group2.id = 2;
        group2.name = "Core";
        group2.creatorId = account3;
        group2.createDate = LocalDate.of(2023, 8, 20);
        System.out.println("ID người tạo nhóm: " + group2.creatorId.fullName);

        Group group3 = new Group();
        group3.id = 3;
        group3.name = "SQL";
        group3.creatorId = account4;
        group3.createDate = LocalDate.of(2024, 1, 5);
        System.out.println("Ngày tạo nhóm: " + group3.createDate);
        // 5.GroupAccount
        GroupAccount groupAccount1 = new GroupAccount();
        groupAccount1.group = group1;
        groupAccount1.accountId = account1;
        groupAccount1.joinedDate = LocalDate.of(2023, 7, 29);
        System.out.println("Nhân viên: " + groupAccount1.accountId.fullName + " đã tham gia nhóm: " + groupAccount1.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount1.joinedDate);

        GroupAccount groupAccount2 = new GroupAccount();
        groupAccount2.group = group1;
        groupAccount2.accountId = account2;
        groupAccount2.joinedDate = LocalDate.of(2023, 8, 29);
        System.out.println("Nhân viên: " + groupAccount2.accountId.fullName + " đã tham gia nhóm: " + groupAccount2.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount2.joinedDate);

        GroupAccount groupAccount3 = new GroupAccount();
        groupAccount3.group = group2;
        groupAccount3.accountId = account3;
        groupAccount3.joinedDate = LocalDate.of(2023, 8, 20);
        System.out.println("Nhân viên: " + groupAccount3.accountId.fullName + " đã tham gia nhóm: " + groupAccount3.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount3.joinedDate);

        GroupAccount groupAccount4 = new GroupAccount();
        groupAccount4.group = group2;
        groupAccount4.accountId = account1;
        groupAccount4.joinedDate = LocalDate.of(2023, 9, 1);
        System.out.println("Nhân viên: " + groupAccount4.accountId.fullName + " đã tham gia nhóm: " + groupAccount4.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount4.joinedDate);

        GroupAccount groupAccount5 = new GroupAccount();
        groupAccount5.group = group3;
        groupAccount5.accountId = account4;
        groupAccount5.joinedDate = LocalDate.of(2024, 1, 5);
        System.out.println("Nhân viên: " + groupAccount5.accountId.fullName + " đã tham gia nhóm: " + groupAccount5.group.name);
        System.out.println("Ngày tham gia nhóm: " + groupAccount5.joinedDate);
        // 6.TypeQuestion
        TypeQuestion type1 = new TypeQuestion();
        type1.id = 1;
        type1.name = TypeName.MULTIPLE_CHOICE;
        System.out.println("Loại câu hỏi: " + type1.name);

        TypeQuestion type2 = new TypeQuestion();
        type2.id = 2;
        type2.name = TypeName.ESSAY;
        System.out.println("Loại câu hỏi: " + type2.name);
        // 7.CategoryQuestion
        CategoryQuestion category1 = new CategoryQuestion();
        category1.id = 1;
        category1.name = "Java";
        System.out.println("Danh mục câu hỏi: " + category1.name);

        CategoryQuestion category2 = new CategoryQuestion();
        category2.id = 2;
        category2.name = "SQL";
        System.out.println("id Danh mục câu hỏi sql: " + category2.id);

        CategoryQuestion category3 = new CategoryQuestion();
        category3.id = 3;
        category3.name = "C++";
        System.out.println("id Danh mục câu hỏi sql: " + category3.name);
        // 8.Question
        Question question1 = new Question();
        question1.id = 1;
        question1.content = "có mấy kiểu dữ liệu số nguyên?";
        question1.categoryId = category1;
        question1.typeId = type1;
        question1.accountId = account1;
        question1.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi: " + question1.content);

        Question question2 = new Question();
        question2.id = 1;
        question2.content = "type thuộc kiểu dữ liêụ nào";
        question2.categoryId = category1;
        question2.typeId = type2;
        question2.accountId = account2;
        question2.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi: " + question2.content);

        Question question3 = new Question();
        question3.id = 1;
        question3.content = "Sql là gì";
        question3.categoryId = category2;
        question3.typeId = type1;
        question3.accountId = account3;
        question3.createDate = LocalDate.now();
        System.out.println("Nội dung câu hỏi: " + question3.content);
        // 9.Answer
        Answer answer1 = new Answer();
        answer1.id = 1;
        answer1.content = "kiểu dữ liệu số nguyên";
        answer1.questionId = question1;
        answer1.isCorrect = true;
        System.out.println("Nội dung câu trả lời: " + answer1.content);

        Answer answer2 = new Answer();
        answer2.id = 1;
        answer2.content = "char";
        answer2.questionId = question2;
        answer2.isCorrect = false;
        System.out.println("Nội dung câu trả lời: " + answer2.content);

        Answer answer3 = new Answer();
        answer3.id = 1;
        answer3.content = "là ngôn ngữ lập trình";
        answer3.questionId = question3;
        answer3.isCorrect = true;
        System.out.println("Nội dung câu hỏi: " + answer3.questionId.content);
        // 10.exam
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "VTI001";
        exam1.title = "tạo class trong Java Core";
        exam1.categoryId = category1;
        exam1.duration = 180;
        exam1.creatorID = account1;
        exam1.createDate = LocalDate.now();
        System.out.println("Tên đề thi: " + exam1.title);

        Exam exam2 = new Exam();
        exam2.id = 2;
        exam2.code = "VTI002";
        exam2.title = "tạo cơ sở dữ liệu";
        exam2.categoryId = category2;
        exam2.duration = 90;
        exam2.creatorID = account2;
        exam2.createDate = LocalDate.now();
        System.out.println("Tên đề thi: " + exam2.title);

        Exam exam3 = new Exam();
        exam3.id = 3;
        exam3.code = "VTI003";
        exam3.title = "thi đầu vào";
        exam3.categoryId = category3;
        exam3.duration = 100;
        exam3.creatorID = account3;
        exam3.createDate = LocalDate.now();
        System.out.println("Tên đề thi: " + exam1.title);
        // 11.ExamQuestion
        ExamQuestion examQuestion1 = new ExamQuestion();
        examQuestion1.examId = exam1;
        examQuestion1.questionId = question1;
        System.out.println("Mã đề thi: " + examQuestion1.examId.code + " có câu hỏi: " + examQuestion1.questionId.content);

        ExamQuestion examQuestion2 = new ExamQuestion();
        examQuestion2.examId = exam2;
        examQuestion2.questionId = question3;
        System.out.println("Mã đề thi: " + examQuestion2.examId.code + " có câu hỏi: " + examQuestion2.questionId.content);

        ExamQuestion examQuestion3 = new ExamQuestion();
        examQuestion3.examId = exam1;
        examQuestion3.questionId = question2;
        System.out.println("Mã đề thi: " + examQuestion3.examId.code + " có câu hỏi: " + examQuestion3.questionId.content);
    }
}
