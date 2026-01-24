import java.util.Objects;
import java.util.logging.Logger;
public class InstanceOf {
    private static final Logger logger = Logger.getLogger(InstanceOf.class.getName());


    public static void main(String[] args) {
        processOutput("test");

    }
    public static void processOutput(String userInput){
        Object obj = userInput;
        try {
            if (obj instanceof String){
                logger.info("String");
            }else if (obj instanceof Integer){
                logger.info("Integer");
            }else if (obj instanceof Double){
                logger.info("Double");
            }else if (obj instanceof Boolean){
                logger.info("Boolean");
            }
        }catch (Exception e){
            logger.warning(e.getMessage());
        }
    }
}
