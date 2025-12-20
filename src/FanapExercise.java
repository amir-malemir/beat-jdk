public class FanapExercise {
    public static void main(String[] args){
        System.out.println(decimalPlace(-3.175,3.176));
    }
    public static boolean decimalPlace(double first, double second){
        long firstRounded = (long) first * 1000;
        long secondRounded = (long) second * 1000;
        return firstRounded == secondRounded;
    }


}
