package footballgame;

/**
 * Created by twer on 07/03/15.
 */
public class FootballGame {
    private Reporter reporter;

    public void add(Reporter reporter) {
        this.reporter = reporter;
    }

    public void goal(String scoringTeam) {
        this.reporter.reactToGoal(scoringTeam);
    }
}
