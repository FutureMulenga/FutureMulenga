import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeartRatesTests {
    // Test max heart rate
    @Test
    public void MaxHeartRateTest() {
        // arrange
        var person = new HeartRates();
        var expected = 198.00;

        // act
        person.setBirthDate(21, 06, 2001);
        var actual = person.getMaxHeartRate();
        // assert
        assertEquals(expected, actual);
    }

    // test for upper range
    @Test
    public void testUpperRange() {
        // arrange
        var person = new HeartRates();
        var expected = 168.30;
        // act

        person.setBirthDate(21, 06, 2001);
        var actual = person.getUpperRange();
        // assert
        assertEquals(expected, actual);
    }

    // test for lower range
    @Test
    public void testLowerRange() {
        // arrange
        var person = new HeartRates();
        var expected = 99.00;

        // act
        person.setBirthDate(21, 06, 2001);
        var actual = person.getLowerRange();
        // assert
        assertEquals(expected, actual);
    }
}
