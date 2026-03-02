package Assignment;
 
class WalletPayment extends Payment {
    String walletId;
    String provider;
    String mobileNumber;
 
    public WalletPayment() {
        super();
        this.channel = "Wallet";
    }
 
    public WalletPayment(String walletId, String provider, String mobileNumber) {
        super();
        this.channel = "Wallet";
        this.walletId = walletId;
        this.provider = provider;
        this.mobileNumber = mobileNumber;
    }
 
    @Override
    void printReceipt() {
        System.out.println("Provider: " + provider);
        System.out.println("Wallet ID: " + walletId);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("Status: SUCCESS");
    }
}
 
 