package model.chess.pieces;

import model.boardGame.Board;
import model.chess.ChessPiece;
import model.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

}
