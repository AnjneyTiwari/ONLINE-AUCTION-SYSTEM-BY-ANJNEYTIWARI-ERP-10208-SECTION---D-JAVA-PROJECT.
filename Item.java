public class Item {

    private int itemId;
    private String itemName;
    private double basePrice;
    private double highestBid;

    public Item(int itemId, String itemName, double basePrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.basePrice = basePrice;
        this.highestBid = basePrice;
    }

    public int getItemId() {
        return itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public double getHighestBid() {
        return highestBid;
    }

    public void setHighestBid(double highestBid) {
        this.highestBid = highestBid;
    }

    public void displayItem() {
        System.out.println("--------------------------------");
        System.out.println("Item ID      : " + itemId);
        System.out.println("Item Name    : " + itemName);
        System.out.println("Base Price   : ₹" + basePrice);
        System.out.println("Highest Bid  : ₹" + highestBid);
        System.out.println("--------------------------------");
    }
}
