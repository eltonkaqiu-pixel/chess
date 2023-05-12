package exceptions;

public class BoardOutOfBoundsException extends Exception{
    public BoardOutOfBoundsException() {
        super();
    }

    public BoardOutOfBoundsException(String message) {
        super("Board out bounds, please choose another position!!");
    }
}
