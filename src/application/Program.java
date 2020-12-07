package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPosition;
import chess.chessPiece;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ChessMatch matc = new ChessMatch();
		
		while (true) {
			UI.printBoard(ChessMatch.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			chessPiece capturedPiece = ChessMatch.perfomChessMove(source, target);
		}
		
	}

}
