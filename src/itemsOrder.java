import java.util.ArrayList;
import java.util.List;

public class itemsOrder {
	private List<Item> orderedItems;

    public void ItemsOrder() {
        this.orderedItems = new ArrayList<>();
    }

    public void addItems(Item item) {
        orderedItems.add(item);
    }

    
    public List<Item> getOrderedItems() {
        return orderedItems;
    }
}
