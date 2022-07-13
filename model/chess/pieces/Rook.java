package model.chess.pieces;

import model.boardGame.Board;
import model.chess.ChessPiece;
import model.chess.Color;

public class Rook extends ChessPiece {

    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

}
