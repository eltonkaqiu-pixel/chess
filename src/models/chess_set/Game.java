package models.chess_set;

import exceptions.BoardOutOfBoundsException;
import models.pieces.Piece;

public class Game {
    //TODO: makeMove method
    public static void main(String[] args) throws BoardOutOfBoundsException {
        Board board = new Board();
        board.initializeBoard();
        board.print();
        Square start = board.getSquare(1, 0); // e morrmi poziten cilen kem me morr figuren
        Square end = board.getSquare(3, 0); // ku po dojm me livrit

        System.out.println("Levizjae pare");

        Move firstMove = new Move(null, start, end); // e krijojm levizjen
        Piece pieceMoved = firstMove.getStart().getPiece(); // e morrmi figuren nqet rast piunin
        if (pieceMoved.isLegal(board, start, end)) { // e kshyrmi a munet me leviz
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece()); // nese po e qojm nsquare end
            firstMove.getStart().setPiece(null); // e fshijm prej pozites ku osht kan
        }

        board.print(); // e printojm boardin


        System.out.println("Levizja e dyte");
        start = board.getSquare(1, 3);
        end = board.getSquare(2, 3);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
        System.out.println("Levizja e trete");
        start = board.getSquare(0, 2);
        end = board.getSquare(2, 4);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();

        System.out.println("Levizja e katert");
        start = board.getSquare(2, 4);
        end = board.getSquare(5, 1);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
        System.out.println("Levizja e pest");
        start = board.getSquare(0, 6);
        end = board.getSquare(2, 5);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();

        System.out.println("Levizja e gjashte");
        start = board.getSquare(1, 2);
        end = board.getSquare(2, 2);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
        System.out.println("Levizja e shtate");
        start = board.getSquare(1, 4);
        end = board.getSquare(2, 4);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
        System.out.println("Levizja e tete");
        start = board.getSquare(0, 4);
        end = board.getSquare(1, 3);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
        System.out.println("Levizja e nente");
        start = board.getSquare(1, 3);
        end = board.getSquare(1, 4);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();

        System.out.println("Levizja e 10-nuk mund te levize");
        start = board.getSquare(6, 1);
        end = board.getSquare(5, 1);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
        System.out.println("Levizja e 11-te merre nje figure");
        start = board.getSquare(6, 2);
        end = board.getSquare(5, 1);
        firstMove = new Move(null, start, end);
        pieceMoved = firstMove.getStart().getPiece();
        if (pieceMoved.isLegal(board, start, end)) {
            firstMove.getEnd().setPiece(firstMove.getStart().getPiece());
            firstMove.getStart().setPiece(null);
        }

        board.print();
    }
}
