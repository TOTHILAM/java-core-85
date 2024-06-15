import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Exercise03 {
    void question01(){
        Exam exam = new Exam();
        exam.code = "VTI001";
        exam.title = "Đề thi kết thúc học phần Java Core";
        exam.duration = 180;
        exam.createDate = LocalDate.now();

        Locale vn = new Locale("vi", "VN");
        DateTimeFormatter formatter = DateTimeFormatter
                .ofLocalizedDate(FormatStyle.FULL)
                .withLocale(vn);
        String formattedDate = formatter.format(exam.createDate);

        System.out.println("Mã đề thi: " + exam.code);
        System.out.println("Tên đề thi: " + exam.title);
        System.out.println("Thời gian thi: " + exam.duration + " phút");
        System.out.println("Ngày tạo đề thi: " + formattedDate);

    }
}
