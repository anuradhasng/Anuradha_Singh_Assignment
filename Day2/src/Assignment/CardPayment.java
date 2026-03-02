package Assignment;
 
class CardPayment extends Payment {
    String cardNumber;
    String cvv;
    String expiryDate;
 
    public CardPayment() {
        super();
        this.channel = "Card";
    }
 
    public CardPayment(String cardNumber, String cvv, String expiryDate) {
        super();
        this.channel = "Card";
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }
 
    @Override
    void printReceipt() {
        System.out.println("Card Number: " + cardNumber);
        System.out.println("CVV: " + cvv);
        System.out.println("Expiry: " + expiryDate);
        System.out.println("Status: SUCCESS");
    }
}
 
 