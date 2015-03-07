package footballgame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 07/03/15.
 */
public class FansTest {
    @Test
    public void shouldReactPositivelyWhenTheirTeamGoal() {
        assertEquals("YAY", new Fans("Team A").reactToGoal("Team A"));
    }

    @Test
    public void shouldReactNegativelyWhenTheOtherTeamGoal() {
        assertEquals("BOO", new Fans("Team A").reactToGoal("Team B"));
    }
}
