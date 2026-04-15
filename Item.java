
public class Item {


    int itemId;
    String itemName;
    double basePrice;
    double highestBid;
    String highestBidder;
    boolean auctionActive;

    public Item(int itemId, String itemName, double basePrice) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.basePrice = basePrice;
        this.highestBid = basePrice;   
        this.highestBidder = "No one";
        this.auctionActive = false;    
    }

    
    public void startAuction() {
        auctionActive = true;
        System.out.println("Auction started for: " + itemName);
        System.out.println("Base Price: Rs." + basePrice);
        System.out.println("--------------------------------");
    }

    
    public boolean isAuctionActive() {
        return auctionActive;
    }

   
    public void updateBid(String bidderName, double bidAmount) {
        if (!auctionActive) {
            System.out.println("Sorry! Auction has ended. No bids allowed.");
        } else if (bidAmount > highestBid) {
            highestBid = bidAmount;
            highestBidder = bidderName;
            System.out.println(bidderName + " bids Rs." + bidAmount + " --> Accepted!");
        } else {
            System.out.println(bidderName + " bids Rs." + bidAmount + " --> Rejected! Bid must be higher than Rs." + highestBid);
        }
    }

    public void endAuction() {
        auctionActive = false;
        System.out.println("--------------------------------");
        System.out.println("Auction Ended for: " + itemName);
        System.out.println("Winner: " + highestBidder);
        System.out.println("Final Price: Rs." + highestBid);
        System.out.println("================================");
    }
}
