package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch matc = new ChessMatch();
		UI.printBoard(matc.getPieces());
	}

}
