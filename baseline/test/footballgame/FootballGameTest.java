package footballgame;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


/**
 * Created by twer on 07/03/15.
 */
public class FootballGameTest {

    private FootballGame footballGame;
    private Reporter reporter;

    @Before
    public void Setup() throws Exception {
        footballGame = new FootballGame();
        reporter = mock(Reporter.class);
        footballGame.add(reporter);
    }

    @Test
    public void shouldNotifyReporterOfGoal() {
        footballGame.goal("Team A");
        verify(reporter).reactToGoal("Team A");
    }
}
