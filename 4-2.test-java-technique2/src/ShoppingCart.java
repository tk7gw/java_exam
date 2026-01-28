import java.util.LinkedList;

public class ShoppingCart extends LinkedList<Item>{

    public int getTotalPrice() {
		int totalPrice = 0;
		for (Item item : this) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

    public int getAveragePrice() {
        return getTotalPrice() / this.size();
    }
}
