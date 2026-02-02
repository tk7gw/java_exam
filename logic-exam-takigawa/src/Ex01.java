public class Ex01 {
    public static void main(String[] args) {

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                int result = i * j;

                if (result < 10) {
                    System.out.print("0" + result + " ");
                } else {
                    System.out.print(result + " ");
                }
            }
            System.out.println();
        }
    }
}
