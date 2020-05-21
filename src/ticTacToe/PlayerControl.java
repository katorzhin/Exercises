package ticTacToe;

import static ticTacToe.App.*;

public class PlayerControl {

    public  void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = playerZero;
        } else {
            currentPlayer = playerX;
        }
    }
}
