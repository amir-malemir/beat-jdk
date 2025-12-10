public class MainChallenge {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 8000;
        int levelCompleted = 8;
        int bonus = 200;

        int highScore = CalcScore(gameOver, score, levelCompleted, bonus);
        System.out.println("your first round" + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("your next score" +
                CalcScore(gameOver, score, levelCompleted, bonus));

    }

    public static int CalcScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;


        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            return finalScore;
        }

        return finalScore;
    }
}


