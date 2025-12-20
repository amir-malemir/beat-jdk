public class FanapExercise {
    public static void main(String[] args){
//        System.out.println(decimalPlace(-3.175,3.176));
//        System.out.println("output: " + equalSumChecker(0, 1, 2));
//        System.out.println("out: " + teenNumberChecker(1,20,27) );
        System.out.println("5ft, 8in = " + convertCM(5,8) + "cm");
        System.out.println("68in = " + convertCM(68) + "cm");
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
    public static double convertCM(int inch){
        return inch * 2.54;
    }
    public static double convertCM(int feet, int inch){
        return ((feet * 12) + inch) * 2.54;
    }


}
