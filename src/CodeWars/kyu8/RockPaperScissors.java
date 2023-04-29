package CodeWars.kyu8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        } else if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("scissors") && p2.equals("rock")) {
            return "Player 2 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("paper")) {
            return "Player 2 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors")) {
            return "Player 2 won!";
        }

        return "";

    } public static String rps2(String p1, String p2) {
        return p1.equals(p2) ? "Draw!" : "Player " + ("scissorspaper paperrock rockscissors".contains(p1+p2)?1:2) + " won!";
    }


}
