
public class FootballScoreboard {

    private String teams;
    private int games;
    private int wins;
    private int loses;
    private int draws;
    private int goals;
    private int goalsAllowed;
    private int points;

    private int goalDifference = goals - goalsAllowed;


    public FootballScoreboard(){
    }
    
    public FootballScoreboard(String teams, int games, int wins, int loses, int draws, int goals, int goalsAllowed, int points){
        this.teams = teams;
        this.games = games;
        this.wins = wins;
        this.loses = loses;
        this. draws = draws;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
        this.points = points;
    }

    @Override
    public String toString(){
        return "[Team: " + teams + "| Games: " + games + "| Wins: " + wins + "| Loses: " 
        + loses + "| Draws: " + draws + "| Goals: " + goals + "| Goals Allowed: " + goalsAllowed + "| Points: " + points;
    }
   
    
    public String getTeams() {
        return teams;
    }

    public void setTeams(String teams) {
        this.teams = teams;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLoses() {
        return loses;
    }

    public void setLoses(int loses) {
        this.loses = loses;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    public void setGoalsAllowed(int goalsAllowed) {
        this.goalsAllowed = goalsAllowed;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int calculateGoalDifference(int goals, int goalsAllowed){
        return goalDifference;
    }

    public void findSmallestGoalDifference(int goals, int goalsAllowed){
        int i = 0;
        while(i < 5){
            if(i == goals - goalsAllowed){
                System.out.println("[!!!Das Team mit der geringsten Tordifferenz ist " + teams + " mit: " + (goals - goalsAllowed) + " Toren!!!]");
                break;
            }i++;
            }    
        }
}
