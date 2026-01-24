public class forStatement {
    public static void main(String[] args) {
//        for (int counter = 1 ; counter <= 5; counter++) {
//            System.out.println(counter + " no ");
//        }
//        for (double rate = 2.0; rate <= 5.0; rate++) {
//            double outputRate = calcInterest(10000.0, rate);
//            if (outputRate > 300) {
//                break;
//            }
//            System.out.println(outputRate + "$");
//        }

//    public static double calcInterest(double amount, double rate) {
//        double interest = (amount * (rate / 100));
//        return interest;
//    }
//        int countIsPrime = 0;
//        for (int i = 0;countIsPrime <= 3 && i <= 1000; i++){
//            if (isPrime(i)){
//                System.out.println(i + " is " + (isPrime(i) ? "" : "not ") + "a prime");
//                countIsPrime++;
//            }
//            if (countIsPrime == 3){
//                break;
//            }
//        }
//        System.out.println(countIsPrime + " numbers");
//    }
//        public static boolean isPrime(int wholeNumber){
//
//            if(wholeNumber <= 2){
//                return(wholeNumber == 2);
//            }
//
//            for (int divisor = 2; divisor < wholeNumber; divisor++) {
//                if (wholeNumber % divisor == 0) {
//                    return false;
//                }
//            }
//            return true;
        int i = 5;
        while (i < 20){
            i++;
            boolean outputNumber = doProcess(i);
            if (outputNumber){
                System.out.println(i + " is even");
            }else {
                System.out.println(i + " is odd");
            }

        }



        }
    public static boolean doProcess(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }
}
