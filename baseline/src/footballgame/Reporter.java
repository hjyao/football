package footballgame;

/**
 * Created by twer on 07/03/15.
 */
public class Reporter implements Spectator{
    @Override
    public String reactToGoal(String scoringTeam) {
        return String.format("GOOOAL for %s!", scoringTeam);
    }
}
