public class Exercise {
    public static void main(String[] args){
        mbConverter(1048);
    }
    public static void mbConverter(int mb){

        if (mb <= 0){
            System.out.println("Zero");
        }
        System.out.print("your value is " + mb / 1024 + "mb + remaining is " + mb % 1024 );


    }
}