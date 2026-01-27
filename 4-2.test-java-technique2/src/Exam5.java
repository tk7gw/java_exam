public class Exam5 {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item();
        item1.setName("アナと雪の女王");
        item1.setPrice(3000);

        Item item2 = new Item();
        item2.setName("美女と野獣");
        item2.setPrice(2000);

        Item item3 = new Item();
        item3.setName("モアナと伝説の海");
        item3.setPrice(8000);

        cart.add(item1);
        cart.add(item2);
        cart.add(item3);

        System.out.println("合計値：" + cart.getTotalPrice() + "円");
        System.out.println("平均値：" + cart.getAveragePrice() + "円");

    }

}
