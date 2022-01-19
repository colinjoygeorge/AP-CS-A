public class Player
{
    private String name;
    private int score;
    
    public Player(String name , int score)
    {
        this.name = name;
        this.score = score;
    }
    
    public String toString()
    {
        return name + " has gained "+ score + " in total." ;
    }
}
