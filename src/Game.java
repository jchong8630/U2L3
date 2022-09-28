public class Game
{
    private int players;
    private int score;
    private boolean gameOver;

    public Game()
    {
        players = 1;
        score = 0;
        gameOver = false;
    }

    public int getPlayers()
    {
        return players;
    }

    /** Add the getScore() "getter" method here */
    public int getScore()
    {
        return score;
    }
    /** Add the addPlayer() method here */
    /* to be completed in part (b) */
    public void addPlayer()
    {
        players ++;
    }

    /** Add the increaseScore(int increase) method here */
    /* to be completed in part (c) */
    public void increaseScore(int increase)
    {
        score += increase;
    }
    /** Add the averageScorePerPlayer() method here */
    /* to be completed in part (d) */
    public double averageScorePerPlayer()
    {
        return (double) score / players;
    }
    public void end()
    {
        gameOver = true;
    }
}
