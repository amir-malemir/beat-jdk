public class main {
    public static void main(String[] args){
        int value = 2;
//        if (value == 1){
//            System.out.println("value is 1");
//        } else if (value == 2) {
//            System.out.println("value is 2");
//        }else {
//            System.out.println("value is not 1 or 2");
//        }
        switch (value){
            case 1:
                System.out.println("was 1");
                break;
            case 2:
                System.out.println("was 2");
                break;
            default:
                System.out.println("was not 1 || 2");
        }

    }
}
