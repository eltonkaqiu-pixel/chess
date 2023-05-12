package exceptions;

public class PieceNotFoundException extends Exception{
    public PieceNotFoundException() {
        super();
    }

    public PieceNotFoundException(String message) {
        super("Piece not found, please choose another square!");
    }
}
