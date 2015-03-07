package footballgame;

/**
 * Created by twer on 07/03/15.
 */
public class FootballGame {
    private Reporter reporter;
    private Fans fans;

    public void add(Reporter reporter) {
        this.reporter = reporter;
    }

    public void add(Fans fans) {
        this.fans = fans;
    }

    public void goal(String scoringTeam) {
        this.reporter.reactToGoal(scoringTeam);
        this.fans.reactToGoal(scoringTeam);
    }
}
