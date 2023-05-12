package interfaces;

import exceptions.BoardOutOfBoundsException;
import models.chess_set.Board;
import models.chess_set.Move;
import models.chess_set.Square;

import java.util.List;

public interface RuleSet {
    boolean isLegal(Board board, Square start, Square end) throws BoardOutOfBoundsException;

    List<Move> getLegalMoves(Board board, Square start);

}
