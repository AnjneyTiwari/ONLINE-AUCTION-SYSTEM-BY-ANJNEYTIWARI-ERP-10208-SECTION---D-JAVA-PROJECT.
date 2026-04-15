

public class Main {

    public static void main(String[] args) {

        
        Item laptop = new Item(1, "Laptop", 50000);

        
        Bidder bidderA = new Bidder(1, "Bidder A");
        Bidder bidderB = new Bidder(2, "Bidder B");
        Bidder bidderC = new Bidder(3, "Bidder C");

        
        laptop.startAuction();

       
        bidderA.placeBid(laptop, 52000);  
        bidderB.placeBid(laptop, 51000);  
        bidderC.placeBid(laptop, 55000);  
        bidderA.placeBid(laptop, 54000);  
        bidderB.placeBid(laptop, 60000); 

        
        laptop.endAuction();

        
        System.out.println();
        Item phone = new Item(2, "Smartphone", 20000);
        Bidder bidderX = new Bidder(4, "Ravi");
        Bidder bidderY = new Bidder(5, "Priya");

        phone.startAuction();
        bidderX.placeBid(phone, 21000);
        bidderY.placeBid(phone, 23000);
        bidderX.placeBid(phone, 22000); 
        phone.endAuction();

       
        bidderY.placeBid(phone, 25000);
    }
}