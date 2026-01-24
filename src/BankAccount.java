public class BankAccount {
    private double wallet;

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        if (wallet < 0) {
            System.out.println("invalid!, try again ");
        }
        this.wallet = wallet;
    }
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setWallet(5);
        System.out.println(account.getWallet());
        account.setWallet(-100);
    }
}

