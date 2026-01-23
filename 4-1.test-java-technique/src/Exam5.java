import java.time.LocalDate;

public class Exam5 {
    public static void main(String[] args) {
        
        LocalDate localDate = LocalDate.of(2001, 7, 17);
        int year = localDate.getYear();
        int month = localDate.getMonthValue();
        int dayOfMonth = localDate.getDayOfMonth();

        System.out.println("私の誕生日は" + year + "年" + month + "月" + dayOfMonth + "日です");
    }

}
