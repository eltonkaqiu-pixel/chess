package models.pieces;

import enums.Color;
import exceptions.BoardOutOfBoundsException;
import models.chess_set.Board;
import models.chess_set.Move;
import models.chess_set.Position;
import models.chess_set.Square;

import java.util.List;

public class Bishop extends Piece{


    public Bishop(Color color, boolean isActive) {
        super(color, isActive);
    }


    @Override
    public String toString() {
        if (getColor() == Color.WHITE)
            return "♗";
        else return "♝";

    }

    @Override
    public boolean isLegal(Board board, Square start, Square end) throws BoardOutOfBoundsException {
        Position startPosition = start.getPosition();
        Position endPosition = end.getPosition();
        int startX = startPosition.getX();
        int startY = startPosition.getY();
        int endX = endPosition.getX();
        int endY = endPosition.getY();

        //kjo kontrollon nese positen ku dojm me qit figuren eshte ne diagonale me poziten fillestare
        if (Math.abs(startX - endX) != Math.abs(startY - endY)) {
            return false;
        }

        int xDirection = (endX - startX) / Math.abs(endX - startX);
        int yDirection = (endY - startY) / Math.abs(endY - startY);

        //kontrollon nese kemi diqka ne rruge
        for (int i = 1; i < Math.abs(startX - endX); i++) {
            int currentX = startX + (i * xDirection);
            int currentY = startY + (i * yDirection);
            if (board.getSquare(currentX, currentY).getPiece() != null) {
                return false;
            }
        }
        //kontrollon nese ne poziten ku dojm me qit figuren pozita eshte e zbrazet ose ka figure te kundershtarit
        if (end.getPiece() == null || end.getPiece().getColor() != getColor()) {
            return true;
        }

        return false;
    }

    @Override
    public List<Move> getLegalMoves(Board board, Square start) {
        return null;
    }
}
