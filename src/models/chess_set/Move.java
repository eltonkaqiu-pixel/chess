package models.chess_set;

import models.pieces.Piece;

public class Move {    private Player player;
    private Square start;
    private Square end;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove;

    public Move(Player player, Square start, Square end) {
        this.player = player;
        this.start = start;
        this.end = end;
    }


    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Square getStart() {
        return start;
    }

    public void setStart(Square start) {
        this.start = start;
    }

    public Square getEnd() {
        return end;
    }

    public void setEnd(Square end) {
        this.end = end;
    }

    public Piece getPieceMoved() {
        return pieceMoved;
    }

    public void setPieceMoved(Piece pieceMoved) {
        this.pieceMoved = pieceMoved;
    }

    public Piece getPieceKilled() {
        return pieceKilled;
    }

    public void setPieceKilled(Piece pieceKilled) {
        this.pieceKilled = pieceKilled;
    }

    public boolean isCastlingMove() {
        return castlingMove;
    }

    public void setCastlingMove(boolean castlingMove) {
        this.castlingMove = castlingMove;
    }
}
