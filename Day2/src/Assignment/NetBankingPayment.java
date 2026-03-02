package Assignment;
 
class NetBankingPayment extends Payment {
    String accountNumber;
    String bankName;
    String ifsc;
 
    public NetBankingPayment() {
        super();
        this.channel = "NetBanking";
    }
 
    public NetBankingPayment(String accountNumber, String bankName, String ifsc) {
        super();
        this.channel = "NetBanking";
        this.accountNumber = accountNumber;
        this.bankName = bankName;
        this.ifsc = ifsc;
    }
 
    @Override
    void printReceipt() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account: " + accountNumber);
        System.out.println("IFSC: " + ifsc);
        System.out.println("Status: SUCCESS");
    }
}
 
 