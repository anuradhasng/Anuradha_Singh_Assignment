package Assignment;
 
public class MainPayment {
    public static void main(String[] args) {
        Payment p1 = new CardPayment("7111111111111235", "126", "11/27");
        Payment p2 = new UpiPayment("anuradha@upi", "ICICI Bank");
        Payment p3 = new NetBankingPayment("008765432109", "ICICI Bank", "ICIC0001234");
        Payment p4 = new WalletPayment("WAL128456", "PhoneP", "8303549870");
 
        p1.pay(149.00);
        p2.pay(250.50);
        p3.pay(8999.99);
        p4.pay(750.00);
 
        Payment p5 = new CardPayment();
        p5.pay(100.00);
    }
}
