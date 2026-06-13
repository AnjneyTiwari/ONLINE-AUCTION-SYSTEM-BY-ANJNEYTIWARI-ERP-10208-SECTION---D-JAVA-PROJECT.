import java.util.Scanner;

// Main class containing program execution
public class Main {

    public static void main(String[] args) {

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Array to store auction items
        Item[] items = new Item[3];

        // Creating auction items
        items[0] = new Item(101, "Laptop", 30000);
        items[1] = new Item(102, "Smart Phone", 15000);
        items[2] = new Item(103, "Gaming Headset", 5000);

        System.out.println("=================================");
        System.out.println("      ONLINE AUCTION SYSTEM");
        System.out.println("=================================");

        // Taking bidder details
        System.out.print("Enter Bidder ID : ");
        int bidderId = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Bidder Name : ");
        String bidderName = sc.nextLine();

        // Creating bidder object
        Bidder bidder = new Bidder(bidderId, bidderName);

        int choice;

        // Menu loop
        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. View Items");
            System.out.println("2. Place Bid");
            System.out.println("3. View Bidder Details");
            System.out.println("4. View Winners");
            System.out.println("5. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                // Display all items
                case 1:

                    for (Item item : items) {
                        item.displayItem();
                    }
                    break;

                // Place bid
                case 2:

                    try {

                        System.out.print("Enter Item ID : ");
                        int id = sc.nextInt();

                        Item selectedItem = null;

                        // Search item by ID
                        for (Item item : items) {

                            if (item.getItemId() == id) {
                                selectedItem = item;
                                break;
                            }
                        }

                        // If item not found
                        if (selectedItem == null) {
                            throw new Exception("Invalid Item ID!");
                        }

                        System.out.print("Enter Bid Amount : ");
                        double amount = sc.nextDouble();

                        // Validate bid amount
                        if (amount <= 0) {
                            throw new Exception("Bid amount must be greater than zero!");
                        }

                        // Call bid method
                        bidder.placeBid(selectedItem, amount);

                    } catch (Exception e) {

                        System.out.println("Error : " + e.getMessage());
                    }

                    break;

                // Display bidder details
                case 3:

                    bidder.displayBidder();
                    break;

                // Display auction winners
                case 4:

                    System.out.println("\n===== AUCTION RESULTS =====");

                    for (Item item : items) {

                        System.out.println("--------------------------------");
                        System.out.println("Item Name    : " + item.getItemName());
                        System.out.println("Winner       : " + item.getHighestBidder());
                        System.out.println("Winning Bid  : ₹" + item.getHighestBid());
                    }

                    System.out.println("--------------------------------");
                    break;

                // Exit program
                case 5:

                    System.out.println("\nThank You For Using Online Auction System.");
                    break;

                // Invalid menu option
                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        // Close scanner
        sc.close();
    }
}
