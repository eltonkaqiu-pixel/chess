package models.chess_set;

import models.pieces.Piece;

public class Square {
    private Piece piece;
    private Position position;

    public Square(Piece piece, Position position) {
        this.piece = piece;
        this.position = position;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public String toString() {
        if (piece == null){

            return (position.getX() + position.getY()) % 2 == 0 ? "⬜" : "⬛";
        }
        return piece.toString();
    }
}
