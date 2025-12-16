public class SpeedConverter {
    public static void main(String[] args){

    convertToMile(2);
    }
    public static double convertToMile(double kilometers){
        if (kilometers < 0){
            return -1;
        }
        double miles = kilometers * 1.609344;
        return miles;
    }
}
