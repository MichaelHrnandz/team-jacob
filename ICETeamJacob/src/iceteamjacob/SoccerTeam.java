import java.util.Scanner; 

public class SoccerTeam extends SportsTeam
{
    
    int numOfPlayers = 11;
    
    String roster[][] = new String[2][numOfPlayers];
    
    public SoccerTeam(String name)
    {
        this.name = name;
        this.roster = roster;
        this.wins = wins;
        this.losses = losses;
        this.winningPercent = winningPercent;
    }
    
    
    @Override
    void createTeam() {// just need to initialize, will automatically fill 2D array with chosen player names and numbers
        Scanner user = new Scanner(System.in);
        
        for(int count = 0; count < numOfPlayers; count++)
        {
            System.out.println("Please enter the jersey number of player " + (count +1));
            roster[0][count] = user.nextLine();
            System.out.println("Please enter the name of player " + (count +1));
            roster[1][count] = user.nextLine();
        }
        
        this.roster = roster;
        
        generateStats();//calls other method automatically
    }

    @Override
    void generateStats() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
      
    public String[][] getRoster() {
        return roster;
    }

    public void setRoster(String[][] roster) {
        this.roster = roster;
    }
    
}