import java.lang.module.Configuration;
import java.util.logging.Logger;
public class ConstructorChallenge {
    private static final   Logger logger = Logger.getLogger(ConstructorChallenge.class.getName());
    private String name;
    private String creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public String getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public ConstructorChallenge(String name, String creditLimit, String email) {
        logger.warning("Constructor with 3 parameters");
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }
    public ConstructorChallenge(){
        this("mohammad", "0", "mohammad@gmail.com");
        logger.warning("Constructor with no parameters");
    }
    public ConstructorChallenge(String name, String email){
        this(name, "9999", email);

    }

    public static void main(String[] args) {
//        Constructor 3 fields
        ConstructorChallenge amirAcc = new ConstructorChallenge("amir-malehmir", "1000", "amir@gmail.com");
        logger.info("Name: | " + amirAcc.getName() + " | creditLimit: " + amirAcc.getCreditLimit() + " | email: " + amirAcc.getEmail() + " | ");
//
//        Constructor no fields
        ConstructorChallenge mohammadAcc = new ConstructorChallenge();
        logger.info("Name: | " + mohammadAcc.getName() + " | creditLimit: " + mohammadAcc.getCreditLimit() + " | email: " + mohammadAcc.getEmail() + " | ");

        //        Constructor 2 fields + 1 default field
        ConstructorChallenge hastiAcc = new ConstructorChallenge("hasti-ghobakhloo", "hasti@gmail.com");
        logger.info("Name: | " + hastiAcc.getName() + " | creditLimit: " + hastiAcc.getCreditLimit() + " | email: " + hastiAcc.getEmail() + " | ");


    }
}
