package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessException;
import chess.ChessMatch;
import chess.ChessPosition;
import chess.chessPiece;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ChessMatch matc = new ChessMatch();
		
		while (true) {
		 try {
				UI.clearScreen();
				UI.printBoard(ChessMatch.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
				
				chessPiece capturedPiece = ChessMatch.perfomChessMove(source, target);
			 }
			catch (ChessException e) {
				System.out.println(e.getMessage());
				sc.nextLine();	
			}
		 	catch (InputMismatchException e) {
		 		System.out.println(e.getMessage());
				sc.nextLine();
		 	}
		}
		
	}

}
