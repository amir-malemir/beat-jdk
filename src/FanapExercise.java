public class FanapExercise {
    public static void main(String[] args){
//        System.out.println(decimalPlace(-3.175,3.176));
//        System.out.println("output: " + equalSumChecker(0, 1, 2));
//        System.out.println("out: " + teenNumberChecker(1,20,27) );
//        System.out.println("5ft, 8in = " + convertCM(5,8) + "cm");
//        System.out.println("68in = " + convertCM(68) + "cm");
        System.out.println("time is: " + convertMin(3945));
        System.out.println("time is: " + convertMin(65, 45));
    }
//    public static boolean decimalPlace(double first, double second){
//        long firstRounded = (long) first * 1000;
//        long secondRounded = (long) second * 1000;
//        return firstRounded == secondRounded;
//    }
//    public static boolean equalSumChecker(int first, int second, int value){
//        int sumNumbers = first + second;
//        if (sumNumbers == value) {
//            return true;
//        }
//        return false;
//        return (first + second) == value;
//    }

//    public static boolean teenNumberChecker(int first, int second, int value){
//        return first <= value && value <= second;
//    }
//    public static double convertCM(int inch){
//        return inch * 2.54;
//    }
//    public static double convertCM(int feet, int inch){
//        return ((feet * 12) + inch) * 2.54;
//    }

    public static String convertMin(int second){
        int minutes = second / 60;
        int hours = minutes / 60;
        System.out.println("hours: " + hours );

        int remainingMinutes = minutes % 60;
        System.out.println("remaining minutes: " + remainingMinutes );

        int remainingSeconds = second % 60;
        System.out.println("remaining seconds: " + remainingSeconds );
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s" ;
    }
    public static String convertMin(int minutes, int second){
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;
        int remainingSeconds = second % 60;
        return hours + "h " + remainingMinutes + "m " + remainingSeconds + "s" ;
    }

}
