public class Ex03 {
    public static void main(String[] args) {

        int year = 2000;

        int century;

        if (year % 100 == 0) {
            century = year / 100;
        } else {
            century = year / 100 + 1;
        }

        System.out.println(year + "年は" + century + "世紀です");
    }
}
