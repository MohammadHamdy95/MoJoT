import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<LineItem> itemInCart = new ArrayList<>();

    public void addItem(LineItem lineItem) {
        this.itemInCart.add(lineItem);
    }
}
