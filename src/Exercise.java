public class Exercise {
//    public static void main(String[] args){
//        mbConverter(1048);
//    }
//    public static void mbConverter(int mb){
//
//        if (mb <= 0){
//            System.out.println("Zero");
//        }
//        System.out.print("your value is " + mb / 1024 + "mb + remaining is " + mb % 1024 );
//
//
//    }
        public static void main(String[] args) {
                String inputWord = "s";
            convertToNatoWords(inputWord);
        }
        public static void convertToNatoWords(String inputWord) {
            switch (inputWord) {
                case "A":
                    System.out.println("Able");
                case "AB":
                    System.out.println("Able Baker");
                default:
                    System.out.println("Noting for show");
    }
    }
}