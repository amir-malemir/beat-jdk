public class FanapExercise {
    public static void main(String[] args){
//        System.out.println(decimalPlace(-3.175,3.176));
        System.out.println("output: " + equalSumChecker(0, 1, 2));
    }
//    public static boolean decimalPlace(double first, double second){
//        long firstRounded = (long) first * 1000;
//        long secondRounded = (long) second * 1000;
//        return firstRounded == secondRounded;
//    }
    public static boolean equalSumChecker(int first, int second, int value){
        int sumNumbers = first + second;
        if (sumNumbers == value) {
            return true;
        }
        return false;
    }


}
