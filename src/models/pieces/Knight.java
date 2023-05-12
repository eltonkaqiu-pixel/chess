package models.pieces;

import enums.Color;
import models.chess_set.Board;
import models.chess_set.Move;
import models.chess_set.Position;
import models.chess_set.Square;

import java.util.List;

public class Knight extends Piece{
    public Knight(Color color, boolean isActive) {
        super(color, isActive);
    }

    @Override
    public boolean isLegal(Board board, Square start, Square end) {
        Position startPosition = start.getPosition();
        Position endPosition = end.getPosition();

        int lFormX = Math.abs(startPosition.getX() - endPosition.getX());
        int lFormY = Math.abs(startPosition.getY() - endPosition.getY());

        //kontrollon nese eshte duke shku ne formen L
        if ((lFormX == 2 && lFormY == 1) || (lFormX == 1 && lFormY == 2)) {
            //kontrollon nese ne poziten ku dojm me qit figuren pozita eshte e zbrazet ose ka figure te kundershtarit
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

    @Override
    public String toString() {
        if (getColor()==Color.WHITE)
            return "♘"; // pawn test
        else return "♞";
            //test 2
    }
}
