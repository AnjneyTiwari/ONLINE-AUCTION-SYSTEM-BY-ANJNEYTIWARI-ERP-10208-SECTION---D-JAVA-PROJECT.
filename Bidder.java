public class Bidder {

    private int bidderId;
    private String bidderName;
    private double bidAmount;

    public Bidder(int bidderId, String bidderName) {
        this.bidderId = bidderId;
        this.bidderName = bidderName;
        this.bidAmount = 0;
    }

    public int getBidderId() {
        return bidderId;
    }

    public String getBidderName() {
        return bidderName;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    public void placeBid(Item item, double amount) {

        if (amount > item.getHighestBid()) {
            item.setHighestBid(amount);
            bidAmount = amount;

            System.out.println("\nBid Accepted Successfully!");
        } else {
            System.out.println("\nBid Rejected!");
            System.out.println("Bid must be higher than current highest bid.");
        }
    }

    public void displayBidder() {
        System.out.println("Bidder ID   : " + bidderId);
        System.out.println("Bidder Name : " + bidderName);
        System.out.println("Bid Amount  : ₹" + bidAmount);
    }
}
