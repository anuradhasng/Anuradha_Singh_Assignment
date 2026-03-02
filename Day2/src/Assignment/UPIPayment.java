package Assignment;
 
class UpiPayment extends Payment {
    String upiId;
    String bankName;
 
    public UpiPayment() {
        super();
        this.channel = "UPI";
    }
 
    public UpiPayment(String upiId, String bankName) {
        super();
        this.channel = "UPI";
        this.upiId = upiId;
        this.bankName = bankName;
    }
 
    @Override
    void printReceipt() {
        System.out.println("UPI ID: " + upiId);
        System.out.println("Bank: " + bankName);
        System.out.println("Status: SUCCESS");
    }
}
 