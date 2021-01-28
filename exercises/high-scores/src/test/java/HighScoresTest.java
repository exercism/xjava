import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class HighScoresTest {

    @Test
    public void shouldDisplayListOfHighScores() {
        HighScores highScores = new HighScores(new int[] { 30, 50, 20, 70 });
        assertArrayEquals(new int[] { 30, 50, 20, 70 }, highScores.scores());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldDisplayLatestAddedScore() {
        HighScores highScores = new HighScores(new int[]{ 100, 0, 90, 30 });
        assertEquals(30, highScores.latest());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldDisplayPersonalBest() {
        HighScores highScores = new HighScores(new int[] { 40, 100, 70 });
        assertEquals(100, highScores.personalBest());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldReturnTopThreePersonalBestFromListOfScores() {
        HighScores highScores = new HighScores(new int[] { 10, 30, 90, 30, 100, 20, 10, 0, 30, 40, 40, 70, 70 });
        assertArrayEquals(new Integer[] { 100, 90, 70 }, highScores.personalTopThree());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldReturnTopThreeSortedHighestToLowest() {
        HighScores highScores = new HighScores(new int[] { 20, 10, 30 });
        assertArrayEquals(new Integer[] { 30, 20, 10 }, highScores.personalTopThree());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldReturnPersonalTopWhenThereIsATie() {
        HighScores highScores = new HighScores(new int[] { 40, 20, 40, 30 });
        assertArrayEquals(new Integer[] { 40, 40, 30 }, highScores.personalTopThree());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldReturnPersonalTopWhenThereIsLessThanThreeScores() {
        HighScores highScores = new HighScores(new int[] { 30, 70 });
        assertArrayEquals(new Integer[] { 70, 30 }, highScores.personalTopThree());
    }

    @Test
    @Ignore("Remove to run test")
    public void shouldReturnPersonalTopWhenThereIsOnlyOneScore() {
        HighScores highScores = new HighScores(new int[] {40});
        assertArrayEquals(new Integer[] {40}, highScores.personalTopThree());
    }
}
