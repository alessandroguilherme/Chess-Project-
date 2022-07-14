package model.chess;

import model.boardGame.Position;

public class ChessPosition {

    private Character column;
    private Integer row;

    public ChessPosition() {
    }

    public ChessPosition(Character column, Integer row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8) {
            throw new ChessException("ERROR INSTANTIATING CHESSPOSITION. VALID VALUES ARE FROM 'a1' TO 'h8'.");
        }
        this.column = column;
        this.row = row;
    }

    public Integer getRow() {
        return row;
    }

    public Character getColumn() {
        return column;
    }

    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }

    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char) ('a' - position.getColumn()), 8 - position.getRow());
    }

    public String toString() {
        return "" + column + row;
    }

}
