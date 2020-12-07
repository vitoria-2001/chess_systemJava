package chess;

import boardgame.Board;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	
	private Board board;
	
	public ChessMatch () {
		board = new Board (8,8);
		InitialSetup();
		
	}
	
	public chessPiece [][] getPieces() {
		chessPiece[][] mat = new chessPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
				for (int j=0; j<board.getColumns();j++) {
					mat [i][j]= (chessPiece) board.piece(i,j);
				}
		}
	return mat;	
	}
	
	public void placeNewPiece(char column, int row, chessPiece piece) {
		board.PlacePiece(piece, new ChessPosition(column,row).toPosition());
	}
	
	
	public void InitialSetup () {
		 placeNewPiece('b', 6, new Rook(board, Color.WHITE));
		 placeNewPiece('e', 8, new King(board, Color.BLACK));
		 placeNewPiece('e', 1,new King(board, Color.WHITE));
	}
	
	

}
