public class MainChallenge {

    public static void main(String[] args){
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 8;
        int bonus = 200;

        int finalScore = score;

        CalcScore(true, 500, 12, 20);
        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }
    }
    public static void CalcScore( boolean gameOver, int score, int levelCompleted, int bonus ) {

        int finalScore = score;


        if (gameOver){
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score from method is " + finalScore);
        }
    }
        }


