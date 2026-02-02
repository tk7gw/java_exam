public class Ex02 {
    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        int second = 59;

        System.out.print(
            hour + " 時 " + minute + " 分 " + second + " 秒の 1 秒後は "
        );

        second++;

        if (second == 60) {
            second = 0;
            minute++;
        }

        if (minute == 60) {
            minute = 0;
            hour++;
        }

        if (hour == 24) {
            hour = 0;
        }

        System.out.println(
            hour + " 時 " + minute + " 分 " + second + " 秒です"
        );

    }

}
