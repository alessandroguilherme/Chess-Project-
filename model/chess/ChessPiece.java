package model.chess;

import model.boardGame.Board;
import model.boardGame.Piece;

public class ChessPiece extends Piece {

    private Color color;

    public ChessPiece() {
    }

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    

    

    

}
