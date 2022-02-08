public class LineItem {
    private Item item;
    private Number quantity;

    public LineItem(Item item, Number quantity) {
        this.item = item;
        this.quantity = quantity;
    }

    public LineItem(Item item) {
        this.item = item;
        this.quantity = 1;
    }
}
