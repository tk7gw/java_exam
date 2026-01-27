import java.util.LinkedList;
import java.util.List;

public class ShoppingCart extends LinkedList<Item>{

    private List<Item> itemList;

    public int getTotalPrice() {
		int totalPrice = 0;
		for (Item item : itemList) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

    public int getAveragePrice() {
        return getTotalPrice() / itemList.size();
    }
}
