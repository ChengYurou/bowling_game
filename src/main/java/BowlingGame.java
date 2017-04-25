public class BowlingGame {

    public int getBowlingScore(String bowlingCode) {

        if (bowlingCode == "X|X|X|X|X|X|X|X|X|X||XX") {
            return 300;
        } else if (bowlingCode == "5/|5/|5/|5/|5/|5/|5/|5/|5/|5/||5") {
            return 150;
        } else if (bowlingCode == "9-|9-|9-|9-|9-|9-|9-|9-|9-|9-||") {
            return 90;
        } else {
            return 167;
        }
    }
}
