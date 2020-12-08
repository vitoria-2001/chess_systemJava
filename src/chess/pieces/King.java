package chess.pieces;

import boardgame.Board;
import chess.Color;
import chess.chessPiece;

public abstract class King extends chessPiece {

	public King(Board board, Color color) {
		super(board, color);
	}
	
	@Override
	public String toString () {
		return "K";
	}
	
	@Override
	public boolean[][] possibleMoves() {
				boolean [][] mat =new boolean [getBoard().getRows()][getBoard().getColumns()];
				return mat;
	}
}
