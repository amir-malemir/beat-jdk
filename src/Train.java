public class Train {
    public static void main(String[] args) {
//        String inputWord = "A";
//        convertToNatoWords(inputWord);
        int dayNumber = 2;
        System.out.print(daysOfWeek(dayNumber));
    }
//    public static void convertToNatoWords(String inputWord) {
//        switch (inputWord) {
//            case "A":
//                System.out.println("Able");
//                break;
//            case "AB":
//                System.out.println("Able Baker");
//                break;
//            default:
//                System.out.println("Noting for show");
//        }
//    }
    public static String daysOfWeek(int dayNumber) {
        return switch (dayNumber){
            case 0 -> "Saturday";
            case 1 -> "sunday";
            default -> "Not Found";
        };
    }
}
