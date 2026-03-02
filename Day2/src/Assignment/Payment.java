package Assignment;
 
abstract class Payment {
    String channel;
 
    public Payment() {
        super();
    }
 
    public Payment(String channel) {
        super();
        this.channel = channel;
    }
 
    public void pay(double amount) {
        System.out.println("Channel: " + channel);
        System.out.println("Amount: " + amount);
        printReceipt();
        System.out.println("---------------------");
    }
 
    abstract void printReceipt();
}
 