package models.pieces;

import enums.Color;
import models.chess_set.Board;
import models.chess_set.Move;
import models.chess_set.Position;
import models.chess_set.Square;

import java.util.List;

public class King extends Piece {
    public King(Color color, boolean isActive) {
        super(color, isActive);
    }


    @Override
    public String toString() {
        if (getColor() == Color.WHITE)
            return "♔";
        else return "♚";
    }


    @Override
    public boolean isLegal(Board board, Square start, Square end) {
        Position startPosition = start.getPosition();
        Position endPosition = end.getPosition();
        int startX = startPosition.getX();
        int startY = startPosition.getY();
        int endX = endPosition.getX();
        int endY = endPosition.getY();

        int deltaX = Math.abs(startX - endX);
        int deltaY = Math.abs(startY - endY);

        // kontrollon nese levezija eshte 1 hapsire ne cdo ane
        if (deltaX <= 1 && deltaY <= 1) {
            // Check if the end position is empty or has an opponent's piece
            if (end.getPiece() == null || end.getPiece().getColor() != getColor()) {
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
