package footballgame;

/**
 * Created by twer on 07/03/15.
 */
public class Fans {
    private String team;

    public Fans(String team) {

        this.team = team;
    }

    public String reactToGoal(String scoringTeam) {
        return this.team.equals(scoringTeam) ? "YAY" : "BOO";
    }
}
