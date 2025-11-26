import java.util.*;;

public class GameEngine {

public ArrayList<player> players;

/***
 * We are using the standard Prisoner's Dilemma payoff matrix:
 * but with more dramatic scoring to emphasize the dilemma.
 * where if both cooperate, both get 3 points.
 * if one defects while the other cooperates, the defector gets 4 points and the cooperator gets -1 point.
 * if both defect, both get -2 points.
 * @param a
 * @param b
 * @return
 */
public int[] getPayoff(Move a, Move b) {
    if (a == Move.COOPERATE && b == Move.COOPERATE) {
        return new int[] {3, 3};
    }
    if (a == Move.COOPERATE && b == Move.DEFECT) {
        return new int[] {-1, 4};
    }
    if (a == Move.DEFECT && b == Move.COOPERATE) {
        return new int[] {4, -1};
    }
    // DEFECT, DEFECT
    return new int[] {-2, -2};
}

public RoundResult playRound(strategy player1, strategy player2) {
    Move move1 = player1.makeMove();
    Move move2 = player2.makeMove();
    
    int[] payoff = getPayoff(move1, move2);
    
    RoundResult result = new RoundResult();
    // You can add more details to RoundResult if needed
    return result;
}

}
