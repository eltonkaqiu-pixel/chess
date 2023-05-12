package exceptions;

import models.pieces.Piece;

public class MoveNotAllowedException extends Exception{
    private Piece piece;
    public MoveNotAllowedException(Piece piece) {
        this.piece = piece;
    }

    public MoveNotAllowedException(String message, Piece piece) {
        super("Kjo levizje nuk lejohet per kete figure");
        this.piece = piece;
    }

    public Piece getPiece(){
        return piece;
    }
}
