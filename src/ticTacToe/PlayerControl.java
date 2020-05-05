package ticTacToe;

import static ticTacToe.App.currentPlayer;

public class PlayerControl {

    public  void changePlayer() {
        if (currentPlayer == 'X') {
            currentPlayer = 'Y';
        } else {
            currentPlayer = 'X';
        }
    }
}
