
public class Bidder {

    int bidderId;
    String bidderName;


    public Bidder(int bidderId, String bidderName) {
        this.bidderId = bidderId;
        this.bidderName = bidderName;
    }

    public void placeBid(Item item, double bidAmount) {
        item.updateBid(bidderName, bidAmount);
    }
}
