package Conversions;

import java.util.*;

public class RomanToInteger {

    private static Map<Character, Integer> map = new HashMap<Character, Integer>() {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    /**
     * This function convert Roman number into Integer
     *
     * @param A Roman number string
     * @return integer
     */
    public static int romanToInt(String A) {

        char prev = ' ';

        int sum = 0;

        int newPrev = 0;
        for (int i = A.length() - 1; i >= 0; i--) {
            char c = A.charAt(i);

            if (prev != ' ') {
                // checking current Number greater then previous or not
                newPrev = map.get(prev) > newPrev ? map.get(prev) : newPrev;
            }

            int currentNum = map.get(c);

            // if current number greater then prev max previous then add
            if (currentNum >= newPrev) {
                sum += currentNum;
            } else {
                // subtract upcoming number until upcoming number not greater then prev max
                sum -= currentNum;
            }

            prev = c;
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = romanToInt("MDCCCIV");
        System.out.println(sum);
    }
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
} 
