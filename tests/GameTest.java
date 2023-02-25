import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GameTest {
    @Test
    void isMoveValidTest3() {
        ChessGame game = new ChessGame();
        game.play();
        assertTrue(game.checkMate(game.getBoard().getWhiteKing()));
    }


}
