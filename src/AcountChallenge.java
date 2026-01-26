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
    public AcountChallenge(){
        this("123456", 5.20, "defaultName", "defaultEmail", "defaultPhone");
        logger.info("first constructor without output");
    }
    public AcountChallenge(String number, double balance, String  customerName, String email, String phone){
        logger.info("sec constructor wit output");
        setNumber(number);
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;
    }
    public AcountChallenge(String customerName, String customerEmail, String customerPhone){
        this("0000", 99.99, customerName, customerEmail, customerPhone);
        logger.info("third constructor with output");
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
//        AcountChallenge amirAcc = new AcountChallenge("12345", 500.00, "amir", "amir@gmail.com", "09195456");
        AcountChallenge amirAcc = new AcountChallenge();
//        logger.info("constractor output: " + amirAcc.getNumber());
//        logger.info("constractor output2: " + amirAcc.getBalance());

        AcountChallenge platformTeam = new AcountChallenge("platfrom", "platfrom@gmail.com", "09121234567");
        logger.warning("customerName: " + platformTeam.getCustomerName());
        logger.warning("customerEmail: " + platformTeam.getCustomerEmail());
        logger.warning("customerPhone: " + platformTeam.getCustomerPhone());
//        amirAcc.withdraw(600);
//        amirAcc.deposit(500);
    }
}
