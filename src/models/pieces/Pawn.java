package models.pieces;

import enums.Color;
import enums.PieceType;
import models.chess_set.Board;
import models.chess_set.Move;
import models.chess_set.Position;
import models.chess_set.Square;

import java.util.List;

public class Pawn extends Piece{
    private boolean hasMoved;

    public Pawn(Color color, boolean isActive) {
        super(color, isActive);
    }
    public void promote(PieceType newPieceType){
        //TODO:WORK TO DO...
    }



    @Override
    public String toString() {
        if (getColor()==Color.WHITE)
            return "♙";
        else return "♟";
    }

    @Override
    public boolean isLegal(Board board, Square start, Square end) {
        Position startPosition = start.getPosition();
        Position endPosition = end.getPosition();
        int startX = startPosition.getX();
        int startY = startPosition.getY();
        int endX = endPosition.getX();
        int endY = endPosition.getY();
        if (!hasMoved){
            if(Math.abs(startPosition.getX()-endPosition.getX()) == 2 && startPosition.getY() == endPosition.getY()){
                hasMoved = true;
                return end.getPiece() == null;
            }
        }

        if(Math.abs(startPosition.getX()-endPosition.getX()) == 1 && startPosition.getY() == endPosition.getY()){
            return end.getPiece() == null;
        }

        if (Math.abs(startPosition.getX()-endPosition.getX()) == 1 && Math.abs(startPosition.getY() - endPosition.getY()) == 1){
            if (end.getPiece() != null && end.getPiece().getColor().equals(this.getColor())){
                return true;
            }
        }

        return false;
    }

    @Override
    public List<Move> getLegalMoves(Board board, Square start) {
        return null;
    }
}
