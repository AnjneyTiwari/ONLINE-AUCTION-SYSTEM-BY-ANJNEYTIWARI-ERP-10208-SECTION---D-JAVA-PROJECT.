import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Item[] items = new Item[3];

        items[0] = new Item(101, "Laptop", 30000);
        items[1] = new Item(102, "Smart Phone", 15000);
        items[2] = new Item(103, "Gaming Headset", 5000);

        System.out.println("=================================");
        System.out.println("      ONLINE AUCTION SYSTEM");
        System.out.println("=================================");

        System.out.print("Enter Bidder ID : ");
        int bidderId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Bidder Name : ");
        String bidderName = sc.nextLine();

        Bidder bidder = new Bidder(bidderId, bidderName);

        int choice;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. View Items");
            System.out.println("2. Place Bid");
            System.out.println("3. View Bidder Details");
            System.out.println("4. Exit");
            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    for (Item item : items) {
                        item.displayItem();
                    }

                    break;

                case 2:

                    try {

                        System.out.print("Enter Item ID : ");
                        int id = sc.nextInt();

                        Item selectedItem = null;

                        for (Item item : items) {
                            if (item.getItemId() == id) {
                                selectedItem = item;
                                break;
                            }
                        }

                        if (selectedItem == null) {
                            throw new Exception("Invalid Item ID!");
                        }

                        System.out.print("Enter Bid Amount : ");
                        double amount = sc.nextDouble();

                        if (amount <= 0) {
                            throw new Exception("Bid amount cannot be negative!");
                        }

                        bidder.placeBid(selectedItem, amount);

                    } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }

                    break;

                case 3:

                    bidder.displayBidder();

                    break;

                case 4:

                    System.out.println("Thank You For Using Online Auction System.");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
