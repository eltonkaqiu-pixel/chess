package models.chess_set;

import enums.Color;
import exceptions.BoardOutOfBoundsException;
import models.pieces.*;
public class Board {

    private Square[][] squares;

    public Board() {
        squares = new Square[8][8];
    }


    public Square getSquare(int x, int y) throws BoardOutOfBoundsException {
        if (x < 0 || x > 7 || y < 0 || y > 7) {
            throw new BoardOutOfBoundsException("Luani brenda kornizave te boardit!!");
        }
        return squares[x][y];
    }

    public void initializeBoard() {
        for (int i = 0; i < 8; i++) {
            squares[1][i] = new Square(new Pawn(Color.WHITE, true), new Position(1, i));
        }
        for (int i = 0; i < 8; i++) {
            squares[6][i] = new Square(new Pawn(Color.BLACK, true), new Position(6, i));
        }
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new Square(null, new Position(i, j));
            }
        }
        squares[0][0]=new Square(new Rook(Color.WHITE,true),new Position(0,0));
        squares[0][7]=new Square(new Rook(Color.WHITE,true),new Position(0,7));
        squares[7][0]=new Square(new Rook(Color.BLACK,true),new Position(7,0));
        squares[7][7]=new Square(new Rook(Color.BLACK,true),new Position(7,7));
        squares[0][1]=new Square(new Knight(Color.WHITE,true),new Position(0,1));
        squares[0][6]=new Square(new Knight(Color.WHITE,true),new Position(0,6));
        squares[7][6]=new Square(new Knight(Color.BLACK,true),new Position(7,6));
        squares[7][1]=new Square(new Knight(Color.BLACK,true),new Position(7,0));
        squares[7][2]=new Square(new Bishop(Color.BLACK,true),new Position(7,2));
        squares[7][5]=new Square(new Bishop(Color.BLACK,true),new Position(7,5));
        squares[0][2]=new Square(new Bishop(Color.WHITE,true),new Position(0,2));
        squares[0][5]=new Square(new Bishop(Color.WHITE,true),new Position(0,5));
        squares[0][4]=new Square(new Queen(Color.WHITE,true),new Position(0,4));
        squares[7][4]=new Square(new Queen(Color.BLACK,true),new Position(7,4));
        squares[0][3]=new Square(new King(Color.WHITE,true),new Position(0,3));
        squares[7][3]=new Square(new King(Color.BLACK,true),new Position(7,3));
    }

    public void print(){
        for (Square[] squareRow : squares){
            System.out.print(" | ");
            for (Square square : squareRow){
                System.out.printf("%s | ", square);
            }

            System.out.println();
        }
    }
}
