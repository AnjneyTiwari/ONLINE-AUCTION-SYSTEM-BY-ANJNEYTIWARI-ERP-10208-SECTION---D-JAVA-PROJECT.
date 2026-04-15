// Bidder.java - This class stores details about a person who wants to bid

public class Bidder {

    // Attributes of the Bidder
    int bidderId;
    String bidderName;

    // Constructor - sets up the bidder when created
    public Bidder(int bidderId, String bidderName) {
        this.bidderId = bidderId;
        this.bidderName = bidderName;
    }

    // Method to place a bid on an item
    public void placeBid(Item item, double bidAmount) {
        item.updateBid(bidderName, bidAmount);
    }
}
