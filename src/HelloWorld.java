public class HelloWorld {

    public static void main(String[] args){
        System.out.print("Hello world");
//        and or
        boolean is_active = false;
        if (is_active == false) {
            System.out.print("active");
        int topscore = 99;

        if (topscore < 100 && is_active == true){
            System.out.println("smaller than topscore");
        }
        if (topscore > 100 || !is_active){
            System.out.println("smaller than topscore");
        }
        String makeFun = "amir";
        boolean isPerson = makeFun == "amir" ? false : true;
        System.out.print("isPerson: " + isPerson);

        }
    }
}
