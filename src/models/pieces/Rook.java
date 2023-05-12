package models.pieces;

import enums.Color;
import exceptions.BoardOutOfBoundsException;
import models.chess_set.Board;
import models.chess_set.Move;
import models.chess_set.Position;
import models.chess_set.Square;

import java.util.List;

public class Rook extends Piece{
    public Rook(Color color, boolean isActive) {
        super(color, isActive);
    }


    @Override
    public String toString() {
        if (getColor() == Color.WHITE)
            return "♖";
        else return "♜";
    }

    @Override
    public boolean isLegal(Board board, Square start, Square end) throws BoardOutOfBoundsException {
        Position startPosition = start.getPosition();
        Position endPosition = end.getPosition();
        int startX = startPosition.getX();
        int startY = startPosition.getY();
        int endX = endPosition.getX();
        int endY = endPosition.getY();

        int deltaX = Math.abs(startX - endX);
        int deltaY = Math.abs(startY - endY);

        // Check if the move is along a row or column
        if ((startX == endX || startY == endY) && deltaX != 0 && deltaY != 0) {
            int xDirection = (endX - startX) / deltaX;
            int yDirection = (endY - startY) / deltaY;

            // Check if there are any pieces in the path
            for (int i = 1; i < Math.max(deltaX, deltaY); i++) {
                int currentX = startX + (i * xDirection);
                int currentY = startY + (i * yDirection);
                if (board.getSquare(currentX, currentY).getPiece() != null) {
                    return false;
                }
            }

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
