import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class I18nDemo {
    public static void main(String[] args) {
        Locale viVN = new Locale("vi", "VN");
        Locale jaJP = new Locale("ja", "JP");
        double currency = 123456.789;
        String s1 = formatCurrencyByLocal(currency, viVN);
        String s2 = formatCurrencyByLocal(currency, jaJP);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);

        LocalDate today = LocalDate.now();
        String s3 = formatDateByLocale(today, viVN);
        System.out.println("s3 = " + s3);
        String s4 = formatDateByLocale(today, jaJP);
        System.out.println("s4 = " + s4);
        String s5 = formatDateByPattern(today,"yyyy-MM-dd");
        System.out.println("s5 = " + s5);
    }
    // định dạng ngày tháng chuẩn quốc tế
    public static String formatDateByPattern(LocalDate date, String pattern){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(date);
    }
    // định dạng ngày tháng
    public static String formatDateByLocale(LocalDate date,Locale locale){
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);
        return formatter.format(date);
    }
// định dạng số
    public static String formatCurrencyByLocal(double currency, Locale locale) {
        NumberFormat formatter = NumberFormat.getInstance(locale);
        return formatter.format(currency);
    }
}
