public abstract class SportsTeam 
{
    protected String name;
    protected int wins;
    protected int losses;
    protected double winningPercent;

    
    public String findJerseyNum(String name){
        //search through 2D array for name, then return num of that name
        String num = "";
        return num;
    }
    
    abstract void createTeam(); //will create 2D array of names and numbers of players
    abstract void generateStats();
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }
    
    public int setLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    
    public double getWinningPercent() {
        return winningPercent;
    }

    public void setWinningPercent(double winningPercent) {
        this.winningPercent = winningPercent;
    }
    

}