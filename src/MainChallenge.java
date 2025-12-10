public class MainChallenge {

//    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 8000;
//        int levelCompleted = 8;
//        int bonus = 200;
//
//        int highScore = CalcScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("your first round" + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//        System.out.println("your next score" +
//                CalcScore(gameOver, score, levelCompleted, bonus));
//
//    }



//    public static int CalcScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        int finalScore = score;
//
//
//        if (gameOver) {
//            finalScore += (levelCompleted * bonus);
//            return finalScore;
//        }
//
//        return finalScore;
//    }

    public static void main(String[] args){
        displayHighScorePosition("Amir", 300);
        displayHighScorePosition("Ali", 700);
        displayHighScorePosition("Mmd", 1000);
    }

    public static void displayHighScorePosition(String name, int score){


        int results = 0;
        results = calcHighScorePosition(score);
        System.out.println(name + "s stage --> " + results);
    }
    public static int calcHighScorePosition(int score){

        if (score >= 1000) {
                return 1;
        } else if (score < 1000 && score >= 500) {
            return 2;
        } else if (score < 500 && score >= 100 ) {
            return 3;
        } else {
            return  4;
        }
    }
}


