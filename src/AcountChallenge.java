import java.util.logging.Logger;
public class AcountChallenge {
    private static final Logger logger = Logger.getLogger(InstanceOf.class.getName());
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public void deposit(double amount){
        balance += amount;
        this.balance = balance;
        logger.info("Deposited "+amount);
    }
    public void withdraw(double amount){
        if (balance - amount < 0){
            logger.warning("Not enough balance");
        }else {
            balance -= amount;
            logger.info("Withdrawn "+amount);
        }
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }
    public static void main(String[] args){
        AcountChallenge amirAcc = new AcountChallenge();
        amirAcc.withdraw(600);
        amirAcc.deposit(500);
    }
}
