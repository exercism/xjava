import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Ignore;
import org.junit.Test;

public class HammingTest {

    @Test
    public void testNoDistanceBetweenEmptyStrands() {
        assertEquals(0, new Hamming("", "").getHammingDistance());
    }

    @Ignore("Remove to run test")
    @Test
    public void testNoDistanceBetweenShortIdenticalStrands() {
        assertEquals(0, new Hamming("A", "A").getHammingDistance());
    }

    @Ignore("Remove to run test")
    @Test
    public void testCompleteDistanceInSingleLetterDifferentStrands() {
        assertEquals(1, new Hamming("G", "T").getHammingDistance());
    }

    @Ignore("Remove to run test")
    @Test
    public void testDistanceInLongIdenticalStrands() {
        assertEquals(0, new Hamming("GGACTGAAATCTG", "GGACTGAAATCTG").getHammingDistance());
    }

    @Ignore("Remove to run test")
    @Test
    public void testDistanceInLongDifferentStrands() {
        assertEquals(9, new Hamming("GGACGGATTCTG", "AGGACGGATTCT").getHammingDistance());
    }

    @Ignore("Remove to run test")
    @Test
    public void testValidatesFirstStrandNotLonger() {
        IllegalArgumentException expected =
            assertThrows(
                IllegalArgumentException.class,
                () -> new Hamming("AATG", "AAA"));

        assertThat(expected)
            .hasMessage("leftStrand and rightStrand must be of equal length.");
    }

    @Ignore("Remove to run test")
    @Test
    public void testValidatesSecondStrandNotLonger() {
        IllegalArgumentException expected =
            assertThrows(
                IllegalArgumentException.class,
                () -> new Hamming("ATA", "AGTG"));

        assertThat(expected)
            .hasMessage("leftStrand and rightStrand must be of equal length.");
    }

}
