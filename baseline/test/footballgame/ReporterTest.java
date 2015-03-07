package footballgame;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 06/03/15.
 */
public class ReporterTest {
    @Test
    public void shouldReactToGoal() {
        assertEquals("GOOOAL for Team A!", new Reporter().reactToGoal("Team A"));
    }
}
