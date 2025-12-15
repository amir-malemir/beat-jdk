public class Train {
    public static void main(String[] args) {
        PosNegZero(10);
    }
    public static void PosNegZero(int number){
        if (number < 0) {
            System.out.println("negative");
        } else if (number > 0){
            System.out.println("Positive");
        } else {
            System.out.println("Zero");
        }
    }
}
