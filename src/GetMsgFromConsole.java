import java.util.Scanner;

public class GetMsgFromConsole {
    public static void main(String[] args){
        int currentYear = 2026;
        try{
            System.out.println(getInputFromConsole(currentYear));
        } catch (NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }

    }
    public static String getInputFromConsole(int currentYear){
        String name = System.console().readLine("Hi, name? ");
        System.out.println("hi " + name);

        String dateOfBirth = System.console().readLine("age? ");
        int age = currentYear - Integer.parseInt(dateOfBirth);
        System.out.println("age " + age);
        return "";
    }
    public static String getInputFromScanner(int currentYear){
        Scanner scanner = new Scanner(System.in);

        System.out.println("hi name? ");
        String name = scanner.nextLine();
        System.out.println("age? ");

        boolean validAge = false;
        int age = 0;
        do{
            System.out.println("write correct age? ");
            try {
                age = checkData(currentYear, scanner.nextLine());
                validAge = age < 0 ? false : true;
            }catch (NumberFormatException e){
                System.out.println("invalid format number!!, try again");
            }
        }while (!validAge);

        return "your age is " + age;
    }
    public static int checkData(int currentYear, String dateOfBirth){

        int dob = Integer.parseInt(dateOfBirth);
        int minAge = currentYear - 125;

        if((dob < minAge) || (dob > currentYear)){
            return -1;
        }
        return (currentYear - dob);

    }
}
