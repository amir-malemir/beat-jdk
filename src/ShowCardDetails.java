import java.util.logging.Logger;
public class ShowCardDetails {
    private static final Logger logger = Logger.getLogger(ShowCardDetails.class.getName());
    private int cardType;
    private double cardValue;
    private String isValid;

    public int getCardType() {
        return cardType;
    }

    public double getCardValue() {
        return cardValue;
    }

    public String getIsValid() {
        if (isValid == "v"){
            return "is Valid";
        }else {
            return "invalid card!";
        }
    }

    public void setCardType(int cardType) {
        this.cardType = cardType;
    }

    public void setCardValue(double cardValue) {
        this.cardValue = cardValue;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid;
    }

    public static void main(String[] args) {
        ShowCardDetails cardDetails = new ShowCardDetails();
        cardDetails.setCardType(1);
        logger.info("cardType = " + cardDetails.getCardType());

        cardDetails.setCardValue(100);
        logger.info("cardValue = " + cardDetails.getCardValue());

        cardDetails.setIsValid("nv");
        logger.warning("valid status = " + (cardDetails.getIsValid()));

    }
}
