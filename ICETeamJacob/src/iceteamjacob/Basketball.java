package iceteamjacob;

public class Basketball extends SportsTeam{
    
    private String name;
    private String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    
    

    @Override
    void createTeam() {// just need to initialize, will automatically fill 2D array with chosen player names and numbers
        //add code
        generateStats();//calls other method automatically
    }

    @Override
    void generateStats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
