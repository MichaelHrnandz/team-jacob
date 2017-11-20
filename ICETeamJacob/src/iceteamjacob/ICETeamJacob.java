import java.util.Scanner;

public class ICETeamJacob
{
    public static void main(String[] args)
    {
        Scanner user = new Scanner(System.in);
        String[] sports = {"Basketball", "Hockey", "Soccer" , "Football"};
        
        System.out.println("Welcome to RIPDaniel Team Manager");
        System.out.println("What type of team would you like to manage?");
        for(int count = 1; count <= sports.length; count++)
        {
            System.out.println(count + ". " + sports[count-1]); 
        }
        
        int choice = user.nextInt();
        
        System.out.println("What is the name of your team?");
        user.nextLine();
        
        String teamName = user.nextLine();
        
        switch(choice)
        {
            case 1: BasketballTeam bTeam = new BasketballTeam(teamName);
            bTeam.createTeam();
            System.out.println(bTeam.getName());
            break;
            case 2: HockeyTeam hTeam = new HockeyTeam(teamName);
            hTeam.createTeam();
            break;
            case 3: SoccerTeam sTeam = new SoccerTeam(teamName);
            sTeam.createTeam();
            break;
            case 4: FootballTeam fTeam = new FootballTeam(teamName);
            fTeam.createTeam();
            break;
        }
        
        
        
    }
    
    
}