import java.math.BigDecimal;

public class Item {
    private String name;
    private String itemNumber;
    private Number price;
    private ItemType itemType;

    public Item(String name, String itemNumber, BigDecimal price, ItemType itemType) {
        this.name = name;
        this.itemNumber = itemNumber;
        this.price = price;
        this.itemType = itemType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public Number getPrice() {
        return price;
    }

    public void setPrice(Number price) {
        this.price = price;
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
