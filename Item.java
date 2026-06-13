// Class representing an auction item
public class Item {

    // Data members
    private int itemId;
    private String itemName;
    private double basePrice;
    private double highestBid;
    private String highestBidder;

    // Constructor to initialize item details
    public Item(int itemId, String itemName, double basePrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.basePrice = basePrice;

        // Initially highest bid equals base price
        this.highestBid = basePrice;

        // No bidder at the beginning
        this.highestBidder = "No Bid Yet";
    }

    // Getter methods
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

    public String getHighestBidder() {
        return highestBidder;
    }

    // Setter methods
    public void setHighestBid(double highestBid) {
        this.highestBid = highestBid;
    }

    public void setHighestBidder(String highestBidder) {
        this.highestBidder = highestBidder;
    }

    // Method to display item details
    public void displayItem() {

        System.out.println("--------------------------------");
        System.out.println("Item ID       : " + itemId);
        System.out.println("Item Name     : " + itemName);
        System.out.println("Base Price    : ₹" + basePrice);
        System.out.println("Highest Bid   : ₹" + highestBid);
        System.out.println("Highest Bidder: " + highestBidder);
        System.out.println("--------------------------------");
    }
}
