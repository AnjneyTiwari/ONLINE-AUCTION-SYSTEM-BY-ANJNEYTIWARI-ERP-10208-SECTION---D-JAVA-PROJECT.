// Class representing a bidder
public class Bidder {

    // Data members
    private int bidderId;
    private String bidderName;
    private double bidAmount;

    // Constructor to initialize bidder details
    public Bidder(int bidderId, String bidderName) {

        this.bidderId = bidderId;
        this.bidderName = bidderName;

        // No bid placed initially
        this.bidAmount = 0;
    }

    // Getter methods
    public int getBidderId() {
        return bidderId;
    }

    public String getBidderName() {
        return bidderName;
    }

    public double getBidAmount() {
        return bidAmount;
    }

    // Method to place bid on an item
    public void placeBid(Item item, double amount) {

        // Check whether bid is greater than current highest bid
        if (amount > item.getHighestBid()) {

            // Update highest bid
            item.setHighestBid(amount);

            // Store bidder name as winner
            item.setHighestBidder(bidderName);

            // Store bidder's last bid amount
            bidAmount = amount;

            System.out.println("\nBid Accepted Successfully!");

        } else {

            System.out.println("\nBid Rejected!");
            System.out.println("Bid must be higher than current highest bid.");
        }
    }

    // Display bidder details
    public void displayBidder() {

        System.out.println("\n===== BIDDER DETAILS =====");
        System.out.println("Bidder ID   : " + bidderId);
        System.out.println("Bidder Name : " + bidderName);
        System.out.println("Last Bid    : ₹" + bidAmount);
    }
}
