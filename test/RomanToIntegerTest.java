import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void romanToInt1() {
        assertEquals(1804, RomanToInteger.romanToInt("MDCCCIV"));
    }

    @Test
    public void romanToInt2() {
        assertEquals(1905, RomanToInteger.romanToInt("MDCCCCV"));
    }

    @Test
    public void romanToInt3() {
        assertEquals(2000, RomanToInteger.romanToInt("MDCCCCC"));
    }

    @Test
    public void romanToInt4() {
        assertEquals(3500, RomanToInteger.romanToInt("MDDDDD"));
    }


    @Test
    public void romanToInt5() {
        assertEquals(6000, RomanToInteger.romanToInt("MMMMMM"));
    }


    @Test
    public void romanToInt6() {
        assertEquals(500, RomanToInteger.romanToInt("MDDDM"));
    }

}