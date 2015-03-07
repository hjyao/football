package footballgame;

/**
 * Created by twer on 07/03/15.
 */
public class FootballGame {
    private Spectator[] spectators;

    public void goal(String scoringTeam) {
        for(Spectator spectator : spectators){
            spectator.reactToGoal(scoringTeam);
        }
    }

    public void add(Spectator... spectators) {
        this.spectators = spectators;
    }
}
