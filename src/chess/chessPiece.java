package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class chessPiece extends Piece {
	
	private Color color;
	private int moveCount;

	public chessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
	
	public int getMoveCount() {
		return moveCount;
	}
	
	public void increseMoveCount (){
		moveCount++;
	}
	
	public void decreseMoveCount (){
		moveCount--;
	}

	public ChessPosition getChessPosition() {
		return ChessPosition.from(position);
	}

	protected boolean isThereOpponentPiece (Position position) {
		chessPiece p = (chessPiece)getBoard().piece(position);
		return p!=null && p.getColor() != color;
	}

}
