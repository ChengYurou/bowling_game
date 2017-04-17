import org.junit.Test;

import static org.junit.Assert.*;

public class BowlingGameTest {

    @Test
    public void test_all_strike() throws Exception {
        String bowlingCode = "X|X|X|X|X|X|X|X|X|X||XX";           //300
        assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 300);
    }

    @Test
    public void test_second_spare() throws Exception {
        String bowlingCode = "5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5";  //150
        assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 150);
    }

    @Test
    public void test_second_miss() throws Exception {
        String bowlingCode = "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||";   //90
        assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 90);

    }

    @Test
    public void test_other_situation() throws Exception {
        String bowlingCode = "X|7/|9-|X|-8|8/|-6|X|X|X||81";      //167
        assertEquals(new BowlingGame().getBowlingScore(bowlingCode), 167);

    }
}

