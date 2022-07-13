package model.boardGame;

public class Board {

    private Integer rows;
    private Integer columns;
    private Piece[][] pieces;

    public Board() {
    }

    public Board(Integer rows, Integer columns) {
        if (rows < 1 || columns < 1) {
            throw new BoardException("ERROR CREATING BOARD: THERE MUST BE AT LEAST 1 ROW AND 1 COLUMN");
        }
        this.rows = rows;
        this.columns = columns;
        this.pieces = new Piece[rows][columns];

    }

    public Integer getRows() {
        return rows;
    }

    public Integer getColumns() {
        return columns;
    }

    public Piece piece(int row, int column) {

        if (!positionExists(row, column)) {
            throw new BoardException("POSITION NOT ON THE BOARD");
        }
        return pieces[row][column];

    }

    public Piece piece(Position position) {

        if (!positionExists(position)) {
            throw new BoardException("POSITION NOT ON THE BOARD");
        }
        return pieces[position.getRow()][position.getColumn()];

    }

    public void placePiece(Piece piece, Position position) {

        if (thereAPiece(position)) {
            throw new BoardException("THERE IS ALREADY A PIECE ON POSITION");
        }
        pieces[position.getRow()][position.getColumn()] = piece;
        piece.position = position;
    }

    private boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;

    }

    public boolean positionExists(Position position) {
        return positionExists(position.getRow(), position.getColumn());

    }

    public boolean thereAPiece(Position position) {

        if (!positionExists(position)) {
            throw new BoardException("POSITION NOT ON THE BOARD");
        }
        return piece(position) != null;

    }

}
