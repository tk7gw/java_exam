import java.time.LocalDateTime;

public class Exam6 {
    public static void main(String[] args) {

        LocalDateTime birth =
                LocalDateTime.of(1543, 2, 10, 5, 12);

        LocalDateTime after =
                birth.plusYears(1)
                     .plusMonths(2)
                     .plusDays(3)
                     .plusHours(4)
                     .plusMinutes(5);

        System.out.println("徳川家康の誕生日は" + birth + "です");
        System.out.println("1年2ヶ月3日4時間5分後は" + after + "です");
    }
}
