public class Exam3 {
    public static void main(String[] args) {
        int item1TotalPrice = 200 * 3;
        int item2TotalPrice = 250 * 4;
        int subTotal = item1TotalPrice + item2TotalPrice;

        System.out.println("小計");
        System.out.println(subTotal + "円");

        int tax = (int) (subTotal * 0.1);
        System.out.println("消費税");
        System.out.println(tax + "円");

        int totalPrice = subTotal + tax;
        System.out.println("合計金額");
        System.out.println(totalPrice + "円");
    }
}
