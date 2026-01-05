public class main1 {
    public static void main(String[] args){
//        int value = 2;
//        if (value == 1){
//            System.out.println("value is 1");
//        } else if (value == 2) {
//            System.out.println("value is 2");
//        }else {
//            System.out.println("value is not 1 or 2");
//        }
//        switch (value){
//            case 1:
//                System.out.println("was 1");
//                break;
//            case 2:
//                System.out.println("was 2");
//                break;
//            default:
//                System.out.println("was not 1 || 2");
//        }
//        switch (value){
//            case 1 -> System.out.println("1");
//            case 2-> System.out.println("2");
//            default -> System.out.println("was no 1,2");
//        }
//        String month = "april";
//        switch (month){
//            case "january":
//            case "february":
//            case "march":
//                System.out.println("1st");
//                break;
//            case "april":
//            case "may":
//            case "june":
//                System.out.println("2nd");
//                break;
//            case "july":
//            case "august":
//            case "september":
//                System.out.println("3rd");
//                break;
//            case "october":
//            case "november":
//            case "december":
//                System.out.println("4st");

        System.out.println(getMonth("april"));
        }
    }
    public static String getMonth(String month){
        return switch (month){
            case "january", "february", "march" -> "1st";
            case "april", "may", "june" -> "2nd";
            case "july", "august", "september" -> "3rd";
            case "october", "november", "december" -> "4st";
            default -> "error";
        }
    }
}
